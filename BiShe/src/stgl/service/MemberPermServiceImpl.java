package stgl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.mapper.MemberPermMapper;

@Service
public class MemberPermServiceImpl implements MemberPermService{
	
	@Autowired
	private MemberPermMapper memberPermMapper;
	
	@Override
	public void updatePerm(String stu_type, String stu_username, String ass_name) {
		// TODO Auto-generated method stub
		memberPermMapper.updatePerm(stu_type, stu_username, ass_name);
	}

}
