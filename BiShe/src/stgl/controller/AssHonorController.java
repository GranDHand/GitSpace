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
import stgl.service.AssHonorService;

@Controller
public class AssHonorController {
	
	@Autowired
	private AssHonorService assHonorService;
	
	//查找所有的社团
	@RequestMapping(method=RequestMethod.GET,value="/toHonor",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE ) //将传过来的数据以json格式接收
	/*@ResponseBody*/
	public String findAllHonor(@RequestParam(defaultValue="1") int pageNum, String stu_username,Model model){
		System.out.println(pageNum);
		int pageSize = 10;
		
		String ass_id = assHonorService.findAss_IdService(stu_username);
		System.out.println("社团ID"+ass_id);
		
		PageBean pb = assHonorService.assHonorService(ass_id, pageNum, pageSize);
		System.out.println("这是controller里显示的"+pb);
		model.addAttribute("allHonor",pb);
		return "activity_honor";
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/toHonor2",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE ) //将传过来的数据以json格式接收
	@ResponseBody
	public PageBean findAllHonor2(String pagenum,String stu_username){
		System.out.println(pagenum);
		int pageSize = 10;
		int pageNum=Integer.parseInt(pagenum);
		
		String ass_id = assHonorService.findAss_IdService(stu_username);
		System.out.println(ass_id);
		PageBean pb = assHonorService.assHonorService(ass_id, pageNum, pageSize);
		System.out.println("这是controller里显示的"+pb);
		return pb;
		
	}
}
