package samuel.tian.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import samuel.tian.beans.User;
import samuel.tian.beans.UserInfo;
import samuel.tian.services.HelloService;

@Controller
@SessionAttributes
public class HelloController {
	private HelloService hs;
	
	public HelloService getHs() {
		return hs;
	}
	public void setHs(HelloService hs) {
		this.hs = hs;
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("user") 
			User user, BindingResult result) {
		UserInfo userInfo = hs.process(user);
		return new ModelAndView("result", "userInfo", userInfo);
	}
	
	@RequestMapping("/main")
	public ModelAndView showMain() {		
		return new ModelAndView("hello", "command", new User());
	}
}
