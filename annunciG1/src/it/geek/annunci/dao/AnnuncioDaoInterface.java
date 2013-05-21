package it.geek.annunci.dao;

import it.geek.annunci.model.Annuncio;

import java.util.List;

public interface AnnuncioDaoInterface {

	public List<Annuncio> findAll();
	public List<Annuncio> findByExample(Annuncio annuncio);
		
}
