package it.geek.annunci.service;

import java.util.List;

import org.apache.log4j.Logger;

import it.geek.annunci.dao.UtenteDaoInterface;
import it.geek.annunci.model.Annuncio;
import it.geek.annunci.model.Utente;

public class UtenteService implements UtenteServiceInterface{

	private static Logger log = Logger.getLogger(UtenteService.class);

	private UtenteDaoInterface utenteDAO;


	public void setUtenteDAO(UtenteDaoInterface utenteDAO) {
		this.utenteDAO = utenteDAO;
	}

	Utente utente = null;
	boolean ret = false;
	List<Utente> listaUtente = null;
	
	@Override
	public Utente get(int id) {
		
		utente = utenteDAO.findById(id);

		return utente;
	}
	
	public boolean create(Utente u) {
		
		ret = utenteDAO.inserimento(u);
		return ret;

	}
	
	public List<Utente> all(){
		
		listaUtente = utenteDAO.findAll();
		return listaUtente;
		
	}
	
	public List<Utente> getByExample(Utente u) {
		
		listaUtente = utenteDAO.findByExample(u);
		return listaUtente;
	}
}

	