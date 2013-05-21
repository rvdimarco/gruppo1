package it.geek.annunci.service;

import org.apache.log4j.Logger;

import it.geek.annunci.dao.UtenteDaoInterface;
import it.geek.annunci.model.Utente;

public class UtenteService implements UtenteServiceInterface{

	private static Logger log = Logger.getLogger(UtenteService.class);

	private UtenteDaoInterface utenteDAO;


	public void setUtenteDAO(UtenteDaoInterface utenteDAO) {
		this.utenteDAO = utenteDAO;
	}


	@Override
	public Utente get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	boolean ret = false;
	public boolean create(Utente u) {

		ret = utenteDAO.inserimento(u);
		return ret;

	}
}

	