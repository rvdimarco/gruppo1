package it.geek.annunci.service;

import it.geek.annunci.model.Annuncio;

import java.util.List;

public interface AnnuncioServiceInterface {
	
	public List<Annuncio> getAll();
	public List<Annuncio> getByExample();

}
