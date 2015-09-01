package com.mercury.tests;

import org.hibernate.*;
import org.hibernate.criterion.*;

import com.mercury.beans.HibernateUtil;
import com.mercury.beans.User;

/**
 * examples of criteria
 * 
 * @author Siyu Tian
 *
 */
public class Test2C {
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Criteria ct = session.createCriteria(User.class);
		User user = (User)ct.add(Restrictions.eq("name", "Tommy"))
					.add(Restrictions.gt("age", 30)).uniqueResult();
		//User user = new User();
		//user.setAge(24);
		//User result = (User) ct.add(Example.create(user)).uniqueResult();
		System.out.println(user);
		HibernateUtil.closeSession();
	}
}
