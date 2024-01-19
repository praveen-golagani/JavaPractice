package oops_concepts;

public class RuntimeTestMain {

	public static void main(String[] args) {
		//runtime poly based on reference
			//RunTimeDog a = new RunTimeDog();
			//RunTimeCat a = new RunTimeCat();
			//RunTimeHorse a = new RunTimeHorse();
			//test(a);
		
		//works as they extend animal
		RunTimeAnimal b = new RunTimeDog();
		test(b);
		b = new RunTimeCat();
		test(b);
		b = new RunTimeHorse();
		test(b);
			
	}
	
	private static void test(RunTimeAnimal ani) {
		ani.makeSound();
		ani.walk();
	}
}
