package stgl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import stgl.domain.Stgl_ApplyActvitity;

public interface FindAssApplyMapper {
	//查到所有的活动申请
	public List<Stgl_ApplyActvitity> findAssApply();
	
	//同意活动申请
	//删除申请表里的记录 通过ID来删除
	public void delAssApply(String ass_id);
	//在该社团的活动表里面添加数据
	public void insertAssAct(@Param("ass_act_ass_id")String ass_act_ass_id,@Param("ass_act_name")String ass_act_name,
			@Param("ass_act_time")String ass_act_time,@Param("ass_act_address")String ass_act_address);
}
