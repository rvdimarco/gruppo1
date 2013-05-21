package it.geek.annunci.controller;

import it.geek.annunci.form.LoginForm;
import it.geek.annunci.model.Utente;
import it.geek.annunci.service.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {
	
	Logger log = Logger.getLogger(LoginAction.class);
	
	public ActionForward execute(ActionMapping mapping, 
								 ActionForm form,
								 HttpServletRequest request, 
								 HttpServletResponse response)
								 throws Exception{
		
		
		log.debug("login in corso ..");
		
		String forwardName = "";

		LoginForm login = (LoginForm) form;
		log.debug("form: "+login);
		
		Utente u = ServiceFactory.getUtenteService().get(login.getUsername());
		
		if(u==null){
			forwardName="failure";
		}else if(!u.getPassword().equals(login.getPassword())){
			forwardName="failure";
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("utenteInSessione", login);
			forwardName="success";
		}
		
		return mapping.findForward(forwardName);
	}
}
