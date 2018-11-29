package stgl.controller;

/*
 * 修改密码
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import stgl.service.UpdatePdService;

@Controller
public class UpdatePdController {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UpdatePdService updatePdService;
	
	@RequestMapping(method=RequestMethod.POST,value="/toMtp2")
	public String updatePd2(String stu_username,@RequestParam("newPassword") String password,Model model){
		System.out.println("这是修改密码时传递的用户名"+stu_username);
		System.out.println("这是修改密码时传递的新密码"+password);
		
		String nPassword = passwordEncoder.encode(password);
		System.out.println("修改密码后加密："+nPassword);
		
		
		//修改密码
		updatePdService.updatePd(stu_username,nPassword);
		 
		return "form/login";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/toMtp")
	public String updatePd(String username,Model model){
		//根据用户名查到该用户的密码 传到前台作比较
				String pd = updatePdService.selUser(username);
				model.addAttribute("password", pd);
		return "modify_the_password";
	}
	
}
