package Lab_3;

public class Position extends Employee{
	public String firstname;
	public String lastname;
	private int salary;
	public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
	public position;
	
	public void checkPosition() {
		System.out.println("My position is " + position);
	}
	public static void main(String[] args) {
		Employee unk3 = new Employee("anonymous","test", 10000);
		System.out.println(unk3.checkPosition());
	}
}
