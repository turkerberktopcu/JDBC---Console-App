package Controller;

import Model.Entity.*;

import java.util.*;

import Model.DAO.*;
import src.*;
import View.*;

public class AssistantManagerController {
	
	AssistantManagerDAO dao = new AssistantManagerDAO();
	
	public List<AssistantManagerModel> getAllAssistantManagers(){
		return dao.getAllAssistantManagers();
	}
	
	public AssistantManagerModel getOneAssistantManager(int id) {
		return dao.getOneAssistantManager(id);
	}
	
	public boolean createAssistantManager(String name, String surname, int managerId) {
		return dao.createAssistantManager(name,surname,managerId);
	}
	
	public AssistantManagerModel updateAssistantManager(String name, String surname, int managerId) {
		return dao.updateAssistantManager(name,surname,managerId);
	}
	public boolean deleteAssistantManager(int id) {
		return dao.deleteAssistantManager(id);
	}
}
