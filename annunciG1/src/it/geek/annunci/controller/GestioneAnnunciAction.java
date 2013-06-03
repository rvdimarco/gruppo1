package it.geek.annunci.controller;

import it.geek.annunci.form.GestioneAnnunciForm;
import it.geek.annunci.model.Annuncio;
import it.geek.annunci.service.ServiceFactory;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
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
		GestioneAnnunciForm annuncioForm = (GestioneAnnunciForm) form;
		log.debug("############ annuncioForm: "+annuncioForm);
		Annuncio annuncio = new Annuncio();
		
		java.util.Date defaultValue = null;
		DateConverter dateConverter = new DateConverter(defaultValue);
		dateConverter.setPattern("dd/MM/yyyy");
		ConvertUtils.register(dateConverter, java.util.Date.class);
		
		BeanUtils.copyProperties(annuncio, annuncioForm);
		
		log.debug("Converter da String a java.util.Date registrato");
		
		List<Annuncio> listaAnnunci = ServiceFactory.getAnnuncioService().getAll();
		request.setAttribute("listaAnnunci", listaAnnunci);	
		
		List<Annuncio> listaAnn = ServiceFactory.getAnnuncioService().getByExample(annuncio);
		request.setAttribute("listaAnn", listaAnn);
		
		
		
		return mapping.findForward("lista");
	}

}
