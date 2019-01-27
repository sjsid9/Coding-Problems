package StaticDemo;

public class Main {
	public static void main(String[] args) {

//		Person person = new Person();
//		Person person2 = new Person();
//		Person person3 = new Person();
//		Person person4 = new Person();
//
//		System.out.println(person4.localCount + " , " + Person.instanceCount);

		final int a;
//		add(a);
//		System.out.println(a);
		Main main = new Main();
		a=main.sub(5);
		System.out.println(a);
	}

	public static void add(int a) {
		a=a+5;
		System.out.println(a+5);
	}

	public int sub(int a) {
		a=a-2;
//		a=a+5;
//		System.out.println(a-3);
		return a;
	}

}
