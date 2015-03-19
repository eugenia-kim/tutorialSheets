package sheet1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Question4 {

	static Random generator = new Random();
	static Set<Integer> randomNum = new HashSet<Integer>();
	
	public static void main(String[] args) {
		assert args.length == 1;
		int limit = Integer.parseInt(args[0]);
		int x = generator.nextInt(limit);
		while (randomNum.size() < limit) {
			System.out.print(x + " ");
			randomNum.add(x);
			x = generator.nextInt(limit);
		}
	}
}
