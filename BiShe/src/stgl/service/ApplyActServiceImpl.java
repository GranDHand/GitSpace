package stgl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_ApplyActvitity;
import stgl.mapper.ApplyActivityMapper;

@Service
public class ApplyActServiceImpl implements ApplyActService {

	@Autowired
	private ApplyActivityMapper aaMapper;
	
	@Override
	public void insertApply(Stgl_ApplyActvitity Stgl_aa) {
		// TODO Auto-generated method stub
		aaMapper.insertApply(Stgl_aa);
	}

}
