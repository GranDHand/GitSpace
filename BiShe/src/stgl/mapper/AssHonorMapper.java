package stgl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import stgl.domain.Stgl_Ass_Honor;

public interface AssHonorMapper {
	
	public String findAssId(String stu_username);
	
	public List<Stgl_Ass_Honor> findAllHonor(String ass_id);
	
	public List<Stgl_Ass_Honor> assHonor(@Param("ass_id")String ass_id,@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);
}
