package stgl.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import stgl.domain.PageBean;
import stgl.domain.Stgl_Stu;
import stgl.service.FindStuService;
import stgl.service.PageBeanService;

@Controller
public class AllAssController {
	
	@Autowired
	private PageBeanService pageBean;
	
	@Autowired
	private FindStuService findStu;
	
	//查找所有的社团
	@RequestMapping(method=RequestMethod.GET,value="/toAll",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE ) //将传过来的数据以json格式接收
	/*@ResponseBody*/
	public String findAllAss(@RequestParam(defaultValue="1") int pageNum, String stu_username,Model model){
		System.out.println(pageNum);
		int pageSize = 10;
		PageBean pb = pageBean.findAllAss(pageNum, pageSize);
		System.out.println("这是controller里显示的"+pb);
		model.addAttribute("allAss",pb);
		
		
		Stgl_Stu stu = findStu.findStu(stu_username);
		model.addAttribute("stu", stu);
		return "all";
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/toAll2",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE ) //将传过来的数据以json格式接收
	@ResponseBody
	public PageBean findAllAss2(String pagenum){
		System.out.println(pagenum);
		int pageSize = 10;
		int pageNum=Integer.parseInt(pagenum);
		PageBean pb = pageBean.findAllAss(pageNum, pageSize);
		System.out.println("这是controller里显示的"+pb);
		return pb;
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/toIndex")
	public String toIndex(Model model){
		return "index";	
	}
}
