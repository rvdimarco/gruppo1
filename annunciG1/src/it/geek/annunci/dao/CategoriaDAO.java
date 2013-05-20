package it.geek.annunci.dao;

import it.geek.annunci.model.Categoria;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class CategoriaDAO implements CategoriaDaoInterface {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Categoria> findAll() {
			String sql="SELECT id, descrizione  FROM catgorie";
			return jdbcTemplate.query(sql, new CategoriaRowMapper());
	}
}
