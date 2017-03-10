package com.niit.shoppingcart.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

@Transactional
@Repository("userDAO")

public class UserDAOImpl implements UserDAO {

	
private SessionFactory sessionFactory;
	
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	
	
	public List<User> list() {
		return	sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	public boolean save(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean validate(String user_id, String password)
	{
		String hql="from User where user_id='"+user_id+"' and password='"+password+"'";
		if(getSession().createQuery(hql).uniqueResult()==null)
		{
			return false;
		}
		return true;
	}
	



		 
				 
	}


