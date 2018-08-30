import java.util.Scanner;

public class ArrayMirrorInverse {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n];
		int[] mi = new int[n];
		int d = 0;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		for (int i = arr.length-1; i >= 0; i--) {
			temp = arr[i];
			if(temp!=0) {
			mi[Math.abs(temp - arr.length)] = arr.length-i;
			}else {
				mi[0]=0;
			}
			}

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == mi[i]) {
//				d++;
//			}
//		}
//		
		for(int val:mi) {
			System.out.println(val);
		}
	
		if (d == n) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
