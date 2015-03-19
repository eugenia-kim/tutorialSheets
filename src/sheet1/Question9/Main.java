package sheet1.Question9;

public class Main {
	
	public static void main(String[] args) {
		
		GameEngine gameEngine = new GameEngine();
		
		LuckyFighter HumanWarrior = new LuckyFighter("Joe", "Human Warrior", 16, 12, 12, Strategy.AGGRESSIVE, gameEngine);
		
		LuckyFighter ElfLord = new LuckyFighter("Alex", "Elf Lord", 18, 6, 11, Strategy.DEFENSIVE, gameEngine);
		
		gameEngine.simulateBattle(HumanWarrior, ElfLord);
		
	}
}
