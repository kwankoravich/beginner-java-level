package Lab_3;

public class Programmer extends Employee{
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}
	@Override
	public int getSalary(){
		return super.getSalary();
	}
	public void createWebsite(String template, String titleName) {
		//Create function
	}
	public void installWindows(String version, String productKey) {
		//Create function
	}
	public static void main(String[] args) {
		Programmer unk2 = new Programmer("anonymous","programmer",20000);
		System.out.println(unk2.getSalary());
	}
	public Programmer(String firstnameInput, String lastnameInput) {
		this(firstnameInput, lastnameInput, 9000);
	}
}
