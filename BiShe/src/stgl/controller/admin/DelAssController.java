package stgl.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stgl.service.DelAssSerive;

@Controller
public class DelAssController {
	
	@Autowired
	private DelAssSerive delAssService;
	
	@RequestMapping(method=RequestMethod.GET,value="/del")
	public void delAss(String ass_id){
		int id = Integer.parseInt(ass_id);
		delAssService.delAssService(id);
	}
	
}
