package it.geek.annunci.service;

import it.geek.annunci.dao.AnnuncioDaoInterface;
import it.geek.annunci.model.Annuncio;

import java.util.List;

public class AnnuncioService implements AnnuncioServiceInterface {

	private AnnuncioDaoInterface annuncioDAO;
	public void setAnnuncioDAO(AnnuncioDaoInterface annuncioDAO){
		this.annuncioDAO = annuncioDAO;
	}
	
	List<Annuncio> listaAnnunci = null;
	
	@Override
	public List<Annuncio> getAll() {
		
		listaAnnunci = annuncioDAO.findAll();
		
		return listaAnnunci;
	}

	@Override
	public List<Annuncio> getByExample(Annuncio annuncio) {
		
		listaAnnunci = annuncioDAO.findByExample(annuncio);
		
		return listaAnnunci;
	}

}
