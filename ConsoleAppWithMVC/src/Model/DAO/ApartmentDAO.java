package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Entity.ApartmentModel;
import Model.Entity.AssistantManagerModel;
import src.DatabaseConnector;

public class ApartmentDAO {
	private String getAllSQL = " select * from dbo.Apartment"; 
	private String getOneSQL = " select * from dbo.Apartment where ApartmentID = ? "; 
	private final String createApartment = "insert into dbo.Apartment (BuildingID, ApartmentNumber)values (?,?)";
	private final String updateApartment = "update dbo.Apartment set BuildingID = ?, ApartmentNumber = ? WHERE ApartmentID = ?";
	private final String deleteApartment = "delete from dbo.Apartment where ApartmentID = ?";

	
	public List<ApartmentModel> getAllApartments() {
		List<ApartmentModel> list = new ArrayList();
		try {
			PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getAllSQL);
			ResultSet rs = prepStmt.executeQuery();
		
			 while(rs.next()) {
				 ApartmentModel apartment = new ApartmentModel(
						 rs.getInt(1), 
						 rs.getInt(2), 
						 rs.getInt(3));
				 list.add(apartment);
			 }
            prepStmt.close();      
		}catch(Exception e){}
		return list;
	}


	public ApartmentModel getOneApartment(int id) {
		ApartmentModel apartment = null;
		try {
			PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getOneSQL);
			prepStmt.setInt(1, id);
			ResultSet rs = prepStmt.executeQuery();
			
			 while(rs.next()) {
				 apartment = new ApartmentModel(
						 rs.getInt(1), 
						 rs.getInt(2), 
						 rs.getInt(3));
			 }
            prepStmt.close();      
		}catch(Exception e){}	
		
		return apartment;
	}


	public boolean createApartment(int buildingID, int apartmentNumber) {
		try {
	          PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(createApartment);
	          prepStmt.setInt(1, buildingID);
	          prepStmt.setInt(2, apartmentNumber);
	          int affectedRows = prepStmt.executeUpdate();
	          if(affectedRows > 0) {
	         	 System.out.println("\n("+affectedRows+" row affected.)");
	         	 return true;
	          }
	          else {
	         	 System.out.println("ERROR!!");
	         	 return false;
	          }
	      }catch(Exception c){  return false; }
	
	}


	public ApartmentModel updateApartment(int id, int buildingID, int apartmentNumber) {
		ApartmentModel apartment = null;
		
		try {
	          PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(updateApartment);
	      
	          prepStmt.setInt(1, buildingID);
	          prepStmt.setInt(2, apartmentNumber);
	          prepStmt.setInt( 3,id);
	          int affectedRows = prepStmt.executeUpdate();
	          
	          if(affectedRows > 0) {
	         	 System.out.println("\n("+affectedRows+" row affected.)");
	         	 apartment = new ApartmentModel(buildingID, apartmentNumber, id);
	          }
	          else {
	         	 System.out.println("ERROR!!");
	          }
	      }catch(Exception c){ }		
		return apartment;
	
	}


	public boolean deleteApartment(int apartmentID) {
		 try {
	         PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(deleteApartment);
	         prepStmt.setInt(1, apartmentID);
	         
	         int affectedRows = prepStmt.executeUpdate();
	         if(affectedRows > 0) {
	        	 System.out.println("\n("+affectedRows+" row affected.)");
	        	 return true;
	         }
	         else {
	        	 System.out.println("ERROR!!");
	        	 return false;
	         }
	     }catch(Exception c){ return false;}
	}
	
	
	
	
	
}
