package stgl.domain;

public class Stgl_ApplyActvitity {
	private int act_id;
	private int act_ass_id;
	private String act_stusname;
	private String act_tel;
	private String act_name;
	private String act_time;
	private String act_address;
	private String act_content;
	private String act_status;
	public Stgl_ApplyActvitity(int act_id, int act_ass_id, String act_stusname, String act_tel, String act_name,
			String act_time, String act_address, String act_content, String act_status) {
		super();
		this.act_id = act_id;
		this.act_ass_id = act_ass_id;
		this.act_stusname = act_stusname;
		this.act_tel = act_tel;
		this.act_name = act_name;
		this.act_time = act_time;
		this.act_address = act_address;
		this.act_content = act_content;
		this.act_status = act_status;
	}
	public Stgl_ApplyActvitity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAct_id() {
		return act_id;
	}
	public void setAct_id(int act_id) {
		this.act_id = act_id;
	}
	public int getAct_ass_id() {
		return act_ass_id;
	}
	public void setAct_ass_id(int act_ass_id) {
		this.act_ass_id = act_ass_id;
	}
	public String getAct_stusname() {
		return act_stusname;
	}
	public void setAct_stusname(String act_stusname) {
		this.act_stusname = act_stusname;
	}
	public String getAct_tel() {
		return act_tel;
	}
	public void setAct_tel(String act_tel) {
		this.act_tel = act_tel;
	}
	public String getAct_name() {
		return act_name;
	}
	public void setAct_name(String act_name) {
		this.act_name = act_name;
	}
	public String getAct_time() {
		return act_time;
	}
	public void setAct_time(String act_time) {
		this.act_time = act_time;
	}
	public String getAct_address() {
		return act_address;
	}
	public void setAct_address(String act_address) {
		this.act_address = act_address;
	}
	public String getAct_content() {
		return act_content;
	}
	public void setAct_content(String act_content) {
		this.act_content = act_content;
	}
	public String getAct_status() {
		return act_status;
	}
	public void setAct_status(String act_status) {
		this.act_status = act_status;
	}
	@Override
	public String toString() {
		return "Stgl_ApplyActvitity [act_id=" + act_id + ", act_ass_id=" + act_ass_id + ", act_stusname=" + act_stusname
				+ ", act_tel=" + act_tel + ", act_name=" + act_name + ", act_time=" + act_time + ", act_address="
				+ act_address + ", act_content=" + act_content + ", act_status=" + act_status + "]";
	}
	
	
}
