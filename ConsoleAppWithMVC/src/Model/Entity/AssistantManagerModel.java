package Model.Entity;

public class AssistantManagerModel {
	private String name;
	private String surname;
	private int managerId;
	
	public AssistantManagerModel(String name, String surname, int managerId) {
		this.managerId = managerId;
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return this.name;
	}
	public String getSurname() {
		return this.surname;
	}
	public int getManagerId() {
		return this.managerId;
	}
	
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		 return "\n\nAssistant Manager: ManagerID: " + this.managerId + ", Name: " + this.name + ", surname: " + this.surname
		       + "]";
	}
	
}
