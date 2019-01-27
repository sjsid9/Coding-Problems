package Interfaces;

public class C implements B, A {

	public static void main(String[] args) {
//		C.add();
		C c = new C();
		c.add();
//		add();
		System.out.println(B.a);
		System.out.println(A.a);
	}
	
	public void add() {
		System.out.println("hello");
	}

	
	
	
}
