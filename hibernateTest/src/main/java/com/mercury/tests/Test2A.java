package com.mercury.tests;

import java.sql.*;
import java.util.List;

import oracle.jdbc.OracleTypes;

import org.hibernate.*;

import com.mercury.beans.HibernateUtil;
import com.mercury.beans.User;
/**
 * call stored procedure
 * 
 * @author Siyu Tian
 *
 */
public class Test2A {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		Session session = HibernateUtil.currentSession();
		// How to call stored procedure
		// First way: define a sql-query block in the mapping file,
		//			  and set callable="true", then use getNamedQuery method
		Query query = session.getNamedQuery("userSP");
		List<User> list = query.list();
		for (User u:list) {
			System.out.println(u);
		}
		// Second way: Downgrade Hibernate to JDBC
		Connection conn = session.connection();
		CallableStatement cs = conn.prepareCall("{?=call queryUser()}");
		cs.registerOutParameter(1, OracleTypes.CURSOR);
		cs.execute();
		ResultSet rs = (ResultSet)cs.getObject(1);
		while (rs.next()) {
			System.out.println(rs.getString("Name") + "\t" + rs.getInt("Age"));
		}
		HibernateUtil.closeSession();
	}
}
