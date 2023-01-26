package View;

import Model.Entity.*;
import java.util.*;
import Model.*;
import Controller.*;

public class MainView {
	public Scanner sc = new Scanner(System.in);

	//Controllers
	public ApartmentController apartmentController = new ApartmentController();
	public AssistantManagerController assistantController = new AssistantManagerController();
	public BuildingController buildingController = new BuildingController();
	public DuesController duesController = new DuesController();
	public ExpensesController expensesController = new ExpensesController();
	public ManagerController managerController = new ManagerController();
	public ResidentController residentController = new ResidentController();
	
	
	
	 public final void show() {
		    MenuView showMenu = new MenuView();
		    System.out.println("What is your role ? \n"
		 			+ "1. Administrator\n"
		 			+ "2. Resident\n"
		 			+ "3. Exit");
		 	int choice = sc.nextInt();
		    while( choice != 3 ) {
		 
		 	
		 	if (choice == 1) {
		 		String input;
			    showMenu.displayAdministratorMenu();
			    System.out.println("\nMake your choice:\n");
			    input = sc.next();
			    while (Integer.parseInt(input) != 0) {
			    switch (input) {
			    case "11":
			    	this.getAllBuildings();
			    	break;
			    case "12":
			    	this.getOneBuilding();	
			    	break;
			    case "13":
			    	this.createBuilding();
			    	break;
			    case "14":
			    	this.updateBuilding();
			    	break;
			    case "15":
			    	this.deleteBuilding();
			    	break;
			    case "21":
			    	this.getAllResidents();
			    	break;
			    case "22":
			    	this.getOneResident();
			    	break;
			    case "23":
			    	this.createResident();
			    	break;
			    case "24":
			    	this.updateResident();
			    	break;
			    case "25":
			    	this.deleteResident();
			    	break;
			    case "31":
			    	this.getAllManagers();
			    	break;
			    case "32":
			    	this.getOneManager();
			    	break;
			    case "33":
			    	this.createManager();
			    	break;
			    case "34":
			    	this.updateManager();
			    	break;
			    case "35":
			    	this.deleteManager();	
			    	break;
			    case "41":
			    	this.getAllAssitantManagers();
			    	break;
			  case "42":
				  	this.getOneAssistantManager();
			    	break;
			    case "43":
			    	this.createAssistantManager();
			    	break;
			    case "44":
			    	this.updateAssistantManager();
			    	break;
			    case "45":
			    	this.deleteAssistantManager();
			    	break;
			    case "51":
			    	this.getAllDues();
			    	break;
			    case "52":
			    	this.getOneDues();
			    	break;
			    case "53":
			    	this.createDues();
			    	break;
			    case "54":
			    	this.updateDues();
			    	break;
			    case "55":
			    	this.deleteDues();
			    	break;
			    case "61":
			    	this.getAllExpenses();
			    	break;
			    case "62":
			    	this.getOneExpenses();
			    	break;
			    case "63":
			    	this.createExpenses();
			    	break;
			    case "64":
			    	this.updateExpenses();
			    	break;
			    case "65":
			    	this.deleteExpenses();
			    	break;
			    case "71":
			    	this.getAllApartments();
			    	break;
			    case "72":
			    	this.getOneApartment();
			    	break;
			    case "73":
			    	this.createApartment();
			    	break;
			    case "74":
			    	this.updateApartment();
			    	break;
			    case "75":
			    	this.deleteApartment();
			    	break;
			    	

			    }
			    showMenu.displayAdministratorMenu();
			    input = sc.next();
			    
			    }
			    
		 	}
		 	else if(choice == 2) {
		 		String input;
			    showMenu.displayResidentMenu();
			    System.out.println("\nMake your choice:\n");
			    input = sc.next();
			    while (Integer.parseInt(input) != 0) {
			    switch (input) {
			    case "11":
			    	this.getAllBuildings();
			    	break;
			    case "12":
			    	this.getOneBuilding();	
			    	break;
			 
			    case "21":
			    	this.getAllResidents();
			    	break;
			    case "22":
			    	this.getOneResident();
			    	break;
			   
			    case "31":
			    	this.getAllManagers();
			    	break;
			    case "32":
			    	this.getOneManager();
			    	break;
			    
			    case "41":
			    	this.getAllAssitantManagers();
			    	break;
			  case "42":
				  	this.getOneAssistantManager();
			    	break;
			    
			    case "51":
			    	this.getAllDues();
			    	break;
			    case "52":
			    	this.getOneDues();
			    	break;
			    
			    case "61":
			    	this.getAllExpenses();
			    	break;
			    case "62":
			    	this.getOneExpenses();
			    	break;
			    
			    case "71":
			    	this.getAllApartments();
			    	break;
			    case "72":
			    	this.getOneApartment();
			    	break;

			    }
			    showMenu.displayResidentMenu();
			    input = sc.next();
			    
			    }
		 	}
		 
		    
		    
		    System.out.println("What is your role ? \n"
		 			+ "1. Administrator\n"
		 			+ "2. Resident\n"
		 			+ "3. Exit");
		 	 choice = sc.nextInt(); 
		  }
		    }
	
	 
	 // Buildings
	 public void getAllBuildings() {
		 System.out.println("\nGetting Buildings...");
		 List<BuildingModel> temp = buildingController.getAllBuildings();
		 if (temp != null){
		 for (BuildingModel building: temp) {
			 System.out.println(building.toString() + "\n");
		 }
		 } else {
			 System.out.println("Error while accessing the data");
		 }
	 }
	 
