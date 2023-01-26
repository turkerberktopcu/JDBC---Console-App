package Model.DAO;

import java.util.*;
import java.sql.*;
import src.*;
import Model.Entity.*;

public class DuesDAO {
	private String getAllSQL = " select * from dbo.Dues"; 
	private String getOneBillSQL = " select * from dbo.Dues where BillID = ? ";
	private String getOneResidentSQL = " select * from dbo.Dues where ResidentID = ? ";
	private final String createDues = "insert into dbo.Dues (ResidentID, Date, Amount, Description) values (?,?,?,?)";
	private final String deleteDues = "delete from dbo.Dues where BillID = ?";
			
	
	public List<DuesModel> getAllDues(){
		List <DuesModel> list = new ArrayList();
		try{
            PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getAllSQL);
            ResultSet rs = prepStmt.executeQuery();
           
            
            while(rs.next()) {
            	DuesModel duesModel = new DuesModel(
            			rs.getInt(1),
            			rs.getString(2), 
            			rs.getInt(3),
            			rs.getInt(4),
            			rs.getString(5));
            	list.add(duesModel);
            }
            prepStmt.close();            
           }catch(Exception e){}
		return list;
	}
	
	public DuesModel getOneDuesWithBillID(int id) {
		DuesModel duesModel = null;
		try{
            PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getOneBillSQL);
            prepStmt.setInt(1, id);
            ResultSet rs = prepStmt.executeQuery();
        
            while(rs.next()) {
            	duesModel = new DuesModel(
            			rs.getInt(1), 
            			rs.getString(2), 
            			rs.getInt(3), 
            			rs.getInt(4),
            			rs.getString(5));
            }
            prepStmt.close();            
           }catch(Exception e){}
		return duesModel;
	}
	
	public List<DuesModel> getOneWithResidentID(int id) {
		List<DuesModel> list = new ArrayList<>();
		
		try{
            PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getOneResidentSQL);
            prepStmt.setInt(1, id);
            ResultSet rs = prepStmt.executeQuery();
            
             while(rs.next()) {
            	DuesModel duesModel = new DuesModel(
            			 rs.getInt(1),
            			 rs.getString(2),
            			 rs.getInt(3),
            			 rs.getInt(4),
            			 rs.getString(5));
            	list.add(duesModel);
             }
            prepStmt.close();            
           }catch(Exception e){}
		return list;
	}
	
	public boolean createDues(int residentId, String date, int amount, String desc) {
		try {
	          PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(createDues);
	          prepStmt.setInt(1, residentId);
	          prepStmt.setString(2, date);
	          prepStmt.setInt(3, amount);
	          prepStmt.setString(4, desc);
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
	
	public boolean deleteDues(int id) {
		try {
	         PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(deleteDues);
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
