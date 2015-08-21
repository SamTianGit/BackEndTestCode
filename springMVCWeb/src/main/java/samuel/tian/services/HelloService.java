package samuel.tian.services;

import samuel.tian.beans.User;
import samuel.tian.beans.UserInfo;
import samuel.tian.daos.HelloDao;

public class HelloService {
	private HelloDao hd;
	
	public HelloDao getHd() {
		return hd;
	}
	public void setHd(HelloDao hd) {
		this.hd = hd;
	}
	
	public String sayHello1(User user) {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><body>");
		sb.append("<h1><font color=green>");
		sb.append("Hello " + user.getName() + " with age " + user.getAge()
				+ ", welcome to Jave EE!");
		sb.append("</font></h1>");
		sb.append("</body></html>");
		return sb.toString();
	}
	public String sayHello2(User user) {
		return "Hello " + user.getName() + "(" + user.getAge() + "), welcome to Java EE!";
	}
	
	public UserInfo process(User user) {
		hd.save(user);
		UserInfo userInfo = new UserInfo();
		userInfo.setMsg(this.sayHello2(user));
		userInfo.setUsers(hd.query());
		return userInfo;
	}
}
