package ComparatorDemo;

public class Car {
	String name;
	int speed;
	int price;

	public Car(String name, int speed, int price) {
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	@Override
	public String toString() {
		return "N "+this.name+" S "+this.speed+" P "+this.price;
	}
	
}
