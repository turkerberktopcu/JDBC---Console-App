package Model.Entity;


public class ExpensesModel {
	String date;
	int electric;
	int security;
	int water;
	int heating;
	int gardener;
	int doorman;
	int unrepetitives;
	
	
	public ExpensesModel(String date, int electric, int security, int water, int heating, int gardener, int doorman,
			int unrepetitives) {

		this.date = date;
		this.electric = electric;
		this.security = security;
		this.water = water;
		this.heating = heating;
		this.gardener = gardener;
		this.doorman = doorman;
		this.unrepetitives = unrepetitives;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getElectric() {
		return electric;
	}
	public void setElectric(int electric) {
		this.electric = electric;
	}
	
	
	public int getSecurity() {
		return security;
	}
	public void setSecurity(int security) {
		this.security = security;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getHeating() {
		return heating;
	}
	public void setHeating(int heating) {
		this.heating = heating;
	}
	public int getGardener() {
		return gardener;
	}
	public void setGardener(int gardener) {
		this.gardener = gardener;
	}
	public int getDoorman() {
		return doorman;
	}
	public void setDoorman(int doorman) {
		this.doorman = doorman;
	}
	public int getUnrepetitives() {
		return unrepetitives;
	}
	public void setUnrepetitives(int unrepetitives) {
		this.unrepetitives = unrepetitives;
	}
	
	@Override
	public String toString() {
		 return "\n\n[ Expenses: Date: " + this.date + ", Electric: " + this.electric + ", Security: " + this.security
				 + ", Water: " + this.water+ ", Heating: " + this.heating+ ", Gardener: " + this.gardener+ ", Doorman: " + this.doorman + ", Unrepetitives: " + this.unrepetitives + " ]";
	}
	
}
