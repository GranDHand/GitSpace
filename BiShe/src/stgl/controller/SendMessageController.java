package stgl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import stgl.domain.Stgl_Stu;
import stgl.domain.Stgl_message;
import stgl.service.SendMessageService;

@Controller
public class SendMessageController {
	
	@Autowired
	private SendMessageService sendMessageService;
	
	@RequestMapping(method=RequestMethod.GET,value="/sendMessage",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public List<Stgl_message> message(String stu_username,String m_content,Model model){
		Stgl_Stu stu =sendMessageService.sendMessageService(stu_username);
		System.out.println(m_content);
		String m_stu_name = stu.getStu_name();
		String m_ass_id = stu.getStu_assocition_id();
		
		if(m_content != ""){
		sendMessageService.insertMessageService(m_content, m_stu_name, m_ass_id);
		}else{
			System.out.println("空值");
		}
		
		List<Stgl_message> message = sendMessageService.selMessageService(m_ass_id);
		model.addAttribute("message", message);
		return message;
	}
}
