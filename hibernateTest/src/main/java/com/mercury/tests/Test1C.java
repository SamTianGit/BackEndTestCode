package com.mercury.tests;

import java.util.List;

import org.hibernate.*;

import com.mercury.beans.HibernateUtil;
import com.mercury.beans.User;
/**
 * query level caching
 * 
 * @author Siyu Tian
 *
 */
public class Test1C {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		String hql = "from User";
		Query query = session.createQuery(hql);
		query.setCacheable(true);	// query is cached
		List<User> list = query.list();
		for (User u:list) {
			System.out.println(u);
		}
		System.out.println("*******************");
		// When we run query.list() again, it will not run any query.
		List<User> list2 = query.list();
		for (User u:list2) {
			System.out.println(u);
		}
		HibernateUtil.closeSession();
	}
}
