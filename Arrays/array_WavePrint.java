import java.util.Scanner;

public class array_WavePrint {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int arr[][] = new int[n1][n2];

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < n1; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < n2; j++) {
					System.out.print(arr[j][i] + ", ");
				}
			} else {
				for (int j = n2 - 1; j >= 0; j--) {
					System.out.print(arr[j][i] + ", ");
				}
			}
		}

		System.out.println("END");

	}

}
