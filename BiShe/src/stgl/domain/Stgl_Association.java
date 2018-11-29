package stgl.domain;
/*
 * 社团表
 */
public class Stgl_Association {
	private int ass_id;
	private String ass_name;  //社团名
	private String ass_presidentName; //社长名
	private String ass_memberNum; //成员数量
	private String ass_presidentPhone;  //社长电话
	private String ass_totalFunds;  //总资金
	private String ass_useFunds;  // 用去的资金
	public Stgl_Association(int ass_id ,String ass_name, String ass_presidentName, String ass_memberNum, String ass_presidentPhone,
			String ass_totalFunds, String ass_useFunds) {
		super();
		this.ass_id = ass_id;
		this.ass_name = ass_name;
		this.ass_presidentName = ass_presidentName;
		this.ass_memberNum = ass_memberNum;
		this.ass_presidentPhone = ass_presidentPhone;
		this.ass_totalFunds = ass_totalFunds;
		this.ass_useFunds = ass_useFunds;
	}
	public int getAss_id() {
		return ass_id;
	}
	public void setAss_id(int ass_id) {
		this.ass_id = ass_id;
	}
	public Stgl_Association() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAss_name() {
		return ass_name;
	}
	public void setAss_name(String ass_name) {
		this.ass_name = ass_name;
	}
	public String getAss_presidentName() {
		return ass_presidentName;
	}
	public void setAss_presidentName(String ass_presidentName) {
		this.ass_presidentName = ass_presidentName;
	}
	public String getAss_memberNum() {
		return ass_memberNum;
	}
	public void setAss_memberNum(String ass_memberNum) {
		this.ass_memberNum = ass_memberNum;
	}
	public String getAss_presidentPhone() {
		return ass_presidentPhone;
	}
	public void setAss_presidentPhone(String ass_presidentPhone) {
		this.ass_presidentPhone = ass_presidentPhone;
	}
	public String getAss_totalFunds() {
		return ass_totalFunds;
	}
	public void setAss_totalFunds(String ass_totalFunds) {
		this.ass_totalFunds = ass_totalFunds;
	}
	public String getAss_useFunds() {
		return ass_useFunds;
	}
	public void setAss_useFunds(String ass_useFunds) {
		this.ass_useFunds = ass_useFunds;
	}
	@Override
	public String toString() {
		return "Stgl_Association [ass_id=" + ass_id + ", ass_name=" + ass_name + ", ass_presidentName="
				+ ass_presidentName + ", ass_memberNum=" + ass_memberNum + ", ass_presidentPhone=" + ass_presidentPhone
				+ ", ass_totalFunds=" + ass_totalFunds + ", ass_useFunds=" + ass_useFunds + "]";
	}
	
}
