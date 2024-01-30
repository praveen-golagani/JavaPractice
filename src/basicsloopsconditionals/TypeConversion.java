package basicsloopsconditionals;

public class TypeConversion {

	public static void main(String[] args) {
		
		//widening  // narrowing  using primitives
		// boxing, unboxing using Wrapper
		widening();
		narrowing();
		anyToString();
		stringToAny();
	}
	
	static void widening() {
		int a = 10;
		double b = a;
		System.out.println(b);
		long l = a;
		System.out.println(l);
	}
	
	static void narrowing() {
		double d = 55.45d;
		int i = (int) d;
		System.out.println(i);
	}
	
	static void anyToString(){
		int a = 5;
		String as = String.valueOf(a);
		System.out.println(as);
		System.out.println(as.length());
	}
	
	static void stringToAny() {
		String a= "44";
		int b = Integer.parseInt(a);
		System.out.println(b);
	}
}
