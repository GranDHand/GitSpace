package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_Stu;
import stgl.mapper.StuApplyMapper;


@Service
public class ApplyExamineServiceImpl implements ApplyExamineService {
	
	@Autowired
	private StuApplyMapper stuApply;
	
	
	//通过管理员的学号来确定社团ID
	@Override
	public Stgl_Stu getAssIdService(String stu_username) {
		// TODO Auto-generated method stub
		return stuApply.getAssId(stu_username);
	}

	//通过社团ID照到申请人的信息
	@Override
	public  List<Stgl_Stu> getStuService(Stgl_Stu stu_assocition_id) {
		// TODO Auto-generated method stub
		return stuApply.getStu(stu_assocition_id);
	}

}
