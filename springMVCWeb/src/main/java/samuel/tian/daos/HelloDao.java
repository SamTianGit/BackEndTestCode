package samuel.tian.daos;

import java.util.List;
import org.hibernate.*;

import samuel.tian.beans.User;

public class HelloDao {
	public void save(User user) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<User> query() {
		Session session = HibernateUtil.currentSession();
		List<User> list = session.createQuery("from User").list();
		return list;
	}
}
