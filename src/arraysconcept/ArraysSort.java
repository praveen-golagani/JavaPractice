package arraysconcept;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 100, 20, 30, 40, 50 };
		System.out.println("Before sort : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("total array view "+Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("After sort aescending : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("total array view "+Arrays.toString(arr));
		
		System.out.println("After sort descending : ");
		
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("total array view "+Arrays.toString(arr));
	}

}
