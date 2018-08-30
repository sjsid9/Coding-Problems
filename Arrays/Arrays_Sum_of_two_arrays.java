import java.util.Scanner;

public class Arrays_Sum_of_two_arrays {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int sumarlength;

		int n1 = s.nextInt(); // Taking size of array 1
		int[] arr1 = new int[n1]; // Declaring array 1

		String str1 = "", str2 = "", str3 = "";

		for (int i = 0; i < n1; i++) { // taking array
			arr1[i] = s.nextInt();
		}

		for (int i = 0; i < n1; i++) { // converting it into a number
			str1 += arr1[i];
		}

		int n2 = s.nextInt(); // Taking size of array 2
		int[] arr2 = new int[n2]; // Declaring array 2

		for (int i = 0; i < n2; i++) { // taking array
			arr2[i] = s.nextInt();
		}

		for (int i = 0; i < n2; i++) { // converting it into a number
			str2 += arr2[i];
		}

		int sum = Integer.parseInt(str1) + Integer.parseInt(str2);

		str3 = Integer.toString(sum);

		if (n1 > n2) {
			sumarlength = n1;
		} else {
			sumarlength = n2;
		}

		String arr3[] = new String[sumarlength];
		arr3 = str3.split("");
		int[] sumarr = new int[sumarlength];

		for (int i = 0; i < sumarlength; i++) {
			sumarr[i] = Integer.parseInt(arr3[i]);
		}

		for (int i = 0; i < sumarlength; i++) {
			System.out.print(sumarr[i] + ", ");
		}
		System.out.print("END");
	}

}