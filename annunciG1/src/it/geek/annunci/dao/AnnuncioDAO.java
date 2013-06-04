package it.geek.annunci.dao;

import it.geek.annunci.model.Annuncio;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

public class AnnuncioDAO implements AnnuncioDaoInterface{
	
	private static Logger log = Logger.getLogger(AnnuncioDaoInterface.class);
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Annuncio> findAll(){
		String sql ="SELECT id, descrizione, data_inserimento, visite, id_categoria, id_prodotto, stato, owner FROM annunci";		
		return (List<Annuncio>)jdbcTemplate.query(sql, new AnnuncioRowMapper());
	}
	
	public List<Annuncio> findByExample(Annuncio annuncio){
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT id, descrizione, data_inserimento, visite, id_categoria, id_prodotto, stato, owner FROM annunci WHERE 1=1 ");
		
		List params = new ArrayList<>();
		
		if(annuncio.getDescrizione()!=null){
			sb.append("AND descrizione LIKE ? ");
			params.add("%"+annuncio.getDescrizione()+"%");
		}
		
		if(annuncio.getStato()==0 || annuncio.getStato()==1){
			sb.append("AND stato = ? ");
			params.add(annuncio.getStato());
		}
		if(annuncio.getIdCategoria()>0){
			sb.append("AND id_categoria = ? ");
			params.add(annuncio.getIdCategoria());
		}
		
		
		log.info("QUERY: " + sb);
		return jdbcTemplate.query(sb.toString(), params.toArray(), new AnnuncioRowMapper());
	}
}
