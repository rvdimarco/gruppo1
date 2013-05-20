package it.geek.annunci.service;

import it.geek.annunci.dao.CategoriaDaoInterface;
import it.geek.annunci.exception.BusinessException;
import it.geek.annunci.model.Categoria;

import java.util.List;

import org.apache.log4j.Logger;

public class CategoriaService implements CategoriaServiceInterface {
	
	private static Logger log = Logger.getLogger(CategoriaService.class);
	
	private CategoriaDaoInterface categoriaDAO;
	
	

	public void setCategoriaDAO(CategoriaDaoInterface categoriaDAO) {
		this.categoriaDAO = categoriaDAO;
	}



	@Override
	public List<Categoria> getAll() {
		
			List<Categoria> listaCategorie = null;
			
			try{
				
				listaCategorie = categoriaDAO.findAll();
				
			}catch(Exception e){
					log.error(e);
					throw new BusinessException(e);
			}
			return listaCategorie ;
	}
}