	 public void getOneBuilding() {
		 System.out.println("Enter the BuildingID that you want to see: ");
		 int id = sc.nextInt();
		 System.out.println("Getting the informations...");
		 BuildingModel temp = buildingController.getOneBuilding(id);
		 
		 if (temp != null) {
			 System.out.println(temp.toString() + "\n");
		 } else {
			 System.out.println("Error while accessing the data");

		 }
	 }
	 
	 public void createBuilding() {
		  System.out.println("\nEnter the Name of Building:");
		  String buildingName = sc.next();
		  System.out.println("\nEnter the Address of Building:");
		  String buildingAddress = sc.next();
		  BuildingModel temp = buildingController.createBuilding(buildingName, buildingAddress);
		  
		  if (temp != null) {
				 System.out.println(temp.toString() + "\n");
			 } else {
				 System.out.println("Error while accessing the data");
			 }
	 }
	 
	public void updateBuilding() {
		  System.out.println("\nEnter the id of Building that u want to update:");
		  int id = sc.nextInt();
		  System.out.println("\nEnter the Updated Name of Building:");
		  String buildingName = sc.next();
		  System.out.println("\nEnter the Updated Address of Building:");
		  String buildingAddress = sc.next();
		  BuildingModel flag = buildingController.updateBuilding(id, buildingName, buildingAddress);
		  
		  if (flag != null) {
			  System.out.println(flag.toString());
			  System.out.println("Row is updated.");
		  } else {
			System.out.println("Error !! Update operation is cancelled.");  
		  }
	}
	
	public void deleteBuilding() {
		System.out.println("\nEnter the BuildingID that you want to delete:");
		  int id = sc.nextInt();
		  boolean flag = buildingController.deleteBuilding(id);
		  
		  if (flag == true) {
			  System.out.println("Row is deleted.");
		  } else {
			System.out.println("Error !! Delete operation is cancelled.");  
		  }
		
	}
	
	// Resident
	
	public void getAllResidents() {
		System.out.println("\nGetting Residents....");
		List<ResidentModel> temp = residentController.getAllResident();
		
		 if (temp != null){
			 for (ResidentModel resident: temp) {
				 System.out.println(resident.toString() + "\n");
				 
			 }
			 } else {
				 System.out.println("Error while accessing the data");
			 }
	}
	public void getOneResident() {
		 System.out.println("\nEnter the Resident ID please");
		  int id = sc.nextInt();
		  System.out.println("\nGetting Resident informations....");
		  ResidentModel temp = residentController.getOneResident(id);
		  
		  if (temp != null) {
				 System.out.println(temp.toString() + "\n");
			 } else {
				 System.out.println("Error while accessing the data");

			 }
	}
	public void createResident() {
		  System.out.println("\nConnecting...");
		  System.out.println("\nEnter the ApartmentID :");
		  int id = sc.nextInt();
		  System.out.println("\nEnter the Name of Resident:");
		  sc.nextLine();
		  String name = sc.nextLine();
		  System.out.println("\nEnter the Surname of Resident:");
		  String surname = sc.next();
		  
		  boolean flag = residentController.createResident(id, name, surname);
		  if (flag != false) {
				 System.out.println("Row is created." + "\n");
			 } else {
				 System.out.println("Error while accessing the data");

			 }
	}
	public void updateResident() {
		  System.out.println("\nEnter the id of Resident that u want to update :");
		  int ResidentID = sc.nextInt();
		  System.out.println("\nEnter the Updated ApartmentID : ");
		  int ApartmentID = sc.nextInt();
		  System.out.println("\nEnter the Updated Name of Resident : ");
		  String Name = sc.next();
		  System.out.println("\nEnter the Updated Surname of Resident : ");
		  String Surname = sc.next();
		  ResidentModel temp = residentController.updateResident(ResidentID,ApartmentID,Name,Surname);
		  
		  if (temp != null) {
				 System.out.println(temp.toString() + "\n");
			 } else {
				 System.out.println("Error while accessing the data");
			 }
		  
	}
	public void deleteResident() {
		  System.out.println("\nEnter the ResidentID that you want to delete:");
		  int id = sc.nextInt();
		  boolean flag = residentController.deleteResident(id);
		  
		  if (flag != false) {
				 System.out.println("Row is deleted." + "\n");
			 } else {
				 System.out.println("Error while accessing the data");

			 }
	}
	
