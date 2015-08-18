package com.mercury.tests;

import org.hibernate.Session;

import com.mercury.beans.Customer;
import com.mercury.beans.HibernateUtil;
/**
 * use get() and set fetch="join" in the mapping file, it will prevent lazy loading issue
 * @author Siyu Tian
 *
 */
public class Test5C {
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Customer c = (Customer)session.get(Customer.class, 1);	
		HibernateUtil.closeSession();
		System.out.println(c.getCid() + "\t" + c.getName());
		for (String email:c.getEmails()) {
			System.out.println(email);
		}
	}
}
