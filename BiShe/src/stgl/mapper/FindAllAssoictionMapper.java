package stgl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import stgl.domain.Stgl_Association;

public interface FindAllAssoictionMapper {
	//查询所有社团
	List<Stgl_Association> findAllAss();
	//随机查询10个社团
	List<Stgl_Association> findRomAss();
	//给社团分页
	List<Stgl_Association> pagingAllAss(@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);
	
}
