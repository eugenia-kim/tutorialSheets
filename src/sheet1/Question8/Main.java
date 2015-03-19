package sheet1.Question8;

public class Main {
	
	public static void main(String[] args) {
		
		GameEngine gameEngine = new GameEngine();
		
		Fighter HumanWarrior = new Fighter("Joe", "Human Warrior", 16, 12, gameEngine);
		
		Fighter ElfLord = new Fighter("Alex", "Elf Lord", 18, 6, gameEngine);
		
		gameEngine.simulateBattle(HumanWarrior, ElfLord);
		
	}
}
