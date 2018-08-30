import java.util.Scanner;

public class RECURSION_PATTERN_2_INVERTED_TRIANGLE {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printTriangleRec(n);
		

	}
	
	private static void printTriangleRec(int n) {

		if (n == 0) {
			return;
		}

		
		for (int i = 0; i < n; i++) {
			System.out.print("*\t");
		}
		System.out.println();
		printTriangleRec(n - 1);
		

	}


}
