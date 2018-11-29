package stgl.mapper;

import org.apache.ibatis.annotations.Param;

public interface MemberPermMapper {
	
	void updatePerm(@Param("stu_type")String stu_type,@Param("stu_username")String stu_username,@Param("ass_name")String ass_name);
	
}
