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
import stgl.service.FIndAllStuService;

@Controller
public class FindAllMemberCOntroller {
	
	@Autowired
	private FIndAllStuService findMember;
	
	@RequestMapping(method=RequestMethod.GET,value="/toMember",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String member(String stu_username ,@RequestParam(defaultValue="1") int pageNum,Model model){
			int pageSize = 5;
			PageBean pb = findMember.findAllMember(stu_username, pageNum, pageSize);
			System.out.println("这是Membercontroller里显示的"+pb);
			model.addAttribute("member",pb);
		return "member";
	}
	//这是前台传过来的数据
	@RequestMapping(method=RequestMethod.GET,value="/toMember2",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE ) //将传过来的数据以json格式接收
	@ResponseBody
	public PageBean member2(String stu_username, String pagenum){
		System.out.println("下一页后的用户名："+stu_username);
		int pageSize = 5;
		int pageNum=Integer.parseInt(pagenum);
		PageBean pb = findMember.findAllMember(stu_username, pageNum, pageSize);
		System.out.println("这是controller里显示的"+pb);
		return pb;
		
	}
}
