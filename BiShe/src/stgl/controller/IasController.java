package stgl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import stgl.domain.PageBean;
import stgl.domain.Stgl_Invcice;
import stgl.service.IncomeAndSpendServiceImpl;
import stgl.service.PageBeanService;
import stgl.service.SpendpageBeanService;

@Controller
public class IasController {
	
	@Autowired
	private SpendpageBeanService spageBean;
	
	@Autowired
	private IncomeAndSpendServiceImpl iasServiceImpl;
	
	@RequestMapping(method=RequestMethod.GET,value="/toIas")
	public String incomeAndSpend(String inv_status,@RequestParam(defaultValue="1") int pageNum,Model model){
		System.out.println("inv_status"+inv_status);
		int pageSize = 1;
		PageBean pb = spageBean.findAllSpend(inv_status, pageNum, pageSize);
		System.out.println("这是controller里显示的"+pb);
		model.addAttribute("spend",pb);
		return "expenditure";
		}
	//把数据从后台传到前台
	@RequestMapping(method=RequestMethod.GET,value="/toIas3",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE ) //将传过来的数据以json格式接收
	@ResponseBody
	public PageBean incomeAndSpend3(String inv_status,String pagenum){
		System.out.println(pagenum);
		int pageSize = 1;
		inv_status = "0";
		int pageNum=Integer.parseInt(pagenum);
		PageBean pb = spageBean.findAllSpend(inv_status, pageNum, pageSize);
		System.out.println("这是controller里显示的"+pb);
		return pb;
		
	}
	
	
	
	//收入分页
	@RequestMapping(method=RequestMethod.GET,value="/toIas2")
	public String incomeAndSpend2(String inv_status,@RequestParam(defaultValue="1") int pageNum,Model model){
		System.out.println("inv_status"+inv_status);
		int pageSize = 1;
		PageBean pb = spageBean.findAllSpend(inv_status, pageNum, pageSize);
		System.out.println("这是controller里显示的"+pb);
		model.addAttribute("inv", pb);
			return "income";
		}
	
	//把数据从后台传到前台
		@RequestMapping(method=RequestMethod.GET,value="/toIas4",
				produces = MediaType.APPLICATION_JSON_UTF8_VALUE ) //将传过来的数据以json格式接收
		@ResponseBody
		public PageBean incomeAndSpend4(String inv_status,String pagenum){
			System.out.println(pagenum);
			int pageSize = 1;
			inv_status = "0";
			int pageNum=Integer.parseInt(pagenum);
			PageBean pb = spageBean.findAllSpend(inv_status, pageNum, pageSize);
			System.out.println("这是controller里显示的"+pb);
			return pb;
			
		}
}	
