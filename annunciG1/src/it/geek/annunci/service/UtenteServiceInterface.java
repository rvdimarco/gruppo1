package it.geek.annunci.service;

import java.util.List;

import it.geek.annunci.model.Utente;

public interface UtenteServiceInterface{
	
	public Utente get(int id);
	public boolean create(Utente u);
	public List<Utente> all();
	public List<Utente> getByExample(Utente u);

}
