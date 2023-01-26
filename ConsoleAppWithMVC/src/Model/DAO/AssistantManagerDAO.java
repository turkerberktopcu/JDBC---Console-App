package Model.DAO;

import java.util.*;
import java.sql.*;
import Model.Entity.*;
import src.*;


public class AssistantManagerDAO {
	private String getAllSQL = " select * from dbo.AssistantManager"; 
	private String getOneSQL = " select * from dbo.AssistantManager where ManagerID = ? "; 
	private final String createAssistantManager = "insert into dbo.AssistantManager (Name, Surname,ManagerID)values (?,?,?)";
	private final String updateAssistantManager = "update dbo.AssistantManager set Name = ?, Surname = ? WHERE ManagerID = ?";
	private final String deleteAssistantManager = "delete from dbo.AssistantManager where ManagerID = ?";
		
	
	public List<AssistantManagerModel> getAllAssistantManagers(){
		List<AssistantManagerModel> list = new ArrayList();
		try {
			PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getAllSQL);
			ResultSet rs = prepStmt.executeQuery();
		
			 while(rs.next()) {
				 AssistantManagerModel assistant = new AssistantManagerModel(
						 rs.getString(1), 
						 rs.getString(2), 
						 rs.getInt(3));
				 list.add(assistant);
			 }
	                System.out.println("   "+rs.getInt(1)+"            "+rs.getInt(2)+"       "+rs.getString(3)+"       "+rs.getString(4)+"      "+rs.getInt(5));
            prepStmt.close();      
		}catch(Exception e){}
		return list;
	}
	
	public AssistantManagerModel getOneAssistantManager(int id) {
		AssistantManagerModel assistant = null;
		
		try {
			PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getOneSQL);
			prepStmt.setInt(1, id);
			ResultSet rs = prepStmt.executeQuery();
			
			 while(rs.next()) {
				 assistant = new AssistantManagerModel(
						 rs.getString(1), 
						 rs.getString(2), 
						 rs.getInt(3));
			 }
            prepStmt.close();      
		}catch(Exception e){}	
		return assistant;
				
	}
	
	public boolean createAssistantManager(String name, String surname, int managerId) {
		 try {
	          PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(createAssistantManager);
	          prepStmt.setString(1, name);
	          prepStmt.setString(2, surname);
	          prepStmt.setInt(3, managerId);
	          int affectedRows = prepStmt.executeUpdate();
	          if(affectedRows > 0) {
	         	 System.out.println("\n("+affectedRows+" row affected.)");
	         	 return true;
	          }
	          else {
	         	 System.out.println("ERROR!!");
	         	 return false;
	          }
	      }catch(Exception c){ return false; }
	}
	
	public AssistantManagerModel updateAssistantManager(String name, String surname, int managerId) {
		AssistantManagerModel assistant = null;
		
		try {
	          PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(updateAssistantManager);
	      
	          prepStmt.setString(1, name);
	          prepStmt.setString(2, surname);
	          prepStmt.setInt(3, managerId);
	          
	          int affectedRows = prepStmt.executeUpdate();
	          System.out.println(affectedRows);
	          if(affectedRows > 0) {
	         	 System.out.println("\n("+affectedRows+" row affected.)");
	         	 assistant = new AssistantManagerModel(name, surname, managerId);
	          }
	          else {
	         	 System.out.println("ERROR!!");
	          }
	      }catch(Exception c){ }		
		return assistant;
	}
	
	public boolean deleteAssistantManager( int managerId) {
		 try {
	         PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(deleteAssistantManager);
	         prepStmt.setInt(1, managerId);
	        
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
