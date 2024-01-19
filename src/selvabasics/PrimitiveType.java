package selvabasics;

public class PrimitiveType {

	public static int change(int a) {
		a++;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println("Before :"+a);
		System.out.println(change(a));
		System.out.println("After :"+a);
	}

}
