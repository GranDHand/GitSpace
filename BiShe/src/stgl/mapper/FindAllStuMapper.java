package stgl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import stgl.domain.Stgl_Stu;

public interface FindAllStuMapper {
	
	List<Stgl_Stu> findAllStu(String stu_username);
	//给社团成员分页
	List<Stgl_Stu> pagingAllMember(@Param("stu_username")String stu_username,@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);
}
