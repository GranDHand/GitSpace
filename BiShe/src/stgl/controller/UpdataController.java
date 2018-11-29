package stgl.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import stgl.domain.Stgl_Stu;
import stgl.service.FindStuService;
import stgl.service.UpdataInfService;

@Controller
public class UpdataController {
	
	@Autowired
	private FindStuService findStuService;
	@Autowired
	private UpdataInfService updataInf;
	
	//修改个人信息
	@RequestMapping(method=RequestMethod.POST,value="/toPI")
	public String updataInf(@RequestParam("stu_username") String stu_username,Stgl_Stu stgl,Model model){
		System.out.println("修改信息的username"+stgl);
		updataInf.updataPerInf(stgl);
		
		Stgl_Stu stu = findStuService.findStu(stu_username);
		System.out.println("这是登陆后得到用户名:"+stu);
		model.addAttribute("stu",stu); 
		return "personal_inf";
	}
}
