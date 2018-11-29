package stgl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import stgl.domain.Stgl_Stu;

public interface StuApplyMapper {
	
	//学生申请加入社团后吧资料传入数据库
	public void stuApply(@Param("app_stu_username") String app_stu_username,@Param("app_ass_id") String app_ass_id );
	
	//拿到管理员的社团ID
	public Stgl_Stu getAssId(String stu_username);
	
	//从申请表中查到学号，并通过社团Id拿到学生的信息。
	public List<Stgl_Stu> getStu(Stgl_Stu stu_assocition_id);
	
	//通过ajax传过来的学号来删除申请记录
	public void delStuApply(String stu_username);
	//如果申请通过就修改学生的信息STU_Assocition_id为申请的社团ID，如果没有就不修改
	public void upStuInf(@Param("stu_username") String stu_username,@Param("stu_assocition_id") String stu_assocition_id,@Param("stu_state") String stu_state);
}
 