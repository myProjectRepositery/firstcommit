package com.queryBasedApproach.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("pdaoBean")
public class ProductDAO {
	private final String SQL_GET_NO_OF_PRODUCT="select count(1) from product";
	@Autowired
	JdbcTemplate jdbctemplet;
	
	public int getNoOfPRoduct() {
		return jdbctemplet.queryForObject(SQL_GET_NO_OF_PRODUCT, Integer.class);
	}
	
	

}
