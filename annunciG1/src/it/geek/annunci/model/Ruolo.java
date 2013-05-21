package it.geek.annunci.model;

import java.io.Serializable;

public class Ruolo implements Serializable{
	
	private int id;
	private String descrizione;
	
	
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
	@Override
	public String toString() {
		return "Ruolo [id=" + id + ", descrizione=" + descrizione + "]";
	}
	
}
