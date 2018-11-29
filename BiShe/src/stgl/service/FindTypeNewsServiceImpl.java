package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_News;
import stgl.mapper.NewsMapper;

@Service
public class FindTypeNewsServiceImpl implements FindTypeNewsService {
	
	@Autowired
	private NewsMapper newsMapper;
	
	@Override
	public List<Stgl_News> findTypeNew(String n_status) {
		// TODO Auto-generated method stub
		return newsMapper.findTypeNewMapper(n_status);
	}

}
