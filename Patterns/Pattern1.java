package Patterns;
import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int row,column;
		row=s.nextInt();
		column=s.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
