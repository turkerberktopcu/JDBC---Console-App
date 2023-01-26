package Controller;

import Model.Entity.*;

import java.util.*;
import Model.DAO.*;
import src.*;
import View.*;

public class DuesController {

	DuesDAO dao = new DuesDAO();
	
	public List<DuesModel> getAllDues(){
		return dao.getAllDues();
	}
	public DuesModel getOneDuesWithBillID(int id) {
		return dao.getOneDuesWithBillID(id);
	}
	public List<DuesModel> getOneDuesWithResidentID(int id) {
		return dao.getOneWithResidentID(id);
	}
	public boolean createDues(int residentId, String date, int amount, String desc) {
		return dao.createDues(residentId, date, amount, desc);
	}
	
	public boolean deleteDues(int id) {
		return dao.deleteDues(id);
	}
	
}
