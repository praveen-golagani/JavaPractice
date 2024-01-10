package original;

import java.util.Scanner;

public class SwapEx {

    public void withoutThirdvar(int a, int b) {
        b = a + b - (a = b);
        System.out.println("After swap without third variable, a : " + a + ", b : " + b);
    }

    public static void useThirdvar(int a, int b) {
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
            useThirdvar(a, b);
            SwapEx swp = new SwapEx();
            swp.withoutThirdvar(a, b);
            sc.close();
        } catch (Exception e) {
            System.out.println("Exception occurred : " + e.getMessage() + " " + e.toString());
        } finally {
            System.out.println("Thank you");
        }
    }
}
