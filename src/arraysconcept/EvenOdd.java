package arraysconcept;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 3, 5, 4, 7, 8 };
		EvenOdd ed = new EvenOdd();
		ed.countEvenOdd(num);
	}

	public void countEvenOdd(int[] num) {
		int even = 0, odd = 0;
		for (int i : num) {
			if (i % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("even : " + even + " odd : " + odd);
	}

}
