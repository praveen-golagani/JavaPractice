package selvabasics;

import java.util.Arrays;

public class RefernceType {

	public static int[] change(int[] a) {
		a[0]++;
		a[1]++;
		a[2]++;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,2,3};
		System.out.println("Before :"+Arrays.toString(a));
		change(a);
		System.out.println("After :"+Arrays.toString(a));
	}
	
	

}
