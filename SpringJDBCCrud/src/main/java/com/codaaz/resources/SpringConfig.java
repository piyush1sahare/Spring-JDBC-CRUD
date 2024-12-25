package com.codaaz.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {
	@Bean
	public DriverManagerDataSource myDataSource() {

		DriverManagerDataSource dc = new DriverManagerDataSource();
		dc.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dc.setUrl("jdbc:mysql://localhost:3306/spring_jdbcdb");
		dc.setUsername("root");
		dc.setPassword("Piyu@123");

		return dc;

	}

	@Bean
	public JdbcTemplate tempData() {

		JdbcTemplate jt = new JdbcTemplate();

		jt.setDataSource(myDataSource());

		return jt;

	}

}
