package stgl.service;


import org.apache.ibatis.annotations.Param;

import stgl.domain.PageBean;
import stgl.domain.Stgl_Ass_Activity;

public interface FindAssActService {
	
	public PageBean<Stgl_Ass_Activity> assActivityService(@Param("ass_id")String ass_id,@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);
}
