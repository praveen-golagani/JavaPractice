package selvabasics;

public class MutationProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,2,3};
		
		
		predict(a);
		totalSale(a); // as same reference is passed both give same output refer next program for solution
	}

	public static void totalSale(int[] a) {
		System.out.println("total sale : "+(a[0]+a[1]+a[2]));
	}
	
	public static void predict(int[] a) {
		a[0]++;
		a[1]++;
		a[2]++;
		System.out.println("predict : "+(a[0]+a[1]+a[2]));
	}
}
