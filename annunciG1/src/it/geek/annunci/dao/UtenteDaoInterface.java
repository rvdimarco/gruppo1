package it.geek.annunci.dao;

import it.geek.annunci.model.Utente;

public interface UtenteDaoInterface {
	
	public Utente findById(int id);
	public boolean inserimento(Utente u);
}
