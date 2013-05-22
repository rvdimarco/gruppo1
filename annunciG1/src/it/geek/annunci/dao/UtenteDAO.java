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
	
	public Utente findById(String username) {
		
		log.debug("findById::jdbcTemplate="+jdbcTemplate);
		log.debug("findById::");
		
		String sql = "SELECT id, username, password, nome, cognome FROM utenti WHERE username=?";
		Utente u = null;
		try{
			u = jdbcTemplate.queryForObject(sql, new Object[] {username},new UtenteRowMapper());
		}catch(EmptyResultDataAccessException e){
			log.error("Non ho trovato l'utente" +e);
		}
		return u;
	}

	public boolean inserimento(Utente u){
		String sql ="SELECT MAX(id)'id' FROM utenti";
		int max = jdbcTemplate.queryForObject(sql, Integer.class);
		//int max = jdbcTemplate.queryForInt(sql);
		log.debug("Max: "+max);
		u.setId(++max);
		
		log.debug("Input: " +u);
		String sql2 = "INSERT INTO utenti(id, username, password, nome, cognome, id_ruolo, stato, credito_residuo) values(?,?,?,?,?,?,?,?)";
		log.info("Query: " + sql2);
		int ritorno = jdbcTemplate.update(sql2, new Object[] {u.getId(), u.getUsername(), u.getPassword(), u.getNome(), u.getCognome(), u.getRuolo().getId(), u.getStato(), u.getCreditoResiduo()});
		boolean ret = false;
		if(ritorno>0){
			ret = true;
		}
		return ret;
	}
}