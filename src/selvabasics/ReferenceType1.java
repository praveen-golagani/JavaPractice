package selvabasics;

import java.util.Arrays;

public class ReferenceType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,2,3};
		System.out.println("Before : "+Arrays.toString(a));
		change(a);
		System.out.println("After : "+Arrays.toString(a));
		
	}

	public static void change(int[] a) {
		
		a = new int[] {2,1,4}; // reference changed 
		a[0]++;
		a[1]++;
		a[2]++;
	}
}
