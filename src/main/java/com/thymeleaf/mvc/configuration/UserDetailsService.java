package com.thymeleaf.mvc.configuration;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class UserDetailsService {
	
	@Bean
	public UserDetailsManager useManager(DataSource ds) {
		JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager();
		jdbcUserDetailsManager.setDataSource(ds);
		return jdbcUserDetailsManager;
	}
}
