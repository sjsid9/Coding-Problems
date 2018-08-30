package Patterns;
import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int num = 1;
		int starnum = 0;
		int space = 2 * n - 2;

		for (int i = 1; i < 2 * n; i++) {

			System.out.print(num);

			for (int stnum = 1; stnum <= starnum; stnum++) {
				System.out.print("*");
				System.out.print(num);
			}

			for (int csp = 1; csp <= space; csp++) {
				System.out.print(" ");
			}

			System.out.println();

			if (i < n) {
				num++;
				starnum++;
				space = space + 2;
			} else {
				starnum--;
				num--;
				space = space + 2;
			}
		}

	}

}
