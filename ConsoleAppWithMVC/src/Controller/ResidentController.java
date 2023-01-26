package Controller;

import java.util.*;
import Model.*;
import Model.DAO.ResidentDAO;
import Model.Entity.*;
import src.*;
import View.*;

public class ResidentController {
	
	ResidentDAO dao = new ResidentDAO();
	
	public List<ResidentModel> getAllResident(){
		return dao.getAllResident();
	}
	
	public ResidentModel getOneResident(int id) {
		return dao.getOneResident(id);
	}
	
	public boolean createResident(int apartmentId, String name, String surname) {
		return dao.createResident(apartmentId, name, surname);
	}
	
	public ResidentModel updateResident(int residentID, int apartmentID,String name,String surname) {
		return dao.updateResident(residentID,apartmentID,name,surname);
	}
	public boolean deleteResident(int id) {
		return dao.deleteResident(id);
	}
}
