package com.codaaz.mapps;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.codaaz.beann.Students;

public class StudMapper implements RowMapper<Students> {

	@Override
	public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Students std= new Students();
		
		std.setName(rs.getString("name"));
		std.setEmail(rs.getString("email"));
		std.setPasswords(rs.getString("passwords"));
		return std;
	}

}
