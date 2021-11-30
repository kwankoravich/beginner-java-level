package declareParameter;

public class BreakFor {
	public static void main(String[] args) {
		for (int count = 20; count>0; count--) {
			if (count == 11) {
				System.out.println(count);
				break;
			}
		}
	}

}
