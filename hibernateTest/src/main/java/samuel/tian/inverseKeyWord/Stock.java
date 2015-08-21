package samuel.tian.inverseKeyWord;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Stock implements Serializable{
	private int stock_id;
	private String stock_code;
	private String stock_name;
	private Set<StockDailyRecord> stockDailyRecords = new HashSet<StockDailyRecord>(0);
	public int getStock_id() {
		return stock_id;
	}
	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}
	public String getStock_code() {
		return stock_code;
	}
	public void setStock_code(String stock_code) {
		this.stock_code = stock_code;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public Set<StockDailyRecord> getStockDailyRecords() {
		return stockDailyRecords;
	}
	public void setStockDailyRecords(Set<StockDailyRecord> stockDailyRecords) {
		this.stockDailyRecords = stockDailyRecords;
	}
	@Override
	public String toString() {
		return "Stock [stock_id=" + stock_id + ", stock_code=" + stock_code
				+ ", stock_name=" + stock_name + "]";
	}
	
	

}
