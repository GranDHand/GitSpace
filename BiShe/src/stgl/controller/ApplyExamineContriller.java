package stgl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stgl.domain.Stgl_Stu;
import stgl.service.ApplyExamineService;
import stgl.service.StuApplyService;

/**
 * 申请审核
 * @author hyu25
 *
 */
@Controller
public class ApplyExamineContriller {
	
	@Autowired
	private ApplyExamineService examine;
	
	@Autowired
	private StuApplyService  stuApply;
	
	@RequestMapping(method=RequestMethod.GET,value="/toExamine")
	public String getExamine(String stu_username,Model model){
		Stgl_Stu ass_id = examine.getAssIdService(stu_username);
		System.out.println("这是通过管理员查到的社团ID"+ass_id.getStu_assocition_id());
		
		String stu_ass_id = ass_id.getStu_assocition_id();
		
		 List<Stgl_Stu> appExam = examine.getStuService(ass_id);
		System.out.println("这里是申请审核的名单："+appExam);
		
		model.addAttribute("appExam", appExam);
		model.addAttribute("stu_ass_id", stu_ass_id);
		return "applyforaudit";
	}
	
	//删除申请记录
	@RequestMapping(method=RequestMethod.GET,value="/toDel")
	public void delExamine(String stu_username){
		System.out.println("ajax传过来的用户名"+stu_username);
		
		stuApply.delStuApply(stu_username);
	}
	
	//修改学生信息
	@RequestMapping(method=RequestMethod.GET,value="/toUpdate")
	public void upExamine(String stu_username,String stu_assocition_id,String stu_state){
		System.out.println("ajax传过来的社团id"+stu_assocition_id);
		
		stu_state = "1";
		stuApply.delStuApply(stu_username);
		stuApply.upStuInf(stu_username, stu_assocition_id, stu_state);
		
	}
	
}
