
public class ArrayMaxDemo {

	public static void main(String[] args) {
		int[] array = { 10, 5, 30, 47, 25, 15 };
		System.out.println(MaxArray(array));

	}

	public static int MaxArray(int[] arr) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
