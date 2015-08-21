package samuel.tian.inverseKeyWord;

import java.io.Serializable;
import java.sql.Date;

public class StockDailyRecord implements Serializable{
	private int daily_record_id;
	private int price_open;
	private int price_close;
	private int price_change;
	private int volume;
	private Date record_date;
	private Stock stock;
	public int getDaily_record_id() {
		return daily_record_id;
	}
	public void setDaily_record_id(int daily_record_id) {
		this.daily_record_id = daily_record_id;
	}
	public int getPrice_open() {
		return price_open;
	}
	public void setPrice_open(int price_open) {
		this.price_open = price_open;
	}
	public int getPrice_close() {
		return price_close;
	}
	public void setPrice_close(int price_close) {
		this.price_close = price_close;
	}
	public int getPrice_change() {
		return price_change;
	}
	public void setPrice_change(int price_change) {
		this.price_change = price_change;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Date getRecord_date() {
		return record_date;
	}
	public void setRecord_date(Date record_date) {
		this.record_date = record_date;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "StockDailyRecord [daily_record_id=" + daily_record_id
				+ ", price_open=" + price_open + ", price_close=" + price_close
				+ ", price_change=" + price_change + ", volume=" + volume
				+ ", date=" + record_date + "]";
	}
	
	

}
