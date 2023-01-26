package View;

public class MenuView {
    
	public String residentMenu = " _______________________________________________________________________\n"
		    + "|                                                                       |\n"
		    + "|       Enter any compination of existing entity and CRUD number :      |\n"
			+ "|______________________  Enter 0 For Exit  _____________________________|\n"
		    + "|_______________________________________________________________________|\n"
		    + "|                                  |                                    |\n"
		    + "|        Entity number:            |      Operation number:             |\n"
		    + "|__________________________________|____________________________________|\n"
		    + "|   |                              |   |                                |\n"
		    + "| 1 | Building                     | 1 | GET ALL                        |\n"
		    + "| 2 | Resident                     | 2 | GET ONE                        |\n"
		    + "| 3 | Manager                      |   |                                |\n"
		    + "| 4 | Assistant Manager            |   |                                |\n"
		    + "| 5 | Dues                         |   |                                |\n"
		    + "| 6 | Expenses                     |   |                                |\n"
		    + "| 7 | Apartment                    |   |                                |\n"		    
		    + "|___|______________________________|___|________________________________|\n";

	
	
	
	public String administratorMenu = " _______________________________________________________________________\n"
    + "|                                                                       |\n"
    + "|       Enter any compination of existing entity and CRUD number :      |\n"
	+ "|______________________  Enter 0 For Exit  _____________________________|\n"
    + "|_______________________________________________________________________|\n"
    + "|                                  |                                    |\n"
    + "|        Entity number:            |      Operation number:             |\n"
    + "|__________________________________|____________________________________|\n"
    + "|   |                              |   |                                |\n"
    + "| 1 | Building                     | 1 | GET ALL                        |\n"
    + "| 2 | Resident                     | 2 | GET ONE                        |\n"
    + "| 3 | Manager                      | 3 | CREATE                         |\n"
    + "| 4 | Assistant Manager            | 4 | UPDATE                         |\n"
    + "| 5 | Dues                         | 5 | DELETE                         |\n"
    + "| 6 | Expenses                     |   |                                |\n"
    + "| 7 | Apartment                    |   |                                |\n"		    
    + "|___|______________________________|___|________________________________|\n";


public void displayAdministratorMenu() {
	System.out.println(this.administratorMenu);
}

public void displayResidentMenu() {
	System.out.println(this.residentMenu);
}

}
