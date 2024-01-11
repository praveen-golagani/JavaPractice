package original;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public boolean findAnagram(String word_1, String word_2) {
		boolean flag = false;
		if (word_1.length() != word_2.length()) {
			return flag;
		} else {
			char[] word1Array = word_1.toLowerCase().toCharArray();
			char[] word2Array = word_2.toLowerCase().toCharArray();
			Arrays.sort(word1Array);
			Arrays.sort(word2Array);
			if (Arrays.equals(word1Array, word2Array)) {
				return true;
			}
			return flag;
		}

	}

	public static void main(String[] args) {
		// a word, phrase, or name formed by rearranging the letters of another, such as
		// silent, formed from listen
		Anagram aobj = new Anagram();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st word : ");
		String word_1 = sc.next();
		System.out.println("Enter 2nd word : ");	
		String word_2 = sc.next();
		sc.close();
		if (aobj.findAnagram(word_1, word_2)) {
			System.out.println("Result: " + word_1 + " , " + word_2 + " are Anagrams");
		} else {
			System.out.println("Result: " + word_1 + " , " + word_2 + " are not Anagrams");
		}
	}

}
