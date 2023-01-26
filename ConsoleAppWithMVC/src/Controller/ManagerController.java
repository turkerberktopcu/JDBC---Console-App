package Controller;

import java.util.*;

import Model.*;
import Model.DAO.*;
import Model.Entity.*;
import src.*;
import View.*;

public class ManagerController {
	
	ManagerDAO dao = new ManagerDAO();
	
	public List<ManagerModel> getAllManagers(){
		return dao.getAllManagers();
	}
	public ManagerModel getOneManager(int id) {
		return dao.getOneManager(id);
	}
	
	public boolean createManager(int residentId, String name, String surname) {
		return dao.createManager(residentId, name, surname);
	}
	
	public boolean updateManager(int residentId, String name, String surname, int managerId) {
		return dao.updateManager(residentId,name,surname,managerId);
	}
	
	public boolean deleteManager(int id) {
		return dao.deleteManager(id);
	}
}
