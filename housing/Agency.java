package housing;

import java.util.Arrays;

public class Agency {

	private String agency_name;
	private SharedHouse [] shared_houses;
	
	public Agency(String agency_name) {
		this.agency_name = agency_name;
		this.shared_houses = new SharedHouse[3];
	}
	
	public void addSharedHouse(String houseAdress, int capacity, double minIncome) {
		SharedHouse newHouse = new SharedHouse(houseAdress, capacity, minIncome);
		for (int i = 0; i < shared_houses.length; i++) {
			if (shared_houses[i] == null) {
				shared_houses[i] = newHouse;
				break;
			}
		}
	}
	
	public void findHouse(Person person) {
		for (int i = 0; i<shared_houses.length; i++) {
            if (shared_houses[i] != null && shared_houses[i].isEligible(person) && shared_houses[i].addPerson(person)) {
                break;
            }
        }
	}

	//modify findHouse method so that the person gets added to the other house if the house is full
	
	public String toString() {
		String information = "\n" + "Agency Name: " + agency_name + "\n";
		for (SharedHouse house : shared_houses) {
			if (house != null) {
				information += "SharedHouse Adress: " + house.getAdress() + "\n" + "SharedHouse Minimum Monthly Income: " + house.getMinIncome() + "\n"
						+ "SharedHouse Capacity: " + house.getCapacity() + "\n" + "Persons: " + "\n";
				
				for (int i = 0; i < house.getPersons().length; i++) {
					if (house.getPersons()[i] != null) {
						information += house.getPersons()[i].getName() + " " + house.getPersons()[i].getIncome() + "\n";
					}
				}
				information += "\n";
			}
		}
		return information;
	}
	
	public SharedHouse[] getSharedHouses() {
		return shared_houses;
	}

	
	
			
}
