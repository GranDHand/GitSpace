package stgl.domain;

import java.util.List;

public class Stgl_Apply {
	private String app_stu_username; //申请人学号
	private String app_ass_name; //申请加入的社团名
	private String app_ass_id;  //申请加入的社团ID
	private String app_state;   //申请状态（已申请，正在审核，审核通过）
	private List<Stgl_Stu> stu;
	public Stgl_Apply(String app_stu_username, String app_ass_name, String app_ass_id, String app_state,
			List<Stgl_Stu> stu) {
		super();
		this.app_stu_username = app_stu_username;
		this.app_ass_name = app_ass_name;
		this.app_ass_id = app_ass_id;
		this.app_state = app_state;
		this.stu = stu;
	}
	public Stgl_Apply() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getApp_stu_username() {
		return app_stu_username;
	}
	public void setApp_stu_username(String app_stu_username) {
		this.app_stu_username = app_stu_username;
	}
	public String getApp_ass_name() {
		return app_ass_name;
	}
	public void setApp_ass_name(String app_ass_name) {
		this.app_ass_name = app_ass_name;
	}
	public String getApp_ass_id() {
		return app_ass_id;
	}
	public void setApp_ass_id(String app_ass_id) {
		this.app_ass_id = app_ass_id;
	}
	public String getApp_state() {
		return app_state;
	}
	public void setApp_state(String app_state) {
		this.app_state = app_state;
	}
	public List<Stgl_Stu> getStu() {
		return stu;
	}
	public void setStu(List<Stgl_Stu> stu) {
		this.stu = stu;
	}
	@Override
	public String toString() {
		return "Stgl_Apply [app_stu_username=" + app_stu_username + ", app_ass_name=" + app_ass_name + ", app_ass_id="
				+ app_ass_id + ", app_state=" + app_state + ", stu=" + stu + "]";
	}
	
}
