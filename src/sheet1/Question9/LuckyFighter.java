package sheet1.Question9;

public class LuckyFighter {
	
	private String name;
	
	private String type;
	
	private final int initialStamina;
	
	private int stamina;
	
	private int skill;
	
	private GameEngine gameEngine;
	
	private int luck;
	
	private Strategy strategy;
	
	public LuckyFighter(String name, String type, int skill, int stamina, int luck, Strategy strategy, GameEngine gameEngine) {
		this.name = name;
		this.type = type;
		this.skill = skill; 
		initialStamina = stamina;
		this.stamina = stamina;
		this.gameEngine = gameEngine;
		this.luck = luck;
		this.strategy = strategy;
	}
	
	public boolean checkLuck() {
		System.out.println(name + " tests luck...");
		if(luck == 0) {
			System.out.println(name + " is out of luck!");
			return false;
		}
		int diceLuck = gameEngine.rollDice() + gameEngine.rollDice();
		luck--;
		boolean result = diceLuck <= luck;
		System.out.println(name + " is " + (result ? "lucky" : "unlucky") + "!");
		return result;
	}
	
	// Reduce the fighter’s stamina accordingly
	public void takeDamage(int damage) {
		if(luck > 0) {
			if(strategy == Strategy.AVERAGE && stamina < 3 || strategy == Strategy.AGGRESSIVE && stamina < initialStamina/2 || strategy == Strategy.DEFENSIVE) {
				System.out.println(name + " tries to resist the damage...");
				if(checkLuck()) {
					System.out.println("The damage is partially resisted!");
					damage--;
				} else {
					System.out.println("Oh no, the damage is even worse!");
					damage++;
				}
			}
		}
		stamina = Math.max(0, stamina - damage);
	}
	
	// Return the number of damage points to be inflicted on opponent
	public int calculateDamage() {
		final int DAMAGE_VALUE = 2;
		final int AGGRESSIVE_MULTIPLIER = 2;
		final int MISS_PENALTY = 1;
		if(strategy == Strategy.AGGRESSIVE ) {
			if(checkLuck()) {
				return DAMAGE_VALUE * AGGRESSIVE_MULTIPLIER;
			} else {
				return DAMAGE_VALUE - MISS_PENALTY;
			}
		}
		return DAMAGE_VALUE;
	}
	
	// Calculate an attack score for the fighter using the procedure described above
	public int calculateAttackScore() {
		skill += gameEngine.rollDice() + gameEngine.rollDice();
		return skill;
	}
	
	// Determine whether fighter is still alive
	public boolean isDead() {
		return (stamina == 0);
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + " - " + strategy + " " + type + " - skill: " + skill + "; stamina: " + stamina;
	}
}
