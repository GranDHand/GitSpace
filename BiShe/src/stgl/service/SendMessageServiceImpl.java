package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_Stu;
import stgl.domain.Stgl_message;
import stgl.mapper.SendMessageMapper;

@Service
public class SendMessageServiceImpl implements SendMessageService {
	
	@Autowired
	private SendMessageMapper sendMessageMapper;
	
	@Override
	public Stgl_Stu sendMessageService(String stu_username) {
		// TODO Auto-generated method stub
		return sendMessageMapper.sendMessage(stu_username);
	}

	@Override
	public void insertMessageService(String m_content, String m_stu_name, String m_ass_id) {
		// TODO Auto-generated method stub
		sendMessageMapper.insertMessage(m_content, m_stu_name, m_ass_id);
	}

	@Override
	public List<Stgl_message> selMessageService(String m_ass_id) {
		// TODO Auto-generated method stub
		return sendMessageMapper.selMessage(m_ass_id);
	}

}
