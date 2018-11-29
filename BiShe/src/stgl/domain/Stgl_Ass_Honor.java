package stgl.domain;

public class Stgl_Ass_Honor {
	private int h_id;
	private String h_name;
	private String h_time;
	private String h_ass_id;
	public Stgl_Ass_Honor(int h_id, String h_name, String h_time, String h_ass_id) {
		super();
		this.h_id = h_id;
		this.h_name = h_name;
		this.h_time = h_time;
		this.h_ass_id = h_ass_id;
	}
	public Stgl_Ass_Honor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public String getH_name() {
		return h_name;
	}
	public void setH_name(String h_name) {
		this.h_name = h_name;
	}
	public String getH_time() {
		return h_time;
	}
	public void setH_time(String h_time) {
		this.h_time = h_time;
	}
	public String getH_ass_id() {
		return h_ass_id;
	}
	public void setH_ass_id(String h_ass_id) {
		this.h_ass_id = h_ass_id;
	}
	@Override
	public String toString() {
		return "Stgl_Ass_Honor [h_id=" + h_id + ", h_name=" + h_name + ", h_time=" + h_time + ", h_ass_id=" + h_ass_id
				+ "]";
	}
	
}
