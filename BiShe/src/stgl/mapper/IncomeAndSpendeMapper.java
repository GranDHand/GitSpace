package stgl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import stgl.domain.Stgl_Invcice;

public interface IncomeAndSpendeMapper {
	List<Stgl_Invcice> incomeAndSpend(String inv_status);
	//给收入支出分页
	List<Stgl_Invcice> pagingAllAss(@Param("inv_status") String inv_status,@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);
}
