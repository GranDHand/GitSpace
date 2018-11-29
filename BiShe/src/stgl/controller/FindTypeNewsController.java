package stgl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stgl.domain.Stgl_News;
import stgl.service.FindTypeNewsService;

@Controller
public class FindTypeNewsController {
	
	@Autowired
	private FindTypeNewsService findType;
	
	@RequestMapping(method=RequestMethod.GET,value="toFindType")
	public String findTypeNews(String n_status,Model model){
		System.out.println("n_status:"+n_status);
		List<Stgl_News> news = findType.findTypeNew(n_status);
		System.out.println("这是按照类型查找新闻:"+news);
		model.addAttribute("news", news);
		return "news2";
	}
}
