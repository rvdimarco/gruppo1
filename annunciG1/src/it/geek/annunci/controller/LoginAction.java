package it.geek.annunci.controller;

import java.util.List;

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
		Utente uex = new Utente();
		uex.setUsername(login.getUsername());
		
		List<Utente> list = ServiceFactory.getUtenteService().getByExample(uex);
		
		if(list.isEmpty()){
			request.setAttribute("messaggio", "utente non trovato");
			forwardName="failure";
		}else if(list.size()>1){
			request.setAttribute("messaggio", "problema tecnico: ho estratto "+list.size()+" utenti!");
			forwardName="failure";
		}else if(!list.get(0).getPassword().equals(list.get(0).getPassword())){
			request.setAttribute("messaggio", "password non valida");
			forwardName="failure";
		}else{
			log.debug("list.size: "+list.size());
			HttpSession session = request.getSession();
			session.setAttribute("utenteInSessione", list.get(0));
			forwardName="success";
		}

		return mapping.findForward(forwardName);
	}

	public ActionForward areaPrivata(ActionMapping mapping, 
			ActionForm form,
			HttpServletRequest request, 
			HttpServletResponse response)
					throws Exception{

		HttpSession session = request.getSession();
		Utente u = (Utente) session.getAttribute("utenteInSessione");
		log.debug("Utente in sessione "+u);
		if(u == null){
			return mapping.findForward("failure");
		}else{
			return mapping.findForward("success");		

		}
	}
}