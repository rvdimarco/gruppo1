package it.geek.annunci.service;

import it.geek.annunci.dao.AnnuncioDaoInterface;
import it.geek.annunci.model.Annuncio;

import java.util.List;

public class AnnuncioService implements AnnuncioServiceInterface {

	private AnnuncioDaoInterface annuncioDAO;
	public void setAnnuncioDAO(AnnuncioDaoInterface annuncioDAO){
		this.annuncioDAO = annuncioDAO;
	}
	
	@Override
	public List<Annuncio> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annuncio> getByExample() {
		// TODO Auto-generated method stub
		return null;
	}

}
