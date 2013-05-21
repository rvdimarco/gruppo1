package it.geek.annunci.model;

import java.io.Serializable;

public class Categoria implements Serializable{
	
	private int idCategoria;
	private String descrizione;
	
	
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", descrizione="
				+ descrizione + "]";
	}
	
}
