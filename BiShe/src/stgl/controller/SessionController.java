package stgl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {
	
	@RequestMapping(method=RequestMethod.GET, value="/login")
	public String login(
			@RequestParam(required = false) String error,
			@RequestParam(required  = false) String logout){
		System.out.println("---error:"+error);
		System.out.println("---logout:"+logout);
		if(error != null){
			System.out.println("这是登录失败！");
		}
		if(logout != null){
			System.out.println("这是退出系统");
		}
		
		return "form/login";
	}
}
