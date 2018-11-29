package stgl.service;

import java.util.List;

import stgl.domain.Stgl_Stu;

/**
 * 申请审核
 * @author hyu25
 *
 */
public interface ApplyExamineService {
	
		//拿到管理员的社团ID
		public Stgl_Stu getAssIdService(String stu_username);
		
		//从申请表中查到学号，并通过社团Id拿到学生的信息。
		public  List<Stgl_Stu> getStuService(Stgl_Stu stu_assocition_id);
}
