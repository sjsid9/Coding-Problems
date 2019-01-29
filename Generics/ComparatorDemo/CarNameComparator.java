package ComparatorDemo;

import java.util.Comparator;

public class CarNameComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
