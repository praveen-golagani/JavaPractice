package arraysconcept;

public class SearchLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 30 };
		int num = 30;

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				System.out.println("The first index of " + num + " is : " + i);
				break;
			}
		}
		
	}

}
