package com.mercury.tests;

import java.util.List;

import org.hibernate.*;

import com.mercury.beans.HibernateUtil;
import com.mercury.beans.User;
/**
 * 
 * Basic test about the save() and list() functionality of hibernate
 * 
 * @author Siyu Tian
 *
 */
public class Test1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		// Save a user
		Transaction tx = session.beginTransaction();
		User user = new User("Tommy", 42);
		session.save(user);
		tx.commit();
		session.evict(user);
		// Read all users
		String hql = "from User";
		Query query = session.createQuery(hql);
		System.out.println("*******************");
		List<User> list = query.list();
		for (User u:list) {
			System.out.println(u);
			System.out.println(u==user);
		}
		HibernateUtil.closeSession();
	}
}
