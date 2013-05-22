package it.geek.annunci.controller;

import java.lang.reflect.InvocationTargetException;

import it.geek.annunci.form.UtenteForm;
import it.geek.annunci.model.Utente;
import it.geek.annunci.service.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class GestioneUtenteAction extends DispatchAction{


	public ActionForward inserimento(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response)
					throws Exception{

		return mapping.findForward("registrazione");
	}

	public ActionForward eseguiInserimento(ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response)
					throws Exception{

		UtenteForm utenteForm = (UtenteForm)form;


		Utente u = new Utente(); 

		try {
			BeanUtils.copyProperties(u, utenteForm);
		} catch (IllegalAccessException e) {
			log.error(e);
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			log.error(e);
			e.printStackTrace();
		}

		boolean inserito = ServiceFactory.getUtenteService().create(u);


		if(inserito){
			Utente uSession = ServiceFactory.getUtenteService().get(u.getId());

			HttpSession session = request.getSession();
			session.setAttribute("utenteInSessione", uSession);

			return mapping.findForward("success");
		}else{
			return mapping.findForward("failure");
		}
	}
}