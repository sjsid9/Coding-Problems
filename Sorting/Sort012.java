
public class Sort012 {
	public static void main(String[] args) {
		
	int arr[]= {0,1,2,1,0,2,1,0,2,1,0,2,1,0,2,1,0};	
		sort012(arr);
		for(int val:arr) {
			System.out.println(val);
		}
	}
	
	public static void sort012(int[] arr) {

		int left = 0;
		int right = arr.length - 1;
		int mid = 0;

		while (mid < right) {

			if (arr[mid] == 0) {
				int temp = arr[left];
				arr[left] = arr[mid];
				arr[mid] = temp;
				mid++;
				left++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				int temp = arr[mid];
				arr[mid] = arr[right];
				arr[right] = temp;
				right--;
			}
		}
	}
	
}

