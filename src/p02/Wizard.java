package p02;

public class Wizard extends Character {
	public Wizard(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	
	public void attack() {
		System.out.println("魔法使い" + this.name + "の攻撃！");
	}
}
