package stgl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_News;
import stgl.mapper.LookNewMapper;

@Service
public class LookNewServiceImpl implements LookNewService {
	
	@Autowired
	private LookNewMapper looknewMapper;
	
	@Override
	public Stgl_News lookNewsService(String n_id) {
		// TODO Auto-generated method stub
		return looknewMapper.selLookNews(n_id);
	}

}
