package it.geek.annunci.service;

import it.geek.annunci.model.Utente;

public interface UtenteServiceInterface{
	
	public Utente get(String id);
	public boolean create(Utente u);


}
