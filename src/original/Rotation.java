package original;

public class Rotation {

	public static void main(String[] args) {
		String word1 = "abcd";
		String word2 = "bdda";
		
		// Concatenate the word1to itself and if indexOf do not returns -1  its rotation, else not a rotation
		if (word1.length() != word2.length()) {
			System.out.println(word1 + " is not a rotaion of " + word2);
			System.exit(0);
		} else {
			String word3 = word1 + word1;
			if (word3.indexOf(word2) != -1) {
				System.out.println(word1 + " is a rotaion of " + word2);
			} else {
				System.out.println(word1 + " is not a rotaion of " + word2);
			}
		}
	}

}
