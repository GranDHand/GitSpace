package stgl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_Stu;
import stgl.mapper.UpdataPersonInfMapper;

@Service
public class UpdataInfServiceImpl implements UpdataInfService {
	
	@Autowired
	private UpdataPersonInfMapper updataPersonInfMapper;
	
	@Override
	public void updataPerInf(Stgl_Stu stgl) {
		// TODO Auto-generated method stub
		 updataPersonInfMapper.updataInf(stgl);
		System.out.println("1111111");
	}

}
