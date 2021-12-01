package declareParameter;

public class PrePost {
	public static void main(String[] args) {
		int i = 20;
		Float a = 1.1f;
		Float b = 1.2f; 
		char c = 'c';
		char d = 'd';
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println(i);
		
		if((a == 1.1f) && (b == 1.2f))
			System.out.println(i);
		if((c == 'c') || (d == 'd'))
			System.out.println(i);
	}

}
