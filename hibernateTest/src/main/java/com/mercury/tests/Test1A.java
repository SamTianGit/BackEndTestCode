package com.mercury.tests;

import org.hibernate.*;

import com.mercury.beans.HibernateUtil;
import com.mercury.beans.User;
/**
 * from persistent to detach and revert
 * 
 * @author Siyu Tian
 *
 */
public class Test1A {
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		// user is in persistence status in session
		User user = (User)session.load(User.class, "Tommy");	
		System.out.println(user);
		HibernateUtil.closeSession();
		// When session is closed, user is detached, but can be modified
		user.setAge(33);	
		// Open a new session
		Session session2 = HibernateUtil.currentSession();
		session2.merge(user);	// user is persistence in session2
		user = (User)session2.load(User.class, "Tommy");
		System.out.println(user);	// It prints out "Tommy 33"
		// If we make a transaction at this time, the table will be updated
		Transaction tx = session2.beginTransaction();
		tx.commit();
		HibernateUtil.closeSession();
	}
}
