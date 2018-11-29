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
import stgl.service.FindAssActService;

@Controller
public class FindAssActController {
	
	@Autowired
	private FindAssActService findAssActService;
	@Autowired
	private AssHonorService assHonorService;
	
	
	@RequestMapping(method=RequestMethod.GET,value="/toRecord",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE ) //将传过来的数据以json格式接收
	/*@ResponseBody*/
	public String findAllRecord(@RequestParam(defaultValue="1") int pageNum, String stu_username,Model model){
		System.out.println(pageNum);
		int pageSize = 10;
		
		String ass_id = assHonorService.findAss_IdService(stu_username);
		System.out.println("社团ID"+ass_id);
		
		PageBean pb = findAssActService.assActivityService(ass_id, pageNum, pageSize);
		System.out.println("这是controller里显示的"+pb);
		model.addAttribute("allRecord",pb);
		return "activity_record";
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/toRecord2",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE ) //将传过来的数据以json格式接收
	@ResponseBody
	public PageBean findAllRecord2(String pagenum,String stu_username){
		System.out.println(pagenum);
		int pageSize = 10;
		int pageNum=Integer.parseInt(pagenum);
		
		String ass_id = assHonorService.findAss_IdService(stu_username);
		System.out.println(ass_id);
		PageBean pb = findAssActService.assActivityService(ass_id, pageNum, pageSize);
		System.out.println("这是controller里显示的"+pb);
		return pb;
		
	}
}
