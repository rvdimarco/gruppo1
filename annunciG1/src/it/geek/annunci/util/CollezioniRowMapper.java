package it.geek.annunci.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.struts.util.LabelValueBean;
import org.springframework.jdbc.core.RowMapper;

public class CollezioniRowMapper implements RowMapper<LabelValueBean>{

	public LabelValueBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		String value = rs.getString(1);
		String label = rs.getString(2);
		LabelValueBean l = new LabelValueBean(label,value);
		
		return l;
	}
	
	

}
