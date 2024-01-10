package original;

import java.util.Scanner;

public class ReverseStringEx1 {

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

    public String revBld(String inp) {
        String reverse = "";
        String inp_arr[] = inp.split(" ");
        for (int i = 0; i < inp_arr.length; i++) {
            StringBuilder sbld = new StringBuilder(inp_arr[i]);
            reverse += sbld.reverse().toString() + " ";
        }

        return reverse.trim();
    }
    public static void main(String[] args) {
        //Reverse Each Word Of A String
        Scanner sc = new Scanner(System.in);
        ReverseStringEx1 rsx = new ReverseStringEx1();
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        System.out.println("Reversed String without position change : " + rev(input));
        System.out.println("used builder : " + rsx.revBld(input));
        sc.close();
    }

}
