package stgl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.mapper.DelAssMapper;

@Service
public class DelAssServiceImpl implements DelAssSerive {
	
	@Autowired
	private DelAssMapper delAssmapper;
	
	@Override
	public void delAssService(int ass_id) {
		// TODO Auto-generated method stub
		delAssmapper.delAss(ass_id);
	}

}
