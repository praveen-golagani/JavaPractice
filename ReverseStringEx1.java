package original;

import java.util.Scanner;

public class ReverseStringEx1 {
    public static void main(String[] args) {
        //Reverse Each Word Of A String
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        System.out.println("Reversed String without position change : " + rev(input));
        sc.close();
    }

    public static String rev(String inp) {
        String rev = "";
        String[] inp_str = inp.split(" ");
        for (int i = 0; i < inp_str.length; i++) {
            for (int j = inp_str[i].length() - 1; j >= 0; j--) {
                rev += inp_str[i].charAt(j);
            }
            rev += " ";
        }
        return rev.trim();
    }
}
