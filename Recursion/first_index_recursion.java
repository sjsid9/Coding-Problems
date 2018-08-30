import java.util.Scanner;

public class first_index_recursion {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int elm=s.nextInt();
		System.out.println(firstIndexRec(arr,elm,0));
	}

	private static int firstIndexRec(int[] arr, int elm, int vidx) {
		
		if(vidx==arr.length) {
			return -1;
		}
		
		if(elm!=arr[vidx]) {
		return	firstIndexRec(arr, elm, vidx+1);
		}else {
			return vidx;
		}
		
		
	}
}
