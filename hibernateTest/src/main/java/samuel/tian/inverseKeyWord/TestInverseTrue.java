package samuel.tian.inverseKeyWord;

import java.sql.Date;

import org.hibernate.*;

import com.mercury.beans.HibernateUtil;

/**
  * in one to many relationship mapping <set inverse="true"> means that the MANY side is the relationship owner
 * so if you execute the save/update operation on MANY side, it will not run an update query to update the MANY side
 * 
 * @author Siyu Tian
 *
 */
public class TestInverseTrue {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Stock s1 = (Stock) session.get(Stock.class, 001);
		
		StockDailyRecord sd = new StockDailyRecord();
		sd.setDaily_record_id(11);
		sd.setPrice_open(50);
		sd.setPrice_close(60);
		sd.setPrice_change(10);
		sd.setRecord_date(new Date(System.currentTimeMillis()-1000*3600*24*2));
		sd.setVolume(200);
		sd.setStock(s1);
		
		s1.getStockDailyRecords().add(sd);
		
		session.save(sd);
		session.update(s1);
		tx.commit();
		
	}

}
