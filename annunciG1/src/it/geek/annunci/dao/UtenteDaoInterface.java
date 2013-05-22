package it.geek.annunci.dao;

import it.geek.annunci.model.Utente;

public interface UtenteDaoInterface {
	
	public Utente findById(String username);
	public boolean inserimento(Utente u);
}
