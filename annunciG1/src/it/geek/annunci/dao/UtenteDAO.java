package it.geek.annunci.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import it.geek.annunci.model.Annuncio;
import it.geek.annunci.model.Utente;

public class UtenteDAO implements UtenteDaoInterface{

	private static Logger log = Logger.getLogger(UtenteDAO.class);

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

		this.jdbcTemplate = jdbcTemplate;
	}

	public Utente findById(int id) {

		log.debug("findById::jdbcTemplate="+jdbcTemplate);
		log.debug("Utente: "+id);

		StringBuilder sb = new StringBuilder();
		sb.append("SELECT u.id as id, u.username as username, u.password as password, u.nome as nome, u.cognome as cognome, r.id as id_ruolo, u.stato as stato, u.credito_residuo as credito_residuo, r.descrizione as descrizione_ruolo");
		sb.append(" FROM utenti u, ruoli r");
		sb.append(" WHERE u.id_ruolo=r.id AND u.id=?");
		Utente u = null;
		try{
			u = jdbcTemplate.queryForObject(sb.toString(), new Object[] {id},new UtenteRowMapper());
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

	public List<Utente> findAll(){
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT u.id as id, u.username as username, u.password as password, u.nome as nome, u.cognome as cognome, r.id as id_ruolo, u.stato as stato, u.credito_residuo as credito_residuo, r.descrizione as descrizione_ruolo");
		sb.append(" FROM utenti u, ruoli r");
		sb.append(" WHERE u.id_ruolo=r.id ");
		return (List<Utente>)jdbcTemplate.query(sb.toString(), new UtenteRowMapper());
	}

	public List<Utente> findByExample(Utente u){ //Query dinamica

		List<Object> params = new Vector<Object>();

		StringBuilder sb = new StringBuilder();

		sb.append("SELECT u.id as id, u.username as username, u.password as password, u.nome as nome, u.cognome as cognome, r.id as id_ruolo, u.stato as stato, u.credito_residuo as credito_residuo, r.descrizione as descrizione_ruolo");
		sb.append(" FROM utenti u, ruoli r");
		sb.append(" WHERE u.id_ruolo=r.id ");

		if(u.getId()!=0){
			sb.append("AND u.id=? ");
			params.add(u.getId());
		}
		if(u.getUsername()!=null){
			sb.append("AND u.username=? ");
			params.add(u.getUsername());
		}
		if(u.getPassword()!=null){
			sb.append("AND u.password=? ");
			params.add(u.getPassword());
		}
		if(u.getNome()!=null){
			sb.append("AND u.nome=? ");
			params.add(u.getNome());
		}
		if(u.getCognome()!=null){
			sb.append("AND u.cognome=? ");
			params.add(u.getCognome());
		}
		if(u.getRuolo()!=null && u.getRuolo().getId()!=0){
			sb.append("AND r.id=? ");
			params.add(u.getRuolo().getId());
		}
		if(u.getRuolo()!=null && u.getRuolo().getDescrizione()!=null){
			sb.append("AND r.descrizione=? ");
			params.add(u.getRuolo().getDescrizione());
		}
		if(u.getCreditoResiduo()!=0){
			sb.append("AND u.credito_residuo=? ");
			params.add(u.getCreditoResiduo());
		}
			
		return (List<Utente>) jdbcTemplate.query(sb.toString(), params.toArray(), new UtenteRowMapper());

	}
}