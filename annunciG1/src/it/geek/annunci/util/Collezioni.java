package it.geek.annunci.util;


import java.util.List;

import org.apache.struts.util.LabelValueBean;
import org.springframework.jdbc.core.JdbcTemplate;


public class Collezioni implements CollezioniInterface{

	private  JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public List<LabelValueBean> getOptions(String tab){

			
		String sql = "SELECT * FROM " +tab;
		return (List<LabelValueBean>)jdbcTemplate.query(sql, new CollezioniRowMapper());  

	}
}
