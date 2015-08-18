package com.mercury.tests;

import java.util.List;

import org.hibernate.*;
import com.mercury.beans.*;

public class Test5 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Customer ct = new Customer("Candy");
		ct.addEmail("candy@yahoo.com");
		session.save(ct);
		tx.commit();
		String hql = "from Customer";
		List<Customer> list = session.createQuery(hql).list();
		for (Customer c:list) {
			System.out.println(c.getCid() + "\t" + c.getName());
			for (String email:c.getEmails()) {
				System.out.println(email);
			}
		}
		HibernateUtil.closeSession();
	}
}
