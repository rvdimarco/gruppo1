package it.geek.annunci.model;

import java.io.Serializable;
import java.util.Date;

public class Prodotto implements Serializable{
	
	private int idProdotto;
	private String descrizione;
	private int prezzo;
	private Date dataAcquisto;
	
	
	public int getIdProdotto() {
		return idProdotto;
	}
	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	public Date getDataAcquisto() {
		return dataAcquisto;
	}
	public void setDataAcquisto(Date dataAcquisto) {
		this.dataAcquisto = dataAcquisto;
	}
	@Override
	public String toString() {
		return "Prodotto [idProdotto=" + idProdotto + ", descrizione="
				+ descrizione + ", prezzo=" + prezzo + ", dataAcquisto="
				+ dataAcquisto + "]";
	}
	
}	
	