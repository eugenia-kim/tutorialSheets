package sheet1.Question9;

import java.util.Random;

public class GameEngine {
	
	private Random generator = new Random();

	// Simulate battle between two fighters, displaying how the battle
	// progresses and who wins
	public void simulateBattle(LuckyFighter first, LuckyFighter second) {
	
		System.out.println("At start of battle, stats are:");
		System.out.println(first.toString());
		System.out.println(second.toString());
		System.out.println("------------------------------");
		while (true) {
			
			int firstAttackScore = first.calculateAttackScore();
			int secondAttackScore = second.calculateAttackScore();
			
			if (firstAttackScore > secondAttackScore) {
				System.out.println(first.getName() + " hits " + second.getName() + ", stats are:");
				second.takeDamage(first.calculateDamage());
				System.out.println(first);
				System.out.println(second);
				System.out.println("------------------------------");
				if (second.isDead()) {
					System.out.println("End of battle, " + first + " wins!");
					break;
				}
			} else if (firstAttackScore < secondAttackScore) {
				System.out.println(second.getName() + " hits " + first.getName() + ", stats are:");
				first.takeDamage(second.calculateDamage());
				System.out.println(first);
				System.out.println(second);
				System.out.println("------------------------------");
				if (first.isDead()) {
					System.out.println("End of battle, " + second + " wins!");
					break;
				}
			} else {
				System.out.println(first.getName() +" draws with " + second.getName());
				System.out.println("------------------------------");
			}
		}
		
	}

	public int rollDice() {
		return generator.nextInt(6) + 1;
	}
}
