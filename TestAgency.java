
// Please include your Pledge of Honor here.

import housing.Person;
import housing.Agency;
import housing.SharedHouse;

public class TestAgency {

	public static void main(String[] args) {
		
		// define Persons
		Person m1 = new Person("Carey", 30000);
		Person m2 = new Person("Mary", 12000);
		Person m3 = new Person("Dennis", 15000);
		Person m4 = new Person("Cate", 20000);
		Person m5 = new Person("Phoebe", 25000);
		Person m6 = new Person("Andrew", 50000);
		Person m7 = new Person("John", 10000);
		Person m8 = new Person("Karen", 21000);
		Person m9 = new Person("Doe", 22000);
		
		// define Anonymous Persons
		Person m10 = new Person(70000);
		Person m11 = new Person(120000);

		// update income for some Persons
		m1.updateIncome(6000);
		m6.updateIncome(9000, 60);

		// define agencies
		Agency agency1 = new Agency("Brick Lane Realty");
		Agency agency2 = new Agency("Citadel Partners Realty");

		// add houses to agencies
		agency1.addSharedHouse("Steintorwall 10", 2, 15000);
		agency1.addSharedHouse("Schlosspassage 21", 4, 20000);
		agency1.addSharedHouse("Dompl. 5", 3, 25000);

		agency2.addSharedHouse("Am Theater 1", 2, 16000);
		agency2.addSharedHouse("Steinweg 27", 3, 12000);

		// find house to given Persons
		agency1.findHouse(m1);
		agency1.findHouse(m3);
		agency1.findHouse(m5);
		agency1.findHouse(m8);
		agency1.findHouse(m9);

		agency2.findHouse(m2);
		agency2.findHouse(m4);
		agency2.findHouse(m6);
		agency2.findHouse(m7);


		agency2.findHouse(m10);
		agency2.findHouse(m11);

		// print agency info
		System.out.println(agency1);
		System.out.println(agency2);

        // ##ToDo##: call listAvailability method to list houses with selected availability
	}
	// ##ToDo##: add listAvailability method
}
