package polymorphism;

public class AbstMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SelAbsAnimal a = new Buffalo();
		a.makeSound();
		a.walk();
			a = new Tiger();
			a.makeSound();
			a.walk();
			
	}

}
