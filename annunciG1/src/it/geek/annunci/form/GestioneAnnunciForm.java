package it.geek.annunci.form;

import it.geek.annunci.model.Categoria;
import it.geek.annunci.model.Prodotto;
import it.geek.annunci.util.Collezioni;
import it.geek.annunci.util.CollezioniFactory;

import java.util.Date;
import java.util.List;

import org.apache.struts.action.ActionForm;
import org.apache.struts.util.LabelValueBean;

public class GestioneAnnunciForm extends ActionForm {
	
	private int id;
	private String descrizione;
	private String dataInserimento;
	private int visite;
	private int stato;
	private Categoria categoria = new Categoria();
	private Prodotto prodotto = new Prodotto();
	private int owner;
	private String method;
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
	public String getDataInserimento() {
		return dataInserimento;
	}
	public void setDataInserimento(String dataInserimento) {
		this.dataInserimento = dataInserimento;
	}
	public int getVisite() {
		return visite;
	}
	public void setVisite(int visite) {
		this.visite = visite;
	}
	public int getStato() {
		return stato;
	}
	public void setStato(int stato) {
		this.stato = stato;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	public int getOwner() {
		return owner;
	}
	public void setOwner(int owner) {
		this.owner = owner;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public List<LabelValueBean> getListaCategorie() {
		listaCategorie = CollezioniFactory.getCollezioni().getOptions("categorie");
		return listaCategorie;
	}
	public void setListaCategorie(List<LabelValueBean> listaCategorie) {
		this.listaCategorie = listaCategorie;
	}
}
