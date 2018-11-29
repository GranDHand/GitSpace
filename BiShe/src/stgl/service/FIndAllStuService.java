package stgl.service;


import stgl.domain.PageBean;
import stgl.domain.Stgl_Stu;

public interface FIndAllStuService {
	public PageBean<Stgl_Stu> findAllMember(String stu_username,int pageNum,int pageSize);
}
