package Patterns;
import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int hf = n / 2;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= hf + 1 && j >= hf + 1) {
					if (i + j >= hf + 1 + 2 * hf) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (j >= Math.abs(i - hf) && j <= i + hf) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
