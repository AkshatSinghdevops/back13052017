package com.niit.shoppingcart.testcase;


import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

import junit.framework.Assert;



public class UserTestCase {

	@Autowired
	private static User user;

	@Autowired
	private static UserDAO userDAO;

	
	@BeforeClass
	public static void init() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		user = (User) context.getBean("user");

		userDAO = (UserDAO) context.getBean("userDAO");

	}
	
	@Test
	public void validateTestCase()
	{
		boolean flag=userDAO.validate("niit", "123");
		
	  
		
		
		
		
		
		Assert.assertEquals("validateTestCase", true, flag);
	}

	
	
	
	
	
	
}

	


