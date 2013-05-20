package it.geek.annunci.dao;

import it.geek.annunci.model.Annuncio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


public class AnnuncioDAO implements AnnuncioDaoInterface{

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Annuncio> findAll(){
		String sql ="";
		
		Annuncio fake = new Annuncio();
		fake.setDescrizione("bla bla bla");
		
		List<Annuncio> ret = new ArrayList<>();
		ret.add(fake);
		
		return ret;
	}
}
