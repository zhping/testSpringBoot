package zpp.testBoot.controller;

import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zpp.testBoot.domain.User;
 
@RestController//默认类中的方法搜会已json格式返回
public class HelloController {

	 
	@RequestMapping("/hello")
	public String index() {
		return "Hello World!<br> Hello zpp!";
	}
	@RequestMapping("/getuser")
	public User getUser() {
		User user = new User();
		user.setName("zpp");
		user.setPwd("pwdpwd");
		
		return user;
	}
}
