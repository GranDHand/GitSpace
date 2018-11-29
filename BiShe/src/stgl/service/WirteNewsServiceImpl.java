package stgl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.mapper.WirteNewsMapper;

@Service
public class WirteNewsServiceImpl implements WirteNewsService {
	
	@Autowired
	private WirteNewsMapper wirteNewsMapper;
	
	@Override
	public void insertNewsService(String n_state,String n_p_time,String n_content,String n_title,String n_ass_id) {
		// TODO Auto-generated method stub
		wirteNewsMapper.insertNews(n_state, n_p_time, n_content, n_title, n_ass_id);
	}

	@Override
	public String selAssIdService(String stu_username) {
		// TODO Auto-generated method stub
		return wirteNewsMapper.selAssId(stu_username);
	}

}
