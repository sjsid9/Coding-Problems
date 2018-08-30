import java.util.Scanner;

public class Arrays_targetSumTriplets {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int target = s.nextInt();
		int a, b,c,d;
		for (int i = 0; i < n; i++) {
			a = arr[i];
			b = target - arr[i];

			for (int j = 0; j < n; j++) {
				
				c=arr[j];
				d=b-arr[j];
				
				for (int k = 0; k < n; k++) {
					
					if (d == arr[j]) {
							System.out.println(a + " and " + c+" and "+d);
						}
					
				}
				
			}

		}

	}
}
