package samuel.tian.serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	//private static final long serialVersionUID = 6784949820013316571L;
	private String name;
	private int id;
	transient private int salary;
	transient private Email email;
	//private String password;
	
	@Override
	public String toString(){
		return "{Employee{name=" + name + ",id=" + id + ",salary=" + salary + ",email=" + email + "}";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}
	
/*	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}*/
	

}
