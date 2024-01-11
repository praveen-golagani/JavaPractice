package arraysconcept;

public class SumElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 2, 3 };
		System.out.println("sum : " + sumElements(num));
	}

	public static int sumElements(int[] num) {
		int sum = 0;
		for (int i : num) {
			sum += i;
		}

		return sum;
	}

}
