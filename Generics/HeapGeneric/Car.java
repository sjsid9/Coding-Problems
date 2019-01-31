package HeapGeneric;

public class Car implements Comparable<Car> {
	String name;
	int price;
	int speed;

	public Car(String name, int speed, int price) {
		this.name = name;
		this.price = price;
		this.speed = speed;
	}

	@Override
	public String toString() {
		System.out.println();
		return "N " + this.name + " P" + " " + this.price + " S " + this.speed;
	}

	@Override
	public int compareTo(Car o) {
		return this.name.compareTo(o.name);
//		return this.speed-o.speed;
//		return o.price-this.price;

	}

}
