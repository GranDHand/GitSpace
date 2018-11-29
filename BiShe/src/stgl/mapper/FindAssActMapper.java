package stgl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import stgl.domain.Stgl_Ass_Activity;

public interface FindAssActMapper {
	
	public List<Stgl_Ass_Activity> findAllAct(String ass_id);
	
	public List<Stgl_Ass_Activity> assActivity(@Param("ass_id")String ass_id,@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);
	
}