	// Manager
	
	public void getAllManagers() {
		System.out.println("\nGetting Managers...");
		 List<ManagerModel> temp = managerController.getAllManagers();
		 if (temp != null){
		 for (ManagerModel manager: temp) {
			 System.out.println(manager.toString() + "\n");
			 
		 }
		 } else {
			 System.out.println("Error while accessing the data");
		 }
	}
	public void getOneManager() {
		 System.out.println("\nEnter the Manager ID please");
		  int id = sc.nextInt();
		  System.out.println("\nGetting Manager informations....");
		  ManagerModel temp = managerController.getOneManager(id);
		  

		  if (temp != null) {
			System.out.println(temp.toString() + "\n");
		  } else {
			System.out.println("Error while accessing the data");
		  }
		  
		
	}
	public void createManager() {
		 System.out.println("\nEnter the Manager's ResidentID please :");
		  int ResidentID = sc.nextInt();
		 
		  System.out.println("\n Manager's Name : ");
		  String Name = sc.next();
		  System.out.println("\n Manager's Surname : ");
		  String Surname = sc.next();
		  
		  boolean flag = managerController.createManager(ResidentID,Name,Surname);
		  if (flag != false) {
				 System.out.println("Row is created." + "\n");
			 } else {
				 System.out.println("Error while accessing the data");

			 }
	}
	public void updateManager() {
		System.out.println("\nEnter the ManagerID for update the informations of the Manager :");
		  int ManagerID = sc.nextInt();
		  System.out.println("\nEnter the Updated ResidentID : ");
		  int ResidentID = sc.nextInt();
		
		  System.out.println("\nEnter the Updated Name of Manager : ");
		  String Name = sc.next();
		  System.out.println("\nEnter the Updated Surname of Manager : ");
		  String Surname = sc.next();
		  managerController.updateManager(ResidentID, Name, Surname,ManagerID);
	}
	public void deleteManager() {
		  System.out.println("\nEnter the ManagerID that you want to delete:");
		  int id = sc.nextInt();
		  boolean flag = managerController.deleteManager(id);
	
		  if (flag == true) {
			  System.out.println("Row is deleted.");
		  } else {
			System.out.println("Error !! Delete operation is cancelled.");  
		  }
	}
	
	// Assistant
	
	public void getAllAssitantManagers() {
		System.out.println("\nGetting Assistan Managers....");
		List<AssistantManagerModel> temp = assistantController.getAllAssistantManagers();
		
		if (temp != null){
			 for (AssistantManagerModel assistant: temp) {
				 System.out.println(assistant.toString() + "\n");
				 
			 }
			 } else {
				 System.out.println("Error while accessing the data");
			 }
	}
  
  public void getOneAssistantManager() {
	  System.out.println("\nEnter the Manager ID for see his/her Assistant please");
	  int id = sc.nextInt();
	  System.out.println("\nGetting Assistant Manager informations....");
	  AssistantManagerModel assistant = assistantController.getOneAssistantManager(id);
	  
	  if (assistant != null) {
			System.out.println(assistant.toString() + "\n");
		  } else {
			System.out.println("Error while accessing the data");
		  }
  }
  
