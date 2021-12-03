package Lab_3;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
	}
	public void hello() {
		System.out.println("Hello " + this.firstname);
	}
    public int getSalary() {
    	return salary;
    }
    
    public static void main(String[] args) {
    	Employee[] employees = new Employee[3];
    	for (int i = 0; i < employees.length;i++) {
    		employees[i] = new Employee("First name " + i, "Last name " + i,1000*i);
    	}
    	System.out.println(employees[1].firstname);
    	System.out.println(employees[1].lastname);
    	System.out.println(employees[1].salary);
    }
}
