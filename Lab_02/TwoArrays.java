package Lab_2;

public class TwoArrays {
	public static void main(String[] args) {
		int [][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0;
		for (int row = 0;row<myArray.length;row++) {
			for (int element = 0;element < myArray[row].length;element++) {
				System.out.println(myArray[row][element]);
				if (element == myArray[row].length-1) {
					sum = sum + myArray[row][element];
				}
			}
		}
		System.out.println(sum);
	}

}
