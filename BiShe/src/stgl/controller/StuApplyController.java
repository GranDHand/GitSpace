package stgl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import stgl.service.StuApplyService;

@Controller
public class StuApplyController {
	
	@Autowired
	private StuApplyService stuApplyService;
	
	@RequestMapping(method = RequestMethod.GET,value="/toStuApply")
	@ResponseBody
	public String stuApply(String app_stu_username,String app_ass_id){
		
		System.out.println(app_stu_username+" "+app_ass_id);
		stuApplyService.stuApply(app_stu_username, app_ass_id);
		return null;
		
	}
	
}
