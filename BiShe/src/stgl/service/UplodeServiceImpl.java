package stgl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_Stu;
import stgl.mapper.ImageMapper;

@Service
public class UplodeServiceImpl implements UplodeService {
	
	@Autowired
	private ImageMapper imageMapper;

	@Override
	public void uplode() {
		// TODO Auto-generated method stub

	}

	@Override
	public Stgl_Stu uplodeAssId(String stu_username) {
		// TODO Auto-generated method stub
		return imageMapper.uplodeAssId(stu_username);
	}

}
