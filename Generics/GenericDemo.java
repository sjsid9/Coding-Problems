package Generics;

public class GenericDemo {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5 };
		String[] ar = { "abc", "def", "ghi" };

		Car[] cars = new Car[5];
		cars[0] = new Car("A", 100, 500);
		cars[1] = new Car("B", 800, 100);
		cars[2] = new Car("V", 200, 400);
		cars[3] = new Car("F", 600, 600);
		cars[4] = new Car("Q", 700, 200);

		display(arr);
		display(ar);
		bubbleSort(cars);
		display(cars);

	}

	public static <T> void display(T[] arr) {

		for (T val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {

		int counter = 0;

		for (counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - 1 - counter; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}

		}

	}

}
