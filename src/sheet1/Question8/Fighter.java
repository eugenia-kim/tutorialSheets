package sheet1.Question8;

public class Fighter {
	
	private String name;
	private String type;
	private int stamina;
	private int skill;
	private GameEngine gameEngine;
	
	public Fighter(String name, String type, int skill, int stamina, GameEngine gameEngine) {
		this.name = name;
		this.type = type;
		this.skill = skill; 
		this.stamina = stamina;
		this.gameEngine = gameEngine;
	}
	
	// Reduce the fighter’s stamina accordingly
	public void takeDamage(int damage) {
		stamina = Math.max(0, stamina - damage);
	}
	
	// Return the number of damage points to be inflicted on opponent
	public int calculateDamage() {
		final int DAMAGE_VALUE = 2;
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
	
	public String toString() {
		return name + " - " + type + " - skill: " + skill + "; stamina: " + stamina;
	}
}
