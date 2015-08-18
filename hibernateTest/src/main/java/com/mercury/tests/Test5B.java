package com.mercury.tests;

import org.hibernate.*;
import com.mercury.beans.*;
/**
 * use load and set fetch="join" in the mapping file, it will prevent lazy loading issue
 * @author Siyu Tian
 *
 */
public class Test5B {
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Customer c = (Customer)session.load(Customer.class, 1);
		System.out.println(c.getCid() + "\t" + c.getName());
		HibernateUtil.closeSession();
		for (String email:c.getEmails()) {
			System.out.println(email);
		}
	}
}