  public void createAssistantManager() {
	  
	  System.out.println("\nEnter the Name : ");
	  String name = sc.next();
	  System.out.println("\nEnter the Surname : ");
	  String surname = sc.next();
	  System.out.println("\nEnter the Manager's ID : ");
	  int managerId = sc.nextInt();
	  
	  boolean flag = assistantController.createAssistantManager(name, surname,managerId);

	  if (flag != false) {
			 System.out.println("Row is created." + "\n");
		 } else {
			 System.out.println("Error while accessing the data");

		 }
  }
  
  public void updateAssistantManager() {
	  System.out.println("\nEnter the ManagerID for update the informations of the AssistantManager :");
	  int managerId = sc.nextInt();
	  System.out.println("\nEnter the Updated Name of AssistantManager : ");
	  String name = sc.next();
	  System.out.println("\nEnter the Updated Surname of AssistantManager : ");
	  String surname = sc.next();
	  AssistantManagerModel assistant = assistantController.updateAssistantManager(name, surname,managerId);
	  
	  if (assistant != null) {
			System.out.println(assistant.toString() + "\n");
		  } else {
			System.out.println("Error while accessing the data");
		  }
  }
  
  public void deleteAssistantManager() {
	  System.out.println("\nEnter the ManagerID that you want to delete his/her Assistant:");
	  int id = sc.nextInt();
	  
	  boolean flag = assistantController.deleteAssistantManager(id);
	  
	  if (flag != false) {
			 System.out.println("Row is deleted." + "\n");
		 } else {
			 System.out.println("Error while accessing the data");

		 }
  }
  
  // Dues
  
  public void getAllDues() {
	  System.out.println("\nGetting Dues ....");
	  List<DuesModel> temp = duesController.getAllDues();
	  
	
		  if (temp != null){
			 for (DuesModel dues: temp) {
				 System.out.println(dues.toString() + "\n");
			}
		  } else {
				 System.out.println("Error while accessing the data");
			}
	  
		
  }
  public void getOneDues() {
	  
	  int decision = 0;
	  while(decision != 3) {
	  System.out.println("\n1.Use BillID");
	  System.out.println("\n2.Use ResidentID");
	  System.out.println("\n3.Go Back");
	  decision = sc.nextInt();
	  if(decision == 1) {
		  System.out.println("Enter your BillID");
		  int id = sc.nextInt();
		  DuesModel duesModel = duesController.getOneDuesWithBillID(id);
		
		  if (duesModel != null) {
			  System.out.println(duesModel.toString() + "\n");
		  } else {
			 System.out.println("Error while accessing the data");
		  }
	  }
	  else if(decision == 2) {
		  System.out.println("Enter your ResidentID");
		  int id = sc.nextInt();
		  List<DuesModel> list = duesController.getOneDuesWithResidentID(id);
		  if (list != null){
				 for (DuesModel dues: list) {
					 System.out.println(dues.toString() + "\n");
					 
				 }
				 } else {
					 System.out.println("Error while accessing the data");
				 }
	  }
	  else if(decision == 3){
		  break;
	  }
	  else {
		  System.out.println("Invalid Choice");
	  }
	  }
	  
	  
	 
	  
  }
  public void createDues() {
	  System.out.println("Enter the Resident ID : ");
	  int residentId = sc.nextInt();
	  System.out.println("Enter the Date of Dues in Format of (YYYY-MM-01): ");
	  String date = sc.next();
	  System.out.println("Enter the Amount : ");
	  int amount = sc.nextInt();
	  System.out.println("Enter the Description : ");
	  sc.nextLine();
	  String desc = sc.nextLine();
	  
	  boolean flag = duesController.createDues(residentId, date, amount, desc);
	  
	  if (flag != false) {
			 System.out.println("Row is created." + "\n");
		 } else {
			 System.out.println("Error while accessing the data");

		 }
	  
  }
 
  public void updateDues() {
	  System.out.println("\n You can't do this !!");
  }
  
  public void deleteDues() {
	  System.out.println("\nEnter your BillID for delete : ");
	  int id = sc.nextInt();
	  boolean flag = duesController.deleteDues(id);
	  
	  if (flag != false) {
			 System.out.println("Row is deleted." + "\n");
		 } else {
			 System.out.println("Error while accessing the data");

		 }
  }
  
  // Expenses
  
