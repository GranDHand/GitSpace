package stgl.service;


public interface WirteNewsService {
	
	public String selAssIdService(String stu_username);
	
	public void insertNewsService(String n_state,String n_p_time,String n_content,String n_title,String n_ass_id);
}
