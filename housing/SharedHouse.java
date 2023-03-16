package housing;

import java.util.Arrays;

public class SharedHouse {
	
	private String adress;
	private double minIncome;
	private Person[] persons;

	//"The constructor should initialize the corresponding variables with the given arguments. Additionally, "+
	//"an array object of persons should be created with the size of the array being set as the capacity of the house."		
	
	public SharedHouse(String adress, int capacity, double minIncome) {
		this.adress = adress;
		this.minIncome = minIncome;
		this.persons = new Person[capacity];
	}
	
	public boolean isEligible(Person person) {
		return person.getIncome() >= minIncome;
	}
	
	public boolean addPerson(Person person) {
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				persons[i] = person;
				return true;
			}
		}
		System.out.println("Shared house is full");
		return false;
	}
	
	public Person[] getPersons() {
        return persons;
    }
	
	public String getAdress() {
		return adress;
	}
	
	public double getMinIncome() {
		return minIncome;
	}
	
	public int getCapacity() {
		return persons.length;
	}
	
}
