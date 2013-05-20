package it.geek.annunci.dao;

import it.geek.annunci.model.Annuncio;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


public class AnnuncioDAO implements AnnuncioDaoInterface{

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Annuncio> findAll(){
		return null;
	}
}
