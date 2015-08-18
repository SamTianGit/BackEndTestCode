package com.mercury.tests;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.mercury.beans.Customer;
import com.mercury.beans.HibernateUtil;
/**
 * use criteria and set fetch="join" in the mapping file, it will prevent lazy loading issue
 * @author Siyu Tian
 *
 */
public class Test5D {
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Criteria ct = session.createCriteria(Customer.class);
		Customer c = (Customer)ct.add(Restrictions.eq("name", "Candy")).uniqueResult();	
		HibernateUtil.closeSession();
		System.out.println(c.getCid() + "\t" + c.getName());
		for (String email:c.getEmails()) {
			System.out.println(email);
		}
	}
}
