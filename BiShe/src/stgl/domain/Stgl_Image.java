package stgl.domain;

public class Stgl_Image {
	
	private int img_id;
	private String img_name;
	private String img_route;
	private String img_stu_name; //上传人姓名
	private int img_ass_id;
	public Stgl_Image(int img_id, String img_name, String img_route, String img_stu_name, int img_ass_id) {
		super();
		this.img_id = img_id;
		this.img_name = img_name;
		this.img_route = img_route;
		this.img_stu_name = img_stu_name;
		this.img_ass_id = img_ass_id;
	}
	public Stgl_Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getImg_id() {
		return img_id;
	}
	public void setImg_id(int img_id) {
		this.img_id = img_id;
	}
	public String getImg_name() {
		return img_name;
	}
	public void setImg_name(String img_name) {
		this.img_name = img_name;
	}
	public String getImg_route() {
		return img_route;
	}
	public void setImg_route(String img_route) {
		this.img_route = img_route;
	}
	public String getImg_stu_name() {
		return img_stu_name;
	}
	public void setImg_stu_name(String img_stu_name) {
		this.img_stu_name = img_stu_name;
	}
	public int getImg_ass_id() {
		return img_ass_id;
	}
	public void setImg_ass_id(int img_ass_id) {
		this.img_ass_id = img_ass_id;
	}
	@Override
	public String toString() {
		return "Stgl_Image [img_id=" + img_id + ", img_name=" + img_name + ", img_route=" + img_route
				+ ", img_stu_name=" + img_stu_name + ", img_ass_id=" + img_ass_id + "]";
	}
	
	
}
