package original;

public class SwapEx {

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap, a : "+a+", b : "+b);
        useThirdvar(a,b);
        SwapEx swp = new SwapEx();
        swp.withoutThirdvar(a,b);
    }

    public void withoutThirdvar(int a, int b){
        b = a+b-(a=b);
        System.out.println("After swap without third variable, a : "+a+", b : "+b);
    }

    public static void useThirdvar(int a, int b){
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("After swap using third var, a : "+a+", b : "+b);
    }
}
