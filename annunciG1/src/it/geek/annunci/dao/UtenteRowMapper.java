package it.geek.annunci.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.geek.annunci.model.Utente;

import org.springframework.jdbc.core.RowMapper;

public class UtenteRowMapper implements RowMapper<Utente>{


	public Utente mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Utente ret = new Utente();
		
		ret.setId(rs.getInt("id"));
		ret.setUsername(rs.getString("username"));
		ret.setPassword(rs.getString("password"));
		ret.setNome(rs.getString("nome"));
		ret.setCognome(rs.getString("cognome"));
	
		
		return ret;
	}
}