package stgl.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import stgl.domain.Stgl_Image;
import stgl.domain.Stgl_Stu;
import stgl.service.UplodeService;

@Controller
public class UplodeController {
	
	@Autowired
	private UplodeService uplodeService;
	
	@RequestMapping(method=RequestMethod.GET,value="/uplode")
	public String uplodeService(String stu_username,Model model){
		Stgl_Stu stu = uplodeService.uplodeAssId(stu_username);
		model.addAttribute("stu", stu);
		return "upload";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/toUplode")
	public String insertImage(String img_stu_name,String img_ass_id,Stgl_Image image,HttpServletRequest request) throws IllegalStateException, IOException{
		System.out.println("111");
		CommonsMultipartResolver cmr = new CommonsMultipartResolver(request.getSession().getServletContext());
        cmr.setDefaultEncoding("utf-8");
        cmr.setMaxInMemorySize(40960);
        cmr.setMaxUploadSize(10485760000L);
        MultipartHttpServletRequest multipartRequest = cmr.resolveMultipart(request);
        MultipartFile file = multipartRequest.getFile("img_route");// 与页面input的name相同
        String fileName = file.getOriginalFilename();  
        System.out.println(fileName);
        // 获取图片的扩展名  
        String extensionName = fileName  
                .substring(fileName.lastIndexOf(".") + 1);  
        // 新的图片文件名 = 获取时间戳+"."图片扩展名  
        String newFileName = String.valueOf(System.currentTimeMillis())  
                + "." + extensionName;  
        File imageFile = new File("D:\\job\\eclipse\\DaiMa\\BiShe\\public\\imag",newFileName);// 上传后的文件保存目录及名字
        String imgurl="/Bishe/public/imag"+newFileName;
        if (!imageFile.exists()) { 
        	System.out.println("???");
        	imageFile.mkdirs();  
           }  
        file.transferTo(imageFile);// 将上传文件保存到相应位置       
        
      //把图片数据存入数据库
      		uplodeService.uplode();
		return "redirect:imglist";
	}
}
