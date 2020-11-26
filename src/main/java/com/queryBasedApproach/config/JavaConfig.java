package com.queryBasedApproach.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.queryBasedApproach.dao.ProductDAO;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan("com.queryBasedApproach.dao")
public class JavaConfig {

	@Autowired
	private Environment env;
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource=null;
		dataSource =new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("db.driverClassName"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.username"));
		dataSource.setPassword(env.getProperty("db.password"));
		return dataSource;
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public JdbcTemplate getJdbc() {
		 return new JdbcTemplate();
	}
	
}
