package stgl.domain;

public class Increment {

	private String name;
	private String presidentName;
	private String memberNum;
	private String presidentPhone;
	private String totalFunds;
	private String useFunds;
	public Increment(String name, String presidentName, String memberNum, String presidentPhone, String totalFunds,
			String useFunds) {
		super();
		this.name = name;
		this.presidentName = presidentName;
		this.memberNum = memberNum;
		this.presidentPhone = presidentPhone;
		this.totalFunds = totalFunds;
		this.useFunds = useFunds;
	}
	public Increment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPresidentName() {
		return presidentName;
	}
	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getPresidentPhone() {
		return presidentPhone;
	}
	public void setPresidentPhone(String presidentPhone) {
		this.presidentPhone = presidentPhone;
	}
	public String getTotalFunds() {
		return totalFunds;
	}
	public void setTotalFunds(String totalFunds) {
		this.totalFunds = totalFunds;
	}
	public String getUseFunds() {
		return useFunds;
	}
	public void setUseFunds(String useFunds) {
		this.useFunds = useFunds;
	}
	@Override
	public String toString() {
		return "Increment [name=" + name + ", presidentName=" + presidentName + ", memberNum=" + memberNum
				+ ", presidentPhone=" + presidentPhone + ", totalFunds=" + totalFunds + ", useFunds=" + useFunds + "]";
	}
	
}
