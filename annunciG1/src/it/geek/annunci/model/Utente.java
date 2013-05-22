package it.geek.annunci.model;

import java.io.Serializable;

public class Utente implements Serializable{

	private int id;
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private Ruolo ruolo;
	private int stato;
	private int creditoResiduo;
	
	
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
	public Ruolo getRuolo() {
		return ruolo;
	}
	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
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
	@Override
	public String toString() {
		return "Utente [id=" + id + ", username=" + username + ", password="
				+ password + ", nome=" + nome + ", cognome=" + cognome
				+ ", ruolo=" + ruolo + ", stato=" + stato + ", creditoResiduo="
				+ creditoResiduo + "]";
	}
	
}