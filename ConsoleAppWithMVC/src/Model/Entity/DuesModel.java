package Model.Entity;

public class DuesModel {
	private int residentId;
	private String date;
	private int amount;
	private String description;
	private int billId;
	
	public DuesModel(int residentId, String date, int billId, int amount, String description) {
		this.residentId = residentId;
		this.date = date;
		this.amount = amount;
		this.description = description;
		this.billId = billId;
	}
	// Get
	public int getResidentId() {
		return this.residentId;
	}
	public String getDate() {
		return this.date;
	}
	public int getAmount() {
		return this.amount;
	}
	public String getDesc() {
		return this.description;
	}
	public int getBillId() {
		return this.billId;
	}
	
	// Set
	public void getResidentId(int residentId) {
		 this.residentId = residentId;
	}
	public void getDate(String date) {
		 this.date = date;
	}
	public void getAmount(int amount) {
		 this.amount = amount;
	}
	public void getDesc(String desc) {
		this.description = desc;
	}
	public void getBillId(int  billId) {
		 this.billId = billId;
	}
	
	@Override
	public String toString() {
		 return "\n\nDues: ResidentID: " + this.residentId + ", Date: " + this.date + ", Amount: " + this.amount
		        +  ", Description: " + this.description +  ", BillID: " + this.billId + "]";
	}
	
}
