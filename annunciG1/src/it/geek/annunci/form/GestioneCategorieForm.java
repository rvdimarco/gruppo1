package it.geek.annunci.form;

import it.geek.annunci.util.CollezioniFactory;

import java.util.List;

import org.apache.struts.action.ActionForm;
import org.apache.struts.util.LabelValueBean;

public class GestioneCategorieForm extends ActionForm{
	
	private int id;
	private String descrizione;
	private List<LabelValueBean> listaCategorie;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public List<LabelValueBean> getListaCategorie() {
		listaCategorie = CollezioniFactory.getCollezioni().getOptions("categorie");
		return listaCategorie;
	}
	public void setListaCategorie(List<LabelValueBean> listaCategorie) {
		this.listaCategorie = listaCategorie;
	}

}
