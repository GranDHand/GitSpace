package stgl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stgl.domain.Stgl_Apply;
import stgl.domain.Stgl_Association;
import stgl.service.ApplyService;
import stgl.service.FindRomAssService;

@Controller
public class FindRomController {
	
	@Autowired
	private FindRomAssService findRomService;
	
	@Autowired
	private ApplyService apply;
	
	@RequestMapping(method=RequestMethod.GET,value="/toNoti")
	public String findRom(String username,Model model){
		List<Stgl_Association>   rom = findRomService.findRomAssService();
		System.out.println("findRomAssService"+findRomService.findRomAssService());
		model.addAttribute("rom",rom);
		
		//获取申请表中的数据
				List<Stgl_Apply> app = apply.myApplyService(username);
				
				model.addAttribute("app",app);
		return "notification";
		
	}
}
