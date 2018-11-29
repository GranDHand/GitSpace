package stgl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.mapper.StuApplyMapper;

@Service
public class StuApplyServiceImpl implements StuApplyService {
	
	@Autowired
	private StuApplyMapper stuApply;
	
	@Override
	public void stuApply(String app_stu_username, String app_ass_id) {
		// TODO Auto-generated method stub
		stuApply.stuApply(app_stu_username, app_ass_id);
	}
	
	//删除申请记录
	@Override
	public void delStuApply(String stu_username) {
		// TODO Auto-generated method stub
		stuApply.delStuApply(stu_username);
		
	}
	//审核通过时修改信息
	@Override
	public void upStuInf(String stu_username, String stu_assocition_id, String stu_state) {
		// TODO Auto-generated method stub
		stuApply.upStuInf(stu_username, stu_assocition_id, stu_state);
	}

}
