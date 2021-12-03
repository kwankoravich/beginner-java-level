package Lab_4;

public class Casting {
	public static void main(String[] args) {
		Employee unk4 = new Employee("Anonymous","office","10000");
		Employee ceo = new CEO("Anonymous","ceo",30000);
		Employee prog = new Programmer("Anonymous","programmer",20000);
		CEO ceo2 = (CEO) ceo; //cast 'ceo' variable into CEO class
		Programmer prog2 = (Programmer) prog; // cast 'prog' variable into Programmer class
	}

}
