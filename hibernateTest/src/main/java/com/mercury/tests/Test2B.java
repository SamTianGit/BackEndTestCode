package com.mercury.tests;

import org.hibernate.*;

import com.mercury.beans.HibernateUtil;
import com.mercury.beans.User;
/**
 * difference between get() and load() method
 * 
 * @author Siyu Tian
 *
 */
public class Test2B {
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		// Compare load and get methods
		User user1 = (User)session.load(User.class, "Tracy");
		// user1 is a proxy object, but it is not null.
		System.out.println("user1==null?" + (user1==null));
		System.out.println("**** This line is displayed before query ****");
		System.out.println(user1);	// This line will trigger the query
		User user2 = (User)session.get(User.class, "Tommy");
		System.out.println("**** This line is displayed after query ****");
		System.out.println(user2);
		// If an object does not exist, they have different outputs
		// get method returns null
		User user3 = (User)session.get(User.class, "abcd");
		System.out.println(user3);
		// load method throws a runtime exception
		User user4 = (User)session.load(User.class, "abcd");
		System.out.println(user4);
		HibernateUtil.closeSession();
	}
}
