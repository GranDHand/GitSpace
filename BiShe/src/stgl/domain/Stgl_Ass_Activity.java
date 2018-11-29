package stgl.domain;

public class Stgl_Ass_Activity {
	private int ass_act_id;
	private String ass_act_name;
	private String ass_act_time;
	private String ass_act_address;
	private String ass_act_ass_id;
	public Stgl_Ass_Activity(int ass_act_id, String ass_act_name, String ass_act_time, String ass_act_address,
			String ass_act_ass_id) {
		super();
		this.ass_act_id = ass_act_id;
		this.ass_act_name = ass_act_name;
		this.ass_act_time = ass_act_time;
		this.ass_act_address = ass_act_address;
		this.ass_act_ass_id = ass_act_ass_id;
	}
	public Stgl_Ass_Activity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAss_act_id() {
		return ass_act_id;
	}
	public void setAss_act_id(int ass_act_id) {
		this.ass_act_id = ass_act_id;
	}
	public String getAss_act_name() {
		return ass_act_name;
	}
	public void setAss_act_name(String ass_act_name) {
		this.ass_act_name = ass_act_name;
	}
	public String getAss_act_time() {
		return ass_act_time;
	}
	public void setAss_act_time(String ass_act_time) {
		this.ass_act_time = ass_act_time;
	}
	public String getAss_act_address() {
		return ass_act_address;
	}
	public void setAss_act_address(String ass_act_address) {
		this.ass_act_address = ass_act_address;
	}
	public String getAss_act_ass_id() {
		return ass_act_ass_id;
	}
	public void setAss_act_ass_id(String ass_act_ass_id) {
		this.ass_act_ass_id = ass_act_ass_id;
	}
	@Override
	public String toString() {
		return "Stgl_Ass_Activity [ass_act_id=" + ass_act_id + ", ass_act_name=" + ass_act_name + ", ass_act_time="
				+ ass_act_time + ", ass_act_address=" + ass_act_address + ", ass_act_ass_id=" + ass_act_ass_id + "]";
	}
	
}
