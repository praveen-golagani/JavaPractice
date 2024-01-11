package practice1;

import java.util.Scanner;

public class ReverseString {

	String rev = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word: ");
		ReverseString rs = new ReverseString();
		String word = sc.nextLine();
		sc.close();
		rs.usingForLoop(word);
		rs.usingArray(word);
	}

	public void usingForLoop(String word) {
		for (int i = word.length() - 1; i >= 0; i--) {
			rev += word.charAt(i);
		}
		System.out.println(rev);
	}

	public void usingArray(String word) {
		String reverse = "";
		char[] wordArray = word.toCharArray();
		for (int i = wordArray.length - 1; i >= 0; i--) {
			reverse += wordArray[i];
		}
		System.out.println(reverse);
	}

}
