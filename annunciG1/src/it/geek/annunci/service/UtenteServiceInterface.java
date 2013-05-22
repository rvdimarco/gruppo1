package it.geek.annunci.service;

import it.geek.annunci.model.Utente;

public interface UtenteServiceInterface{
	
	public Utente get(String username);
	public boolean create(Utente u);
	


}
