package it.geek.annunci.form;

import it.geek.annunci.util.Collezioni;
import it.geek.annunci.util.CollezioniFactory;

import java.util.Date;
import java.util.List;

import org.apache.struts.action.ActionForm;
import org.apache.struts.util.LabelValueBean;

public class GestioneAnnunciForm extends ActionForm {
	
	private int id;
	private String descrizione;
	private Date dataInserimento;
	private int visite;
	private int stato;
	private int idCategoria;
	private int idProdotto;
	private int owner;
	private String method;
	private List<LabelValueBean> listaAnnunci;
	
	
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
	public Date getDataInserimento() {
		return dataInserimento;
	}
	public void setDataInserimento(Date dataInserimento) {
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
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public int getIdProdotto() {
		return idProdotto;
	}
	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
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
	public List<LabelValueBean> getListaAnnunci() {
		listaAnnunci = CollezioniFactory.getCollezioni().getOptions("annunci");
		return listaAnnunci;

	}
	public void setListaAnnunci(List<LabelValueBean> listaAnnunci) {
		this.listaAnnunci = listaAnnunci;
	}
}
