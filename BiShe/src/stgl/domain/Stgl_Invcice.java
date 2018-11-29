package stgl.domain;

public class Stgl_Invcice {
	private int inv_id;
	private String inv_name;
	private String inv_content;
	private String inv_time;
	private String inv_address;
	private int inv_money;
	private String inv_status;
	public Stgl_Invcice(int inv_id, String inv_name, String inv_content, String inv_time, String inv_address,
			int inv_money, String inv_status) {
		super();
		this.inv_id = inv_id;
		this.inv_name = inv_name;
		this.inv_content = inv_content;
		this.inv_time = inv_time;
		this.inv_address = inv_address;
		this.inv_money = inv_money;
		this.inv_status = inv_status;
	}
	public Stgl_Invcice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getInv_id() {
		return inv_id;
	}
	public void setInv_id(int inv_id) {
		this.inv_id = inv_id;
	}
	public String getInv_name() {
		return inv_name;
	}
	public void setInv_name(String inv_name) {
		this.inv_name = inv_name;
	}
	public String getInv_content() {
		return inv_content;
	}
	public void setInv_content(String inv_content) {
		this.inv_content = inv_content;
	}
	public String getInv_time() {
		return inv_time;
	}
	public void setInv_time(String inv_time) {
		this.inv_time = inv_time;
	}
	public String getInv_address() {
		return inv_address;
	}
	public void setInv_address(String inv_address) {
		this.inv_address = inv_address;
	}
	public int getInv_money() {
		return inv_money;
	}
	public void setInv_money(int inv_money) {
		this.inv_money = inv_money;
	}
	public String getInv_status() {
		return inv_status;
	}
	public void setInv_status(String inv_status) {
		this.inv_status = inv_status;
	}
	@Override
	public String toString() {
		return "Stgl_Invcice [inv_id=" + inv_id + ", inv_name=" + inv_name + ", inv_content=" + inv_content
				+ ", inv_time=" + inv_time + ", inv_address=" + inv_address + ", inv_money=" + inv_money
				+ ", inv_status=" + inv_status + "]";
	}
	
}