  public void getAllExpenses() {
	  System.out.println("\nGetting Expenses...");
	  List<ExpensesModel> list = expensesController.getAllExpenses();
	  
	  if (list != null){
			 for (ExpensesModel expense: list) {
				 System.out.println(expense.toString() + "\n");
				 
			 }
			 } else {
				 System.out.println("Error while accessing the data");
			 }
  }
  public void getOneExpenses() {
	  System.out.println("\nEnter the Date of Expenses in the format of (YYYY-MM-01) : ");
	  String date = sc.next();
	  ExpensesModel expense = expensesController.getOneExpense(date);
	  
	  if (expense != null) {
			System.out.println(expense.toString() + "\n");
		  } else {
			System.out.println("Error while accessing the data");
		  }
  }
  public void createExpenses() {
	  System.out.println("Enter the Date in Format of (YYYY-MM-01) : ");
	  String date = sc.next();
	  System.out.println("Enter the amount of Electricity expense : ");
	  int electric = sc.nextInt();
	  System.out.println("Enter the amount of Security expense : ");
	  int security = sc.nextInt();
	  System.out.println("Enter the amount of Water expense : ");
	  int water = sc.nextInt();
	  System.out.println("Enter the amount of Heating expense : ");
	  int heating = sc.nextInt();
	  System.out.println("Enter the amount of Gardener expense : ");
	  int gardener = sc.nextInt();
	  System.out.println("Enter the amount of Doorman expense : ");
	  int doorman = sc.nextInt();
	  System.out.println("Enter the amount of Unrepetitive expense : ");
	  int unrepetitive = sc.nextInt();
	 
	  
	  boolean flag = expensesController.createExpense(date, electric, security, water, heating, gardener, doorman, unrepetitive);
	  
	  if (flag != false) {
			 System.out.println("Row is created." + "\n");
		 } else {
			 System.out.println("Error while accessing the data");

		 }
  }
  
  
  public void updateExpenses() {
	  System.out.println("You can't do this !!");
  }
  
  
  public void deleteExpenses() {
	  System.out.println("\nEnter the Date of Expense in format of (YYYY-MM-01) that you want to delete : ");
	  String date = sc.next();
	  
	  boolean flag = expensesController.deleteExpense(date);
	  
	  if (flag != false) {
			 System.out.println("Row is deleted." + "\n");
		 } else {
			 System.out.println("Error while accessing the data");

		 }
	  
  }
  
  // Apartments
  
  public void getAllApartments() {
	  System.out.println("\nGetting Apartment informations...");
	  List<ApartmentModel> list = apartmentController.getAllApartments();
	  
	  if (list != null){
			 for (ApartmentModel apartment: list) {
				 System.out.println(apartment.toString() + "\n");
				 
			 }
			 } else {
				 System.out.println("Error while accessing the data");
			 }
  }
  

  public void getOneApartment() {
	  System.out.println("\nEnter the Apartment ID : ");
	  int id = sc.nextInt();
	  ApartmentModel apartment = apartmentController.getOneApartment(id);
	  
	  if (apartment != null) {
			System.out.println(apartment.toString() + "\n");
		  } else {
			System.out.println("Error while accessing the data");
		  }
  }
	
  public void createApartment() {
	  System.out.println("\nEnter the BuildingID : ");
	  int buildingID = sc.nextInt();
	  System.out.println("\nEnter the Apartment Number : ");
	  int apartmentNumber = sc.nextInt();
	  
	  boolean flag = apartmentController.createApartment(buildingID,apartmentNumber);
	  
	  if (flag != false) {
			 System.out.println("Row is deleted." + "\n");
		 } else {
			 System.out.println("Error while accessing the data");
		 }
  }
  
  public void updateApartment() {
	  System.out.println("\nEnter the Apartment ID that you want to update : ");
	  int id = sc.nextInt();
	  System.out.println("\nEnter the updated Building ID : ");
	  int buildingID = sc.nextInt();
	  System.out.println("\nEnter the updated Apartment Number : ");
	  int apartmentNumber = sc.nextInt();
	  
	  ApartmentModel apartment = apartmentController.updateApartmemnt(id,buildingID,apartmentNumber);

	  if (apartment != null) {
			System.out.println(apartment.toString() + "\n");
		  } else {
			System.out.println("Error while accessing the data");
		  }

	  
  }
  
  public void deleteApartment() {
	  System.out.println("\nEnter the ApartmentID that you want to delete : ");
	  int apartmentID = sc.nextInt();
	  
	  boolean flag = apartmentController.deleteApartment(apartmentID);
	  
	  if (flag != false) {
			 System.out.println("Row is deleted." + "\n");
		 } else {
			 System.out.println("Error while accessing the data");

		 }
  }
	
}
