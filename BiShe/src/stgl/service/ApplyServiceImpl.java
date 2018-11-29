package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_Apply;
import stgl.domain.Stgl_Stu;
import stgl.mapper.ApplyMapper;

@Service
public class ApplyServiceImpl implements ApplyService{
	
	@Autowired
	private ApplyMapper applyService;
	
	@Override
	public List<Stgl_Apply> myApplyService(String username) {
		// TODO Auto-generated method stub
		System.out.println(applyService.myApply(username));
		return applyService.myApply(username);
	}

	@Override
	public Stgl_Stu ApplyNameService(String username) {
		// TODO Auto-generated method stub
		System.out.println(applyService.selectApplyName(username));
		return applyService.selectApplyName(username);
	}

}
