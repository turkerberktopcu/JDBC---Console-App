package Controller;

import java.util.*;
import Model.*;
import Model.DAO.*;
import Model.Entity.*;
import src.*;
import View.*;

public class ExpensesController {
	ExpensesDAO dao = new ExpensesDAO();
	
	public List<ExpensesModel> getAllExpenses(){
		return dao.getAllExpenses();
	}
	
	public ExpensesModel getOneExpense(String date) {
		return dao.getOneExpense(date);
	}

	public boolean createExpense(String date, int electric, int security, int water, int heating, int gardener,
			int doorman, int unrepetitive) {
		return dao.createExpense(date,electric,security,water,heating,gardener,doorman,unrepetitive);
	}

	public boolean deleteExpense(String date) {
		// TODO Auto-generated method stub
		return dao.deleteExpense(date);
	}
	
}
