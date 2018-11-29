package stgl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stgl.domain.Stgl_ApplyActvitity;
import stgl.service.ApplyActService;

@Controller
public class ApplyActController {
	
	@Autowired
	private ApplyActService aaService;
	
	@RequestMapping(method=RequestMethod.POST,value="/toAa")
	public String aaInsert(Stgl_ApplyActvitity Stgl_aa){
		aaService.insertApply(Stgl_aa);
		
		return "applyActvitity";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/toApp")
	public String aaInsert(){
		return "applyActvitity";
		
	}
	
}
