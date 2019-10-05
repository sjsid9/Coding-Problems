package DivideandConquer;

import java.util.Scanner;

public class Karatsuba_Multiliplication_Algorithm {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String n1 = s.next();
		String n2 = s.next();
		
		int ans = karatsubaMultiplication(Integer.parseInt(n1),Integer.parseInt(n2),n1.length(),n2.length());
		
		System.out.println(ans);
		
	}

	private static int karatsubaMultiplication(int x, int y,int l1,int l2) {
		
		if((x<10 || y< 10) && l1==1 || l2 ==1) {
			return x * y;
		}
		
		int a = (int)(x/Math.pow(10,l1/2));
		int c = (int)(y/Math.pow(10,l2/2));
		int b = (int)(x%Math.pow(10,l1/2));
		int d = (int)(y%Math.pow(10,l2/2));
		
		int ac = karatsubaMultiplication(a,c ,(l1+1)/2,(l2+1)/2);
		
		int bd = karatsubaMultiplication(b,d,(l1)/2,(l2)/2);
		
		int i = karatsubaMultiplication((a+b),(c+d), (l1)/2, (l2)/2);
		
		int ans = i-ac-bd;
		int result;
		if(l1%2==0) {
		result = (int) (Math.pow(10, l1)*ac+Math.pow(10, (l2+1)/2)*ans+bd);
		}else {
			result = (int) (Math.pow(10, l1-1)*ac+Math.pow(10, (l2)/2)*ans+bd);	
		}
		return result;
	}
}
