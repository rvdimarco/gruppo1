package it.geek.annunci.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.geek.annunci.model.Annuncio;

import org.springframework.jdbc.core.RowMapper;

public class AnnuncioRowMapper implements RowMapper<Annuncio> {

	public Annuncio mapRow(ResultSet rs, int rowNum) throws SQLException{
	
	Annuncio annuncio = new Annuncio();
	
	annuncio.setId(rs.getInt("id"));
	annuncio.setDescrizione(rs.getString("descrizione"));
	annuncio.setDataInserimento(rs.getTimestamp("data_inserimento"));
	annuncio.setVisite(rs.getInt("visite"));
	annuncio.setStato(rs.getInt("stato"));
	annuncio.setIdCategoria(rs.getInt("id_categoria"));
	annuncio.setIdProdotto(rs.getInt("id_prodotto"));
	annuncio.setOwner(rs.getInt("owner"));
	
	return annuncio;
	}
}
