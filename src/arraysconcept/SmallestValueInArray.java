package arraysconcept;

import java.util.Arrays;

public class SmallestValueInArray {

	public static void main(String[] args) {
		int[] a = { 10, 45, 20, 30, 5 };

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
