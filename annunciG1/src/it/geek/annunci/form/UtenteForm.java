package it.geek.annunci.form;

import java.util.List;

import it.geek.annunci.model.Ruolo;
import it.geek.annunci.util.Collezioni;
import it.geek.annunci.util.CollezioniFactory;

import org.apache.struts.action.ActionForm;
import org.apache.struts.util.LabelValueBean;

public class UtenteForm extends ActionForm{
	
	private int id;
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private int idRuolo;
	private int stato;
	private int creditoResiduo;
	private Ruolo ruolo = new Ruolo();
	private List<LabelValueBean> lRuolo;
	private List<LabelValueBean> lUtente;
	private List<LabelValueBean> lAnnunci;
	
	
	public List<LabelValueBean> getlAnnunci() {
		lAnnunci = CollezioniFactory.getCollezioni().getOptions("annunci");
		return lAnnunci;
	}
	public void setlAnnunci(List<LabelValueBean> lAnnunci) {
		this.lAnnunci = lAnnunci;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getIdRuolo() {
		return idRuolo;
	}
	public void setIdRuolo(int idRuolo) {
		this.idRuolo = idRuolo;
	}
	public int getStato() {
		return stato;
	}
	public void setStato(int stato) {
		this.stato = stato;
	}
	public int getCreditoResiduo() {
		return creditoResiduo;
	}
	public void setCreditoResiduo(int creditoResiduo) {
		this.creditoResiduo = creditoResiduo;
	}
	public Ruolo getRuolo() {
		return ruolo;
	}
	public List<LabelValueBean> getlUtente() {
		lUtente = CollezioniFactory.getCollezioni().getOptions("utenti");
		return lUtente;
	}
	public void setlUtente(List<LabelValueBean> lUtente) {
		this.lUtente = lUtente;
	}
	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}
	public List<LabelValueBean> getlRuolo() {
		lRuolo = CollezioniFactory.getCollezioni().getOptions("ruoli");
		return lRuolo;
	}
		
	public void setlRuolo(List<LabelValueBean> lRuolo) {
		this.lRuolo = lRuolo;
	}
}
