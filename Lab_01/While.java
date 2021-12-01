package declareParameter;

public class While {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		int j = 1;
		int myArray[] = {1,2,3,4,5};
		while (i<=10) {
			System.out.println(i);
			sum = sum + i;
			i++;
		}
		System.out.println(i);
		
		while (j<=100) {
			if(j%12 == 0)
				System.out.println("This divisible number by 12 is " + j);
			j++;
		}
		
		for(int k: myArray) {
			System.out.println(k);
		}
		
	}
}
