package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_ApplyActvitity;
import stgl.domain.Stgl_Ass_Activity;
import stgl.mapper.FindAssApplyMapper;

@Service
public class FindAssApplyServiceImpl implements FindAssApplyService {

	@Autowired
	private FindAssApplyMapper findAssApply;
	
	@Override
	public List<Stgl_ApplyActvitity> findAssApply() {
		// TODO Auto-generated method stub
		
		
		return findAssApply.findAssApply();
	}

	@Override
	public void delAssApply(String ass_id) {
		// TODO Auto-generated method stub
		findAssApply.delAssApply(ass_id);
	}

	@Override
	public void insertAssAct(String ass_act_ass_id,String ass_act_name,String ass_act_time,String ass_act_address) {
		// TODO Auto-generated method stub
		findAssApply.insertAssAct(ass_act_ass_id, ass_act_name, ass_act_time, ass_act_address);
	}

}
