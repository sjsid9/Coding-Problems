package LinkedListGeneric;

import java.util.ArrayList;

import Generics.Car;

public class GenericPair {
	public static void main(String[] args) {

		Car[] cars = new Car[5];
		cars[0] = new Car("A", 100, 500);
		cars[1] = new Car("B", 800, 100);
		cars[2] = new Car("V", 200, 400);
		cars[3] = new Car("F", 600, 600);
		cars[4] = new Car("Q", 700, 200);

		LinkedListGeneric<Car> ll = new LinkedListGeneric<Car>();

		ll.addLast(cars[0]);
		ll.addLast(cars[1]);
		ll.addLast(cars[2]);
		ll.addLast(cars[3]);
		ll.addLast(cars[4]);

		ll.display();

		LinkedListGeneric<ArrayList<Integer>> ll2 = new LinkedListGeneric<ArrayList<Integer>>();

		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);

		ll2.addLast(ar);
		ll2.display();
	}
}
