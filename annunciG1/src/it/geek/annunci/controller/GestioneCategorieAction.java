package it.geek.annunci.controller;

import it.geek.annunci.model.Categoria;
import it.geek.annunci.service.ServiceFactory;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class GestioneCategorieAction extends DispatchAction {
	
	public ActionForward visualizza(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception{
		
		List<Categoria> listaCategorie = ServiceFactory.getCategorieService().getAll();
		request.setAttribute("listaCategorie", listaCategorie);
		
		return mapping.findForward("success");
		
	}

}
