package it.geek.annunci.controller;

import it.geek.annunci.form.LoginForm;
import it.geek.annunci.model.Utente;
import it.geek.annunci.service.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class LoginAction extends DispatchAction {

	Logger log = Logger.getLogger(LoginAction.class);

	public ActionForward login(ActionMapping mapping, 
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
			request.setAttribute("messaggio", "utente non trovato");
			forwardName="failure";
		}else if(!u.getPassword().equals(login.getPassword())){
			request.setAttribute("messaggio", "password non valida");
			forwardName="failure";
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("utenteInSessione", login);
			forwardName="success";
		}

		return mapping.findForward(forwardName);
	}

	public ActionForward areaPrivata(ActionMapping mapping, 
			ActionForm form,
			HttpServletRequest request, 
			HttpServletResponse response)
					throws Exception{

		if("utenteInSessione"==null){
			return mapping.findForward("failure");
		}else{
			return mapping.findForward("success");		

		}
	}
}