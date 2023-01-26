package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.*;
import Model.Entity.*;
import src.*;

public class BuildingDAO {
	// Queries
		private final String getAllSQL = " select * from dbo.Building"; 
		private final String getOneSQL = " select * from dbo.Building where BuildingID = ? "; 
		private final String createBuilding = "insert into dbo.Building (BuildingName, BuildingAddress)values (?,?)";
		private final String updateBuilding = "update dbo.Building set BuildingName = ?, BuildingAddress = ? WHERE BuildingID = ?";
		private final String deleteBuilding = "delete from dbo.Building where BuildingID = ? ";
		private final String checkSQL = " select BuildingID from dbo.Building where BuildingID = ? "; 
		
		
		public List<BuildingModel> getAllBuildings() {
			List<BuildingModel> buildings = new ArrayList<>();

			try {
				PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getAllSQL);
				ResultSet rs = prepStmt.executeQuery();
				
	            while(rs.next()){
	            	BuildingModel building = new BuildingModel(
	            			rs.getInt(1), 
	            			rs.getString(2), 
	            			rs.getString(3)
	            			
	            			);
	            	buildings.add(building);
	            }
	            prepStmt.close();      
			}catch(Exception e){}
			return buildings;
		}
		
		
		public BuildingModel getOneBuilding(int id) {
			BuildingModel buildingModel = null;
			try {
				PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getOneSQL);
				prepStmt.setInt(1, id);
				ResultSet rs = prepStmt.executeQuery();
				while(rs.next()) {
				buildingModel = new BuildingModel(rs.getInt(1), rs.getString(2), rs.getString(3));
				}
	            prepStmt.close();      
			}catch(Exception e){}
			
			return buildingModel;
			
		}
		
		public BuildingModel createBuilding(String buildingName, String buildingAddress) {
			BuildingModel buildingModel = null; 
			try {
	             PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(createBuilding);
	             prepStmt.setString(1, buildingName);
	             prepStmt.setString(2, buildingAddress);
	             int affectedRows = prepStmt.executeUpdate();
	             if(affectedRows > 0) {
	            	 System.out.println("\n("+affectedRows+" row affected.)");
	            	 String innerSQL = "select BuildingID from dbo.Building where BuildingName = ? and BuildingAddress = ? ";
	                 PreparedStatement prepStmt2 = DatabaseConnector.getConnection().prepareStatement(innerSQL);
	                 prepStmt2.setString(1, buildingName);
	                 prepStmt2.setString(2, buildingAddress);
	                 
	                 ResultSet rs = prepStmt2.executeQuery();
	                 rs.next();
	                 buildingModel = new BuildingModel(rs.getInt(1), buildingName, buildingAddress);
	                 return buildingModel;
	            	 
	             }
	             else {
	            	 System.out.println("ERROR!!");
	            	 return null;
	             }
	         }catch(Exception c){ }
			
			return buildingModel;
		}
		
		public BuildingModel updateBuilding(int id, String name, String address) {
			BuildingModel buildingModel = null;
			
			 try {
	             PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(updateBuilding);
	             prepStmt.setString(1, name);
	             prepStmt.setString(2, address);
	             prepStmt.setInt(3, id);
	             int affectedRows = prepStmt.executeUpdate();
	             System.out.println(affectedRows);
	             if(affectedRows > 0) {
	            	 System.out.println("\n("+affectedRows+" row affected.)");
	            	 buildingModel= this.getOneBuilding(id);
	             }
	             else {
	            	 System.out.println("ERROR!!");
	            
	             }
	         }catch(Exception c){ }
			
			 return buildingModel;
		}
		
		public boolean deleteBuilding(int id) {
			 try {
		            PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(deleteBuilding);
		            prepStmt.setInt(1, id);
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
