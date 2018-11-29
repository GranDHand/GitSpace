package stgl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.mapper.UpdatePdMapper;

@Service
public class UpdatePdServiceImpl implements UpdatePdService {
	
	@Autowired
	private UpdatePdMapper updatePdMapper;
	
	@Override
	public void updatePd(String stu_username,String password) {
		// TODO Auto-generated method stub
		updatePdMapper.updatePd(stu_username,password);
	}

	@Override
	public String selUser(String stu_username) {
		// TODO Auto-generated method stub
		
		return updatePdMapper.selectUsername(stu_username);
	}

}
