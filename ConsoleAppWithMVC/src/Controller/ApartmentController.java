package Controller;

import java.util.List;

import Model.*;
import Model.Entity.ApartmentModel;
import src.*;
import View.*;
import Model.Entity.*;
import Model.DAO.*;


public class ApartmentController {
	ApartmentDAO dao = new ApartmentDAO();
	
	public List<ApartmentModel> getAllApartments() {
		return dao.getAllApartments();
	}

	public ApartmentModel getOneApartment(int id) {
		return dao.getOneApartment(id);
	}

	public boolean createApartment(int buildingID, int apartmentNumber) {
		// TODO Auto-generated method stub
		return dao.createApartment(buildingID,apartmentNumber);
	}

	public ApartmentModel updateApartmemnt(int id, int buildingID, int apartmentNumber) {
		return dao.updateApartment(id,buildingID,apartmentNumber);
	}

	public boolean deleteApartment(int apartmentID) {
		return dao.deleteApartment(apartmentID);
	}
	
	
	
	
}
