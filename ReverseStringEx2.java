package original;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringEx2 {
    // Reverse The String With Preserving The Position Of Spaces

    public static void spaceStays(String inp) {

        char[] inputArray = inp.toCharArray();
        char[] result = new char[inputArray.length];
        // entry of spaces in the result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }
        // Traverse input string from beginning and put characters in result from end
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            // Ignore spaces in input string
            if (inputArray[i] != ' ') {
                // ignore spaces in result.
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String input = sc.nextLine();
        System.out.println("Reversed String without space position change : ");
        // inp = "0123 5 7";
        spaceStays(input);
        sc.close();
    }
}
