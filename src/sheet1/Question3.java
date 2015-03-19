package sheet1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Question3 {

	static Random generator = new Random();
	static int x = generator.nextInt(50);
	static Set<Integer> randomNumbers = new HashSet<Integer>();
	
	public static void main(String[] args) {
		for(int i=0; i<6; i++) {
			while (randomNumbers.contains(x)) {
				x = generator.nextInt(50);
			}
			randomNumbers.add(x);
			System.out.println("Number " + (i+1) + ": " + x);
		}
		while (randomNumbers.contains(x)) {
			x = generator.nextInt(50);
		}
		System.out.println("Bonus Number: " + x);
	}

}
