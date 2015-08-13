package samuel.tian.serialization;

import java.io.Serializable;

public class Email implements Serializable{
	
	private String address;

	public Email(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString(){
		return address;
	}
	
}
