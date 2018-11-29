package stgl.service;

import java.util.List;

import stgl.domain.Stgl_Stu;
import stgl.domain.Stgl_message;

public interface SendMessageService {
	//这是通过学号拿用户名和社团ID
		Stgl_Stu sendMessageService(String stu_username);
		
		//把通过上个方法得到的信息存入留言表中
		void insertMessageService(String m_content,String m_stu_name,String m_ass_id);
		//把留言表中的数据库按社团ID查询出来
		List<Stgl_message> selMessageService(String m_ass_id);
}
