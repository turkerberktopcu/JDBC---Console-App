package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import Model.DAO.*;
import Model.Entity.*;
import src.*;

public class ExpensesDAO {
	
	private final String getAllSQL = " select * from dbo.Expenses"; 
	private final String getOneSQL = " select * from dbo.Expenses where Date = ? "; 
	private final String createExpense = "insert into dbo.Expenses (Date, Electric, Security, Water, Heating,Gardener,Doorman,Unrepetitives) values (?,?,?,?,?,?,?,?)";
	private final String deleteExpense = "delete from dbo.Expenses where Date = ? ";
	private final String checkSQL = " select BuildingID from dbo.Building where BuildingID = ? "; 
	
	
	public List<ExpensesModel> getAllExpenses(){
		
		List<ExpensesModel> list = new ArrayList<>();

		try {
			PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getAllSQL);
			ResultSet rs = prepStmt.executeQuery();
				
	         while(rs.next()){
	           	ExpensesModel expense = new ExpensesModel(
	           			rs.getString(1), 
	           			rs.getInt(2), 
	           			rs.getInt(3),
	           			rs.getInt(4),
	           			rs.getInt(5),
	           			rs.getInt(6),
	           			rs.getInt(7),
	           			rs.getInt(8)
	           			);
	           	list.add(expense);
	           }
	           prepStmt.close();      
		}catch(Exception e){}
		return list;
	
	}
	public ExpensesModel getOneExpense(String date) {
		ExpensesModel expensesModel = null;
		try {
			PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(getOneSQL);
			prepStmt.setString(1, date);
			ResultSet rs = prepStmt.executeQuery();
			while(rs.next()) {
			expensesModel = new ExpensesModel(
					rs.getString(1),
					rs.getInt(2), 
					rs.getInt(3),
					rs.getInt(4),
					rs.getInt(5),
					rs.getInt(6),
					rs.getInt(7),
					rs.getInt(8)
					);
			}
            prepStmt.close();      
		}catch(Exception e){}
		
		return expensesModel;
		
	}
	public boolean createExpense(String date, int electric, int security, int water, int heating, int gardener,
			int doorman, int unrepetitive) {
		try {
	          PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(createExpense);
	          prepStmt.setString(1, date);
	          prepStmt.setInt(2, electric);
	          prepStmt.setInt(3, security);
	          prepStmt.setInt(4, water);
	          prepStmt.setInt(5, heating);
	          prepStmt.setInt(6, gardener);
	          prepStmt.setInt(7, doorman);
	          prepStmt.setInt(8, unrepetitive);
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
	public boolean deleteExpense(String date) {
		try {
	         PreparedStatement prepStmt = DatabaseConnector.getConnection().prepareStatement(deleteExpense);
	         prepStmt.setString(1, date);
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
