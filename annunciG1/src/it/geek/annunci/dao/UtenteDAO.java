package it.geek.annunci.dao;

import org.apache.log4j.Logger;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import it.geek.annunci.model.Utente;

public class UtenteDAO implements UtenteDaoInterface{

	private static Logger log = Logger.getLogger(UtenteDAO.class);
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Utente findById(int id) {
		
		String sql = "SELECT id, username, password, nome, cognome FROM utenti WHERE id=?";
		Utente u = null;
		try{
			u = jdbcTemplate.queryForObject(sql, new Object[] {id},new UtenteRowMapper());
		}catch(EmptyResultDataAccessException e){
			log.error("Non ho trovato l'utente" +e);
		}
		return u;
	}

	public boolean inserimento(Utente u){
		log.debug("Input: " +u);
		String sql = "INSERT INTO utenti(id, username, password, nome, cognome, id_ruolo, stato, credito_residuo) values(?,?,?,?,?,?,?,?)";
		log.info("Query: " + sql);
		int ritorno = jdbcTemplate.update(sql, new Object[] {u.getId(), u.getUsername(), u.getPassword(), u.getNome(), u.getCognome(), u.getRuolo().getId(), u.getStato(), u.getCreditoResiduo()});
		boolean ret = false;
		if(ritorno>0){
			ret = true;
		}
		return ret;
	}
}
 