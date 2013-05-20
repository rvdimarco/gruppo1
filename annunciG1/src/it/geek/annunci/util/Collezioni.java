package it.geek.annunci.util;

import it.geek.annunci.dao.AnnuncioRowMapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts.util.LabelValueBean;
import org.springframework.jdbc.core.JdbcTemplate;


public class Collezioni {

	private static Logger log = Logger.getLogger(Collezioni.class);

	private  JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public List<LabelValueBean> getOptions(String tab){

			
		String sql = "SELECT * FROM " +tab;
		return jdbcTemplate.query(sql, new CollezioniRowMapper());  

	}
}
