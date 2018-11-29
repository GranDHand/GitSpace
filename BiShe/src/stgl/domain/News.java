package stgl.domain;

public class News {
	
	private String time;
	private int state;
	private String content;
	private String title;
	private String unit;
	public News(String time, int state, String content, String title, String unit) {
		super();
		this.time = time;
		this.state = state;
		this.content = content;
		this.title = title;
		this.unit = unit;
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "News [time=" + time + ", state=" + state + ", content=" + content + ", title=" + title + ", unit="
				+ unit + "]";
	}
	
}
