public class DPDemo {
	public static void main(String[] args) {
		int n = 10;
	System.out.println(fibonacci(n));
	public static int fibonacci(int n) {

		if (n == 1 || n == 0) {
			return n;
		}
		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}

}
