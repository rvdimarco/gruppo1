package it.geek.annunci.form;

import it.geek.annunci.model.Prodotto;
import it.geek.annunci.util.CollezioniFactory;

import java.util.List;

import org.apache.struts.action.ActionForm;
import org.apache.struts.util.LabelValueBean;

public class GestioneAnnunciForm extends ActionForm {
	
	private int id;
	private String descrizione;
	private String dataInserimento;
	private int visite;
	private int stato = 1;
	private int idCategoria;
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
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int categoria) {
		this.idCategoria = categoria;
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
	@Override
	public String toString() {
		return "GestioneAnnunciForm [id=" + id + ", descrizione=" + descrizione
				+ ", dataInserimento=" + dataInserimento + ", visite=" + visite
				+ ", stato=" + stato + ", categoria=" + idCategoria
				+ ", prodotto=" + prodotto + ", owner=" + owner + ", method="
				+ method + ", listaCategorie=" + listaCategorie + "]";
	}
}
