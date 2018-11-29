package stgl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stgl.service.WirteNewsService;

@Controller
public class wirteNewsController {
	
	@Autowired
	private WirteNewsService wirteNewsService;
	
	//这是社团管理员编辑新闻
	@RequestMapping(method=RequestMethod.GET,value="/inNews",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void insertNews(String stu_username,String n_state,String n_p_time,String n_content,String n_title){
		System.out.println("n_p_time:"+n_p_time);
		n_state="1";//这是表示社团新闻
		String n_ass_id = wirteNewsService.selAssIdService(stu_username);//根据用户名拿到用户的社团ID
		wirteNewsService.insertNewsService(n_state, n_p_time, n_content, n_title, n_ass_id);
		System.out.println("编辑成功");
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/toinsertNews")
	public String toNews(){
		return "writenews";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/inAdminNews",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void insertAdminNews(String stu_username,String n_state,String n_p_time,String n_content,String n_title){
		System.out.println("n_p_time:"+n_p_time);
		n_state="0";//这是表示校园新闻
		String n_ass_id = wirteNewsService.selAssIdService(stu_username);//根据用户名拿到用户的社团ID
		wirteNewsService.insertNewsService(n_state, n_p_time, n_content, n_title, n_ass_id);
		System.out.println("编辑成功");
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/toinsertAdminNews")
	public String toAdminNews(){
		return "adminwritenews";
	}
	
	
}
