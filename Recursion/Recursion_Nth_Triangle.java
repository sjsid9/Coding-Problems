import java.util.Scanner;

public class Recursion_Nth_Triangle {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(nthTriangle(n));
	}

	private static int nthTriangle(int n) {
		
		if(n==0) {
			return 0;
		}
		
		n=n+nthTriangle(n-1);
		
		return n;
	}
}
