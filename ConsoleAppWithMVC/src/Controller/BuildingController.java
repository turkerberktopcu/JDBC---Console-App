package Controller;

import java.sql.*;
import java.util.*;
import Model.DAO.*;
import Model.Entity.*;
import src.*;
import View.*;


public class BuildingController {
	
	BuildingDAO dao = new BuildingDAO();

	
	public List<BuildingModel> getAllBuildings(){
		return dao.getAllBuildings();
	}
	
	public BuildingModel getOneBuilding(int idToGet) {
		return dao.getOneBuilding(idToGet);
	}
	
	public BuildingModel createBuilding(String name, String address) {
		return dao.createBuilding(name, address);
	}
	
	public BuildingModel updateBuilding(int id, String name, String address) {
		return dao.updateBuilding(id,name,address);
	}
	
	public boolean deleteBuilding(int id) {
		return dao.deleteBuilding(id);
	}
	
	
}
