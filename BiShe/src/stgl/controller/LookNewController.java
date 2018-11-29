package stgl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stgl.domain.Stgl_News;
import stgl.service.LookNewService;

@Controller
public class LookNewController {
	
	@Autowired
	private LookNewService lookNewService;
	
	@RequestMapping(method=RequestMethod.GET,value="/looknews")
	public String looknew(String n_id,Model model){
		System.out.println("n_id:"+n_id);
		Stgl_News news = lookNewService.lookNewsService(n_id);
		System.out.println(news.getN_content());
		model.addAttribute("news", news);
		return "looknews";
	}
}
