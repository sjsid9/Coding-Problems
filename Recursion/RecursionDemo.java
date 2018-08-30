
public class RecursionDemo {

	public static void main(String[] args) {

		// PD(5);
		// PI(5);
		// PDI(5);
		// PDIskip(5);
		// System.out.println(factorial(4));
		// System.out.println(Power(2, 8));
		// System.out.println(fib(10));
		// int[] arr = { 3, 8, 6, 1, 9, 7 };
		// System.out.println(isSorted(arr, 0));
		int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
		System.out.println(firstIndex(arr, 0, 1));
	}

	public static void PD(int n) {

		if (n == 0) {
			return;
		}
		System.out.println(n);
		PD(n - 1);

	}

	public static void PI(int n) {

		if (n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);

	}

	public static void PDI(int n) {

		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PDIskip(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 == 1) {
			System.out.println(n);
		}

		PDIskip(n - 1);

		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}

		int fnm1 = factorial(n - 1);
		int fn = n * fnm1;
		return fn;

	}

	public static int Power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int pnm1 = Power(x, n - 1);
		int pw = x * pnm1;
		return pw;
	}

	public static int fib(int n) {

		if (n == 1 || n == 0) {
			return n;
		}
		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}

	public static boolean isSorted(int[] arr, int si) {

		if (si == arr.length - 1) {
			return true;
		}

		if (arr[si] > arr[si + 1]) {

			return false;

		} else {

			boolean restAns = isSorted(arr, si + 1);
			return restAns;

		}

	}

	public static int firstIndex(int[] arr, int si, int data) {

		if (si == arr.length) {

			return -1;
		}

		if (arr[si] == data) {

			return si;

		} else {

			int restAns = firstIndex(arr, si + 1, data);
			return restAns;

		}
	}

}
