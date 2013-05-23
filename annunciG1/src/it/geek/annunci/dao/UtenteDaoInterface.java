package it.geek.annunci.dao;

import java.util.List;

import it.geek.annunci.model.Utente;

public interface UtenteDaoInterface {
	
	public Utente findById(int id);
	public boolean inserimento(Utente u);
	public List<Utente> findAll();
	public List<Utente> findByExample(Utente u);
}
