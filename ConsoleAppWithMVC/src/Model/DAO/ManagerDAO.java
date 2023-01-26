package Model.DAO;

import Model.Entity.*;
import java.sql.*;
import java.util.*;
import src.*;

public class ManagerDAO {
	private final String getAllSQL = " select * from dbo.Manager"; 
	private final String getOneSQL = " select * from dbo.Manager where ManagerID = ? "; 
	private final String createManager = "insert into dbo.Manager (ResidentID, Name, Surname)values (?,?,?)";
	private final String updateManager = "update dbo.Manager set ResidentID = ?, Name = ?, Surname = ? WHERE ManagerID = ?";
	private final String deleteManager = "delete from dbo.Manager where ManagerID = ? ";
	
	public List<ManagerModel> getAllManagers() {
		List<ManagerModel> list = new ArrayList();
		try {
			PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getAllSQL);
			ResultSet rs = prepStmt.executeQuery();
			
			 while(rs.next()) {
				 ManagerModel managerModel = new ManagerModel(
						 rs.getInt(1), 
						 rs.getString(2), 
						 rs.getString(3),
						 rs.getInt(4));
				 list.add(managerModel);
			 }
            prepStmt.close();      
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	
	public ManagerModel getOneManager(int id) {
		ManagerModel managerModel = null;
		try {
			PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getOneSQL);
			prepStmt.setInt(1, id);
			ResultSet rs = prepStmt.executeQuery();
			
			while(rs.next()) {
				managerModel = new ManagerModel(
						rs.getInt(1),
						rs.getString(2), 
						rs.getString(3),
						rs.getInt(4));
			}
			prepStmt.close();      
		}catch(Exception e){}
		return managerModel;
	}
	
	public boolean createManager(int residentId, String name, String surname) {
		 try {
	           PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(createManager);
	           prepStmt.setInt(1, residentId);
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
	
	public boolean updateManager(int residentId, String name,String surname,int managerId) {
		 try {
          PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(updateManager);
          
          prepStmt.setInt(1, residentId);
          prepStmt.setString(2, name);
          prepStmt.setString(3, surname);
          prepStmt.setInt(4, managerId);
          
          int affectedRows = prepStmt.executeUpdate();
          System.out.println(affectedRows);
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
	
	public boolean deleteManager(int id) {
		 try {
         PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(deleteManager);
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
