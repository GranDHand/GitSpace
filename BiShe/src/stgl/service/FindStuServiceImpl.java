package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_Stu;
import stgl.mapper.FindStuMapper;


@Service
public class FindStuServiceImpl implements FindStuService{
	
	@Autowired
	private FindStuMapper findStuMapper;
	
	@Override
	public Stgl_Stu findStu(String username) {
		System.out.println("findStuMapper: " + findStuMapper.findStu(username));
		System.out.println("service" + username);
		return findStuMapper.findStu(username);
	}

}
