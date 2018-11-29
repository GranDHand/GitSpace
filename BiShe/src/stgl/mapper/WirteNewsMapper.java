package stgl.mapper;

import org.apache.ibatis.annotations.Param;


public interface WirteNewsMapper {
	
	public String selAssId(String stu_username);
	
	public void insertNews(@Param("n_state") String n_state,@Param("n_p_time")String n_p_time,
			@Param("n_content")String n_content,@Param("n_title")String n_title,
			@Param("n_ass_id")String n_ass_id);
}
