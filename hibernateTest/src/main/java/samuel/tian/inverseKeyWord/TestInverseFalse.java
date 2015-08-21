package samuel.tian.inverseKeyWord;

import java.sql.Date;

import org.hibernate.*;

import com.mercury.beans.HibernateUtil;


/**
 * in one to many relationship mapping <set inverse="false"> means that the ONE side is the relationship owner
 * so if you execute the save/update operation on ONE side, it will also run an update query to update the MANY side
 * 
 * @author Siyu Tian
 *
 */
public class TestInverseFalse {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Stock stock = new Stock();
		stock.setStock_id(005);
		stock.setStock_code("CODE005");
		stock.setStock_name("TRUST WAVE");
		
		StockDailyRecord sd = new StockDailyRecord();
		sd.setDaily_record_id(10);
		sd.setPrice_open(50);
		sd.setPrice_close(60);
		sd.setPrice_change(10);
		sd.setRecord_date(new Date(System.currentTimeMillis()));
		sd.setVolume(200);
		
		sd.setStock(stock);
		stock.getStockDailyRecords().add(sd);

		session.save(stock);
		session.save(sd);
				
		tx.commit();

	}

}
