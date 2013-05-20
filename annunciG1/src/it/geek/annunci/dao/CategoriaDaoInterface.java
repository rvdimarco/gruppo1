package it.geek.annunci.dao;

import it.geek.annunci.model.Categoria;

import java.util.List;

public interface CategoriaDaoInterface {
	public List<Categoria> findAll();
}
