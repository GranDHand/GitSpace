package stgl.domain;


public class Stgl_News {
	
	private int n_id;
	private String n_p_time;
	private String n_state;
	private String n_content;
	private String n_title;
	private String n_p_unit;
	private String n_ass_id;
	public Stgl_News(int n_id, String n_p_time, String n_state, String n_content, String n_title, String n_p_unit,
			String n_ass_id) {
		super();
		this.n_id = n_id;
		this.n_p_time = n_p_time;
		this.n_state = n_state;
		this.n_content = n_content;
		this.n_title = n_title;
		this.n_p_unit = n_p_unit;
		this.n_ass_id = n_ass_id;
	}
	public Stgl_News() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getN_id() {
		return n_id;
	}
	public void setN_id(int n_id) {
		this.n_id = n_id;
	}
	public String getN_p_time() {
		return n_p_time;
	}
	public void setN_p_time(String n_p_time) {
		this.n_p_time = n_p_time;
	}
	public String getN_state() {
		return n_state;
	}
	public void setN_state(String n_state) {
		this.n_state = n_state;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public String getN_p_unit() {
		return n_p_unit;
	}
	public void setN_p_unit(String n_p_unit) {
		this.n_p_unit = n_p_unit;
	}
	public String getN_ass_id() {
		return n_ass_id;
	}
	public void setN_ass_id(String n_ass_id) {
		this.n_ass_id = n_ass_id;
	}
	@Override
	public String toString() {
		return "Stgl_News [n_id=" + n_id + ", n_p_time=" + n_p_time + ", n_state=" + n_state + ", n_content="
				+ n_content + ", n_title=" + n_title + ", n_p_unit=" + n_p_unit + ", n_ass_id=" + n_ass_id + "]";
	}
	
}
