package selvabasics;

public class PrimitiveType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("Before :"+a);
		change(a);
		System.out.println("After :"+a);
		
	}
	
	public static void change(int a) {
		a++;
	}

}
