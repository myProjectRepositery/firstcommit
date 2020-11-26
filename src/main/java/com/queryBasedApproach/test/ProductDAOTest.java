package com.queryBasedApproach.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.queryBasedApproach.config.JavaConfig;
import com.queryBasedApproach.dao.ProductDAO;

public class ProductDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductDAO pdao = context.getBean("pdaoBean", ProductDAO.class);
		int n = pdao.getNoOfPRoduct();
		System.out.println("The no of product :" + n);
	}

}
