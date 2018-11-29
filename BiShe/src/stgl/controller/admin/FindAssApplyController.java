package stgl.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stgl.domain.Stgl_ApplyActvitity;
import stgl.service.FindAssApplyService;

@Controller
public class FindAssApplyController {
	
	@Autowired
	private FindAssApplyService findAssApplyService;
	
	@RequestMapping(method=RequestMethod.GET,value="/assApply")
	public String findAssApply(Model model){
		List<Stgl_ApplyActvitity> assApply = findAssApplyService.findAssApply();
		System.out.println(assApply);
		model.addAttribute("assApply", assApply);
		return "adminassapply";
	}
	
	//同意申请
	@RequestMapping(method=RequestMethod.GET,value="/agreeAssApply")
	public void agreeAssApply(String ass_act_ass_id,String ass_act_name,String ass_act_time,String ass_act_address){
		findAssApplyService.delAssApply(ass_act_ass_id);
		findAssApplyService.insertAssAct(ass_act_ass_id,ass_act_name,ass_act_time,ass_act_address);
	}
	
	//拒绝申请
	@RequestMapping(method=RequestMethod.GET,value="/refuseassApply")
	public void refuseAssApply(String ass_id){
		System.out.println("admin"+ass_id);
		findAssApplyService.delAssApply(ass_id);
	}
	
}
