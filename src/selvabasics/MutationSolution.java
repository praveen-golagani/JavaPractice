package selvabasics;

import java.util.Arrays;

public class MutationSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 2, 3 };

		predict(a);
		totalSale(a); 
	}

	public static void totalSale(int[] a) {
		
		System.out.println("total sale : " + (a[0] + a[1] + a[2]));
	}

	public static void predict(int[] a) {
		a = Arrays.copyOf(a, a.length);
		a[0]++;
		a[1]++;
		a[2]++;
		System.out.println("predict : " + (a[0] + a[1] + a[2]));
	}
}
