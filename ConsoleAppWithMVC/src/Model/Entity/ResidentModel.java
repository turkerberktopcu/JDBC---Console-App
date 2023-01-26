package Model.Entity;

public class ResidentModel {
	private int residentId;
	private int apartmentId;
	private String name;
	private String surname;
	
	public ResidentModel (int residentId, int apartmentId, String name, String surname) {
		this.residentId = residentId;
		this.apartmentId = apartmentId;
		this.name = name;
		this.surname = surname;
	}
	
	public int getResidentId() {
		return this.residentId;
	}
	public int getApartmentId() {
		return this.apartmentId;
	}
	public String getName() {
		return this.name;
	}
	public String getSurname() {
		return this.surname;
	}
	
	public void setResidentId(int id) {
		this.residentId = id;
	}
	public void setApartmentId(int id) {
		this.apartmentId = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		 return "\n\nResidents: ResidentId: " + this.residentId + ", ApartmentId: " + this.apartmentId + ", Name: " + this.name + ", Surname: " + this.surname
		        + "]";
	}
}
