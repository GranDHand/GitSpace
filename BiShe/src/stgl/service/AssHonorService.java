package stgl.service;


import stgl.domain.PageBean;
import stgl.domain.Stgl_Ass_Honor;

public interface AssHonorService {
	public String findAss_IdService(String stu_username);
	
	public PageBean<Stgl_Ass_Honor> assHonorService(String ass_id,int pageNum,int pageSize);
}
