package arraysconcept;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// homogeneous
		// int[], String[], char[],float[]..
		// Arrays.

		String[] names = { "praveen", "a ni" };
		String places[] = new String[3];
		int[] roll = new int[4];

		int[] bus = new int[] { 1, 2, 3 };

		// storing as objects
		Object[] alpha = { 1, 1.5f, "ant", 'a' };

		places[0] = "India";
		places[1] = "china";
		places[2] = "Australia";

		float gdp[] = new float[2];
		gdp[0] = (float) 1.3;
		gdp[1] = 2.2f;

		// multi dimension array
		int[][] flats = new int[2][3];
		flats[0][0] = 101;
		flats[0][1] = 2;
		flats[0][2] = 234;
		flats[1][0] = 34;
		flats[1][1] = 344;
		flats[1][2] = 56;

		// number of elements in array
		System.out.println(flats.length);
		// read single
		System.out.println(places[1]);
		// read multiple values
		for (String s : places) {
			System.out.println(s);
		}

		for (int[] x : flats) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
