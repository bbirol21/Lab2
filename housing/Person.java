package housing;


public class Person {
	
	private String name;
	private double income;
	private static int count = 0;

	public Person(String name, double income) {
		this.name = name;
		this.income = income;
		count++;
	}
	
	public Person(double income) {	
		this.income = income;
		this.name = "Anonymus";
	}
	
	public void updateIncome(double amount) {
		income = income + amount;	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public void updateIncome(double totalamount, double percentNonTax) {
		income = income + (totalamount*(percentNonTax/100));
	}

	public String toString() {
		return name + " " + income;
	}
	
	public static int getPersonCount() {
		return count;
	}
}
