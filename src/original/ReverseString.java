package original;

import java.util.Scanner;

public class ReverseString {
	 // Reversed String with position change
    public static String usingLoop(String inp) {
        String rev = "";
        for (int i = inp.length() - 1; i >= 0; i--) {
            rev += inp.charAt(i);
        }
        return rev;
    }

    public String usingBuilder(String inp) {
        StringBuilder sbld = new StringBuilder(inp);
        return sbld.reverse().toString();
    }

    public void usingBuffer(String inp) {
        StringBuffer sbuf = new StringBuffer(inp);
        System.out.println("Reverse using Buffer : " + sbuf.reverse().toString());
    }
    
    public static void usingArray(String word) {
		String reverse = "";
		char[] wordArray = word.toCharArray();
		for(int i = wordArray.length-1;i>=0;i--) {
		reverse += wordArray[i];
		}
		System.out.println("Reverse using Array : "+reverse);
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReverseString rs = new ReverseString();
        System.out.println("Enter word/sentence : ");
        String input = sc.nextLine();
        System.out.println("Reverse : " + usingLoop(input));
        usingArray(input);
        System.out.println("Reverse using Builder : " + rs.usingBuilder(input));
        rs.usingBuffer(input);
        sc.close();
    }
}
