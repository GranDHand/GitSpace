package stgl.service;

import java.util.List;

import stgl.domain.Stgl_ApplyActvitity;

public interface FindAssApplyService {
	public List<Stgl_ApplyActvitity> findAssApply();
	//同意活动申请
		//删除申请表里的记录 通过ID来删除
		public void delAssApply(String ass_id);
		//在该社团的活动表里面添加数据
		public void insertAssAct(String ass_act_ass_id,String ass_act_name,String ass_act_time,String ass_act_address);
}
