package stgl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stgl.domain.Stgl_News;
import stgl.service.NewsService;

@Controller
public class NewsController {
	
	@Autowired
	private NewsService newsService;
	
	@RequestMapping(method=RequestMethod.GET,value="/toNews")
	public String findNews(Model model){
		List<Stgl_News> findAll = newsService.allNews();
		model.addAttribute("findAll", findAll);
		return "news";
	}

}
