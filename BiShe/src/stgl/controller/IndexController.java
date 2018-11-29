package stgl.controller;
/*
 * 登录
 */
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import stgl.config.User;


@Controller
@SessionAttributes("stgl")
public class IndexController {
		
	
	//登录验证
	@RequestMapping(method=RequestMethod.GET,value="/")
	public String index(@AuthenticationPrincipal User curUser,Model model){ 
		System.out.println("stgl:"+curUser);
		model.addAttribute("stgl", curUser);
			return "index";
	}
	//登录验证
		@RequestMapping(method=RequestMethod.GET,value="/admin")
		public String adminIndex(@AuthenticationPrincipal User curUser,Model model){ 
			System.out.println("stgl:"+curUser);
			model.addAttribute("stgl", curUser);
			
			
				return "admin";
		}
	
}
