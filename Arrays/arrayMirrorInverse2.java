import java.util.Scanner;

public class arrayMirrorInverse2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int array[]=new int[x];
		
		String nm="";
		
		for(int i=0;i<x;i++) {
			array[i]=s.nextInt();
		}
		
		for(int i=0;i<x;i++) {
			nm+=Integer.toString(array[i]);		
		}
	
		int nmb=Integer.parseInt(nm);
		
		String no=Integer.toString(nmb);
		String number[]=no.split("");
		int ans=0;
		int number1[]=new int[number.length];
		
		for(int i=0;i<number1.length;i++) {
			number1[i]=Integer.parseInt(number[i]);
		}
		
		int len=no.length();
		int arr[]=new int[len];
		
		
		for(int i=1;i<=len;i++) {
			arr[i-1]=len-i;
		}
		
//		for(int i=1;i<len;i++) {
//			System.out.println(arr[i]);
//		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			ans+=arr[i]*Math.pow(10, number1[i]);
			
		}
		
//		System.out.println(ans);
		
		if(ans==nmb) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
		
	}
}
