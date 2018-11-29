package stgl.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import stgl.domain.Stgl_Stu;
import stgl.service.FindStuService;

@Controller
public class PersonInfController {
	@Autowired
	private FindStuService findStuService;
	
	@RequestMapping(method=RequestMethod.GET,value="/pi")
	public String findStu(@RequestParam("username") String username,Model model){
		
		Stgl_Stu stu = findStuService.findStu(username);
		System.out.println("这是登陆后得到用户名:"+stu);
		model.addAttribute("stu",stu); 
		return "personal_inf";
		
	}
}
