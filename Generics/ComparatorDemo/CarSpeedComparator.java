package ComparatorDemo;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {

	public static void main(String[] args) {

		Car[] cars = new Car[5];
		cars[0] = new Car("A", 100, 500);
		cars[1] = new Car("B", 800, 100);
		cars[2] = new Car("V", 200, 400);
		cars[3] = new Car("F", 600, 600);
		cars[4] = new Car("Q", 700, 200);

		bubbleSort(cars, new CarSpeedComparator());
		display(cars);
		System.out.println();
		bubbleSort(cars, new CarPriceComparator());
		display(cars);
		System.out.println();
		bubbleSort(cars, new CarNameComparator());
		display(cars);

	}

	public static <T> void display(T[] cars) {

		for (T val : cars) {
			System.out.println(val);
		}

	}

	public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {

		int counter = 0;

		for (counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - 1 - counter; j++) {

				if (comparator.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}

		}

	}

	@Override
	public int compare(Car o1, Car o2) {
		return o1.speed - o2.speed;
	}

}
