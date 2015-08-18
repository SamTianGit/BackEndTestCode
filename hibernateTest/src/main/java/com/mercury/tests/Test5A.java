package com.mercury.tests;

import java.util.Set;

import org.hibernate.*;
import com.mercury.beans.*;
/**
 * will throw exception because of the session has been closed. unless you use Hibernate.initialize()
 * 
 * @author Siyu Tian
 *
 */
public class Test5A {
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		String hql = "from Customer as c where c.name='Candy'";
		Customer c = (Customer)session.createQuery(hql).uniqueResult();
		System.out.println(c.getCid() + "\t" + c.getName());
		Set<String> emails = c.getEmails();
		//Hibernate.initialize(emails);
		HibernateUtil.closeSession();
		System.out.println("emails==null? " + (emails==null));
		for (String email:emails) {
			System.out.println(email);
		}
	}
}
