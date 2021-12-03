package Lab_3;

public class CEO extends Employee{
	public CEO(String firstnameInput,String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}
    @Override
    public int getSalary() {
    	return super.getSalary()*2;
    }
    public void hello() {
    	System.out.println("Hi, nice to meet you " + this.firstname+"!");
    }
    public void fire(Employee employee) {
    	System.out.println(employee.firstname + " has been fired!");
    }
    
    public static void main(String[] args) {
    	Employee unk = new Employee("anonymous", "hacker", 10000);
    	System.out.println(unk.getSalary());
    	CEO unk1 = new CEO("anonymous", "ceo", 30000);
    	System.out.println(unk1.getSalary());
    	unk1.hello();
    	unk1.fire(unk);
    }
}
