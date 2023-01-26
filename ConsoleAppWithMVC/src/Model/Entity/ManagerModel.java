package Model.Entity;

public class ManagerModel {
	int residentId;
	String name;
	String surname;
	int managerId;
	
	public ManagerModel(int residentId, String name, String surname, int managerId) {
		this.residentId = residentId;
		this.name = name;
		this.surname = surname;
		this.managerId = managerId;
	}
	
	public int getManagerResidentId() {
		return this.residentId;
	}
	public String getManagerName() {
		return this.name;
	}
	public String getManagerSurname() {
		return this.surname;
	}
	public int getManagerId() {
		return this.managerId;
	}
	
	public void setManagerResidentId(int id) {
		this.residentId = id;
	}
	public void setManagerName(String name) {
		this.name = name;
	}
	public void setManagerSurname(String surname) {
		this.surname = surname;
	}
	public void setManagerId(int id) {
		this.managerId = id;
	}
	
	@Override
	public String toString() {
		 return "\n\nManagers: ResidentID: " + this.residentId + ", Name: " + this.name + ", surname: " + this.surname
		        +  ", ManagerID: " + this.managerId + "]";
	}
	
	
}
