package it.geek.annunci.dao;

import it.geek.annunci.model.Categoria;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CategoriaRowMapper implements RowMapper<Categoria> {
	
	public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Categoria categoria = new Categoria();
		
		categoria.setDescrizione(rs.getString("descrizione"));
		categoria.setIdCategoria(rs.getInt("id"));
		
		return categoria;
		
	}

}
