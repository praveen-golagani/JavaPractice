package original;

import java.util.Scanner;

public class SwapEx {

    public void notUsingVar(int a, int b) {
        b = a + b - (a = b);
        System.out.println("After swap without third variable, a : " + a + ", b : " + b);
    }

    public static void usingVar(int a, int b) {
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("After swap using third var, a : " + a + ", b : " + b);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st num :");
            int a = sc.nextInt();
            System.out.println("Enter 2nd num :");
            int b = sc.nextInt();
            System.out.println("Before swap, a : " + a + ", b : " + b);
            usingVar(a, b);
            SwapEx swp = new SwapEx();
            swp.notUsingVar(a, b);
            sc.close();
        } catch (Exception e) {
            System.out.println("Exception occurred : " + e.getMessage() + " " + e.toString());
        } finally {
            System.out.println("Thank you");
        }
    }
}
