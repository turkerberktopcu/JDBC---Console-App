package Model.Entity;

public class BuildingModel {
	private int id;
	private String name;
	private String address;
	
	
	public BuildingModel(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
				
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	
	public void setId(int newId) {
		this.id = newId;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	
	@Override
	public String toString() {
		 return "\n\nBuildings: id: " + this.id + ", BuildingName: " + this.name + ", Address: " + this.address
		        + "]";
	}
	
	
	
	
	
}
