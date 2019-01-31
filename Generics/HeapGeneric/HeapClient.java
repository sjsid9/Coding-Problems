package HeapGeneric;

public class HeapClient {
	public static void main(String[] args) {
		
		Car[] cars = new Car[5];
		cars[0] = new Car("A", 100, 500);
		cars[1] = new Car("B", 800, 100);
		cars[2] = new Car("V", 200, 400);
		cars[3] = new Car("F", 600, 600);
		cars[4] = new Car("Q", 700, 200);

		
		HeapGeneric<Car> heap = new HeapGeneric<Car>(); 
		heap.add(cars[0]);
		heap.add(cars[1]);
		heap.add(cars[2]);
		heap.add(cars[3]);
		heap.add(cars[4]);
		
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		
	}
}
