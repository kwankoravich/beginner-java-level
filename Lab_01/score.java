package declareParameter;

public class score {
	public static void main(String[] args) {
		int score = 85;
		if (score >= 80) {
			System.out.println("Good");
		} else if (score < 80 && score >= 50) {
			System.out.println("normal");
		} else {
			System.out.println("fail");
		}
		
		boolean isHandSome = true;
		if (isHandSome = false) {
			if (score >= 80) {
				System.out.println("Good");
			} else if (score < 80 && score >= 50) {
				System.out.println("normal");
			} else {
				System.out.println("fail");
			}
		} else {
			System.out.println("Good");
		}
	}
}
