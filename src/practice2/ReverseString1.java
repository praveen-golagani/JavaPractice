package practice2;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = input();
		reverse(str);
	}
	
	public static String input() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		return str;
	}
	
	public static void reverse(String str) {
		
		String rev = "";
	 char[] sarray = str.toCharArray();
	 for(int i = sarray.length-1;i>=0;i--) {
		 rev+=sarray[i];
	 }
	 System.out.println(rev);
	}

}
