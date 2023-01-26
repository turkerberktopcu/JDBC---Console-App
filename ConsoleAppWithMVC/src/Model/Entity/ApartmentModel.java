package Model.Entity;

public class ApartmentModel {
	int buildingID;
	int apartmentNumber;
	int apartmentID;
	
	public ApartmentModel(int buildingID, int apartmentNumber, int apartmentID) {
		
		this.buildingID = buildingID;
		this.apartmentNumber = apartmentNumber;
		this.apartmentID = apartmentID;
	}
	public int getBuildingID() {
		return buildingID;
	}
	public void setBuildingID(int buildingID) {
		this.buildingID = buildingID;
	}
	public int getApartmentNumber() {
		return apartmentNumber;
	}
	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
	public int getApartmentID() {
		return apartmentID;
	}
	public void setApartmentID(int apartmentID) {
		this.apartmentID = apartmentID;
	}
	
	
	@Override
	public String toString() {
		 return "\n\nApartments: BuildingID: " + this.buildingID + ", Apartment Number: " + this.apartmentNumber + ", ApartmentID: " + this.apartmentID
		       + "]";
	}
	
	
	
}
