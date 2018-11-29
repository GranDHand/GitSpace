package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_News;
import stgl.mapper.NewsMapper;

@Service
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	private NewsMapper newsMapper;
	
	@Override
	public List<Stgl_News> allNews() {
		// TODO Auto-generated method stub
		System.out.println("所有新闻："+newsMapper.findAllNewMapper());
		return newsMapper.findAllNewMapper();
	}

}
