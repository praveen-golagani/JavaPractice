package original;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseString rs = new ReverseString();
        System.out.println("Enter word/sentence : ");
        String input = sc.nextLine();
        System.out.println("Reverse : " + rev(input));
        System.out.println("Reverse using Builder : " + rs.revBuilder(input));
        System.out.println("Reverse using Buffer : " + rs.revBuff(input));
        sc.close();
    }

    public static String rev(String inp) {
        String rev = "";
        for (int i = inp.length() - 1; i >= 0; i--) {
            rev += inp.charAt(i);
        }
        return rev;
    }

    public String revBuilder(String inp) {
        StringBuilder sbld = new StringBuilder(inp);
        return sbld.reverse().toString();
    }

    public String revBuff(String inp) {
        StringBuffer sbuf = new StringBuffer(inp);
        return sbuf.reverse().toString();
    }
}
