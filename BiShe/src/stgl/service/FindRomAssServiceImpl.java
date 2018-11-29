package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_Association;
import stgl.mapper.FindAllAssoictionMapper;

@Service
public class FindRomAssServiceImpl implements FindRomAssService{
	
	@Autowired
	private FindAllAssoictionMapper findRom;

	@Override
	public List<Stgl_Association> findRomAssService() {
		// TODO Auto-generated method stub
		System.out.println("随机的10条数据"+findRom.findRomAss());
		return findRom.findRomAss();
	}
	
	
}
