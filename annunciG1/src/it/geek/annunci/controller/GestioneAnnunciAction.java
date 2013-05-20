package it.geek.annunci.controller;

import it.geek.annunci.model.Annuncio;
import it.geek.annunci.service.ServiceFactory;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class GestioneAnnunciAction extends DispatchAction {
	
private static Logger log = Logger.getLogger(GestioneAnnunciAction.class);
	
	public GestioneAnnunciAction(){
		
	}
	
	public ActionForward search(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception{
		
		log.info("metodo search...");
		
		List<Annuncio> listaAnnunci = ServiceFactory.getAnnuncioService().getAll();
		request.setAttribute("listaAnnunci", listaAnnunci);	
		
		return mapping.findForward("lista");
	}

}
