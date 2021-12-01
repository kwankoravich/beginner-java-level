package declareParameter;

public class ContinueFor {
	public static void main(String[] args) {
		for (int count = 20;count>0;count--) {
			if(count == 11) {
				System.out.println(count);
				continue;
			}
		}
		
		for (int count = 20;count>0;count--) {
			if(count == 2) {
				continue;}
			System.out.println(count);
		}
	}

}
