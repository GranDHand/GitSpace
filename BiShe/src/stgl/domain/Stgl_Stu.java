package stgl.domain;
//学生表
public class Stgl_Stu {
	private int stu_id;
	private String stu_name;     //学生姓名
	private String stu_sex;
	private String stu_username; //账号  就是学号
	private String stu_password;
	private String stu_major;
	private String stu_class;
	private String stu_tel;
	private String stu_address;
	private String stu_grade;
	private String stu_state;
	private String stu_type;
	private String stu_assocition_id;  //社团ID
	private Stgl_Apply apply;
	public Stgl_Stu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stgl_Stu(int stu_id, String stu_name, String stu_sex, String stu_username, String stu_password,
			String stu_major, String stu_class, String stu_tel, String stu_address, String stu_grade, String stu_state,
			String stu_type, String stu_assocition_id, Stgl_Apply apply) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_sex = stu_sex;
		this.stu_username = stu_username;
		this.stu_password = stu_password;
		this.stu_major = stu_major;
		this.stu_class = stu_class;
		this.stu_tel = stu_tel;
		this.stu_address = stu_address;
		this.stu_grade = stu_grade;
		this.stu_state = stu_state;
		this.stu_type = stu_type;
		this.stu_assocition_id = stu_assocition_id;
		this.apply = apply;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(String stu_sex) {
		this.stu_sex = stu_sex;
	}
	public String getStu_username() {
		return stu_username;
	}
	public void setStu_username(String stu_username) {
		this.stu_username = stu_username;
	}
	public String getStu_password() {
		return stu_password;
	}
	public void setStu_password(String stu_password) {
		this.stu_password = stu_password;
	}
	public String getStu_major() {
		return stu_major;
	}
	public void setStu_major(String stu_major) {
		this.stu_major = stu_major;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}
	public String getStu_tel() {
		return stu_tel;
	}
	public void setStu_tel(String stu_tel) {
		this.stu_tel = stu_tel;
	}
	public String getStu_address() {
		return stu_address;
	}
	public void setStu_address(String stu_address) {
		this.stu_address = stu_address;
	}
	public String getStu_grade() {
		return stu_grade;
	}
	public void setStu_grade(String stu_grade) {
		this.stu_grade = stu_grade;
	}
	public String getStu_state() {
		return stu_state;
	}
	public void setStu_state(String stu_state) {
		this.stu_state = stu_state;
	}
	public String getStu_type() {
		return stu_type;
	}
	public void setStu_type(String stu_type) {
		this.stu_type = stu_type;
	}
	public String getStu_assocition_id() {
		return stu_assocition_id;
	}
	public void setStu_assocition_id(String stu_assocition_id) {
		this.stu_assocition_id = stu_assocition_id;
	}
	public Stgl_Apply getApply() {
		return apply;
	}
	public void setApply(Stgl_Apply apply) {
		this.apply = apply;
	}
	@Override
	public String toString() {
		return "Stgl_Stu [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_sex=" + stu_sex + ", stu_username="
				+ stu_username + ", stu_password=" + stu_password + ", stu_major=" + stu_major + ", stu_class="
				+ stu_class + ", stu_tel=" + stu_tel + ", stu_address=" + stu_address + ", stu_grade=" + stu_grade
				+ ", stu_state=" + stu_state + ", stu_type=" + stu_type + ", stu_assocition_id=" + stu_assocition_id
				+ ", apply=" + apply + "]";
	}
	
	
}
