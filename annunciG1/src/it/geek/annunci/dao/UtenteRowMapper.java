package it.geek.annunci.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.geek.annunci.model.Ruolo;
import it.geek.annunci.model.Utente;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

public class UtenteRowMapper implements RowMapper<Utente>{

	private static Logger log = Logger.getLogger(UtenteRowMapper.class);
	
	public Utente mapRow(ResultSet rs, int rowNum) throws SQLException {
		log.debug("mapRow::rs="+rs);
		Utente ret = new Utente();
		ret.setId(rs.getInt("id"));
		ret.setUsername(rs.getString("username"));
		ret.setPassword(rs.getString("password"));
		ret.setNome(rs.getString("nome"));
		ret.setCognome(rs.getString("cognome"));
		ret.setStato(rs.getInt("stato"));
		ret.setCreditoResiduo(rs.getInt("credito_residuo"));
		Ruolo r = new Ruolo();
			r.setId(rs.getInt("id_ruolo"));
			r.setDescrizione(rs.getString("descrizione_ruolo"));
		ret.setRuolo(r);
		
		return ret;
	}
}