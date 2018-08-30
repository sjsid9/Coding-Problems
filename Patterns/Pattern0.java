package Patterns;
import java.util.Scanner;

public class Pattern0 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		for(int i=0;i<row;i++) {
			System.out.println("*");
		}
	}
}
