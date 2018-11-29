package stgl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import stgl.domain.Stgl_Stu;
import stgl.domain.Stgl_message;

public interface SendMessageMapper{
	
	//这是通过学号拿用户名和社团ID
	Stgl_Stu sendMessage(String stu_username);
	
	//把通过上个方法得到的信息存入留言表中
	void insertMessage(@Param("m_content")String m_content,@Param("m_stu_name")String m_stu_name,@Param("m_ass_id")String m_ass_id);
	//把留言表中的数据库按社团ID查询出来
	List<Stgl_message> selMessage(String m_ass_id);
	
}
