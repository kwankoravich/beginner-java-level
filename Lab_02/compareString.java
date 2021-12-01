package Lab_2;

public class compareString {
	public static void main(String[] args) {
		String string1 = "You and Me";
		String string2 = "you and me";
		System.out.println(string1.equals(string2));
		System.out.println(string1.contains(string2));
		System.out.println(string1.length());
		System.out.println(string2.length());
		System.out.println(string1.substring(1,4));
		System.out.println(string2.substring(1,4));
		System.out.println(string1.trim());
		System.out.println(string2.trim());
		System.out.println(string1.toUpperCase());
		System.out.println(string2.toUpperCase());
		System.out.println(string2.trim().toUpperCase());
		
		
		
	}

}
