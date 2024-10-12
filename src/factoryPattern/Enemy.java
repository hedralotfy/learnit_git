package factoryPattern;

public abstract class Enemy {

	public String name;
	public int health;
	public int damage;
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getDamage() {
		return damage;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void showUp() {
		System.out.println(name + " has showed up with health " + health + " and damage " + damage);
	}
	
}


