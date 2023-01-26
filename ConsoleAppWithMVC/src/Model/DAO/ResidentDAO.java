package Model.DAO;

import java.sql.*;
import java.util.*;
import Model.Entity.*;
import src.*;

public class ResidentDAO {
	private final String getAllSQL = " select * from dbo.Resident"; 
	private final String getOneSQL = " select * from dbo.Resident where ResidentID = ? "; 
	private final String createResident = "insert into dbo.Resident (ApartmentID, Name, Surname)values (?,?,?)";
	private final String updateResident = "update dbo.Resident set ApartmentID = ?, Name = ?, Surname = ? WHERE ResidentID = ?";
	private final String deleteResident = "delete from dbo.Resident where ResidentID = ? ";

	
	public List<ResidentModel> getAllResident(){
		List <ResidentModel> list = new ArrayList();
		try {
			PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getAllSQL);
			ResultSet rs = prepStmt.executeQuery();
			while(rs.next()) {
				ResidentModel residentModel = new ResidentModel(
						rs.getInt(1), 
						rs.getInt(2), 
						rs.getString(3), 
						rs.getString(4));
				list.add(residentModel);			
			}
            prepStmt.close();     
		}catch(Exception e){}
		return list;
	}
	
	public ResidentModel getOneResident(int id) {
		ResidentModel residentModel = null;
		try {
			PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getOneSQL);
			prepStmt.setInt(1, id);
			ResultSet rs = prepStmt.executeQuery();
			while(rs.next()) {
				residentModel = new ResidentModel(
						rs.getInt(1), 
						rs.getInt(2), 
						rs.getString(3), 
						rs.getString(4));
			}
			prepStmt.close();     
		}catch(Exception e){}
		
		return residentModel;
	}
	
	public boolean createResident(int apartmentId, String name, String surname) {
		try {
            PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(createResident);
            prepStmt.setInt(1, apartmentId);
            prepStmt.setString(2, name);
            prepStmt.setString(3, surname);
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
	
	public ResidentModel updateResident(int residentID, int apartmentID,String name,String surname) {
		ResidentModel residentModel = null;
		try {
	            PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(updateResident);
	            
	            prepStmt.setInt(1, apartmentID);
	            prepStmt.setString(2, name);
	            prepStmt.setString(3, surname);
	            prepStmt.setInt(4, residentID);
	            
	            int affectedRows = prepStmt.executeUpdate();
	            if(affectedRows > 0) {
	           	 System.out.println("\n("+affectedRows+" row affected.)");
	           	 residentModel = this.getOneResident(residentID);
	            }
	            else {
	           	 System.out.println("ERROR!!");
	            }
	        }catch(Exception c){}
		return residentModel;
	}
	
	public boolean deleteResident(int id) {
		 try {
	           PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(deleteResident);
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
	       }catch(Exception c){  return false;}
	}
	
}
