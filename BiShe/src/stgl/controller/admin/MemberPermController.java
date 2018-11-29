package stgl.controller.admin;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stgl.service.MemberPermService;

@Controller
public class MemberPermController {
	
	@Autowired
	private MemberPermService memberPermService;
	
	@RequestMapping(method=RequestMethod.POST,value="/toUpdatePerm")
	public String uodatePerm(String stu_username,String ass_name){
		System.out.println("ass_name:"+ass_name);
		System.out.println("stu_username:"+stu_username);
		
		String stu_type="admin";
		memberPermService.updatePerm(stu_type, stu_username, ass_name);
		return "memberpermissions";
	} 
	@RequestMapping(method=RequestMethod.GET,value="/toMemberPerm")
	public String memberPerm(){
		return "memberpermissions";
	}
}
