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
		
		String sql = "SELECT username, password, nome, cognome FROM utenti WHERE username=?";
		Utente u = null;
		try{
			u = jdbcTemplate.queryForObject(sql, new Object[] {username},new UtenteRowMapper());
		}catch(EmptyResultDataAccessException e){
			log.error("Non ho trovato l'utente" +e);
		}
		return u;
	}

	public boolean inserimento(Utente u) {
		
		String sql = "INSERT INTO utenti(id,username,password,nome,cognome,id_ruolo,stato,credito_residuo values(?,?,?,?,?,?,?,?)";
		int ritorno = jdbcTemplate.update(sql, new Object[] {u.getId(), u.getUsername(), u.getPassword(), u.getNome(), u.getCognome(), u.getIdRuolo(),u.getStato(), u.getCreditoResiduo()});
		boolean ret = false;
		if(ritorno>0){
			ret = true;
		}
		return ret;
	}
}