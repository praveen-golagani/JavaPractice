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

    public String usingBuffer(String inp) {
        StringBuffer sbuf = new StringBuffer(inp);
        return sbuf.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReverseString rs = new ReverseString();
        System.out.println("Enter word/sentence : ");
        String input = sc.nextLine();
        System.out.println("Reverse : " + usingLoop(input));
        System.out.println("Reverse using Builder : " + rs.usingBuilder(input));
        System.out.println("Reverse using Buffer : " + rs.usingBuffer(input));
        sc.close();
    }
}
