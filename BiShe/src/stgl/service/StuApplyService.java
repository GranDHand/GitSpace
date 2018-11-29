package stgl.service;


public interface StuApplyService {
	public void stuApply(String app_stu_username,String app_ass_id);
	
	//通过ajax传过来的学号来删除申请记录
	public void delStuApply(String stu_username);
	
	//如果申请通过就修改学生的信息STU_Assocition_id为申请的社团ID，如果没有就不修改
	public void upStuInf(String stu_username,String stu_assocition_id,String stu_state);
}
