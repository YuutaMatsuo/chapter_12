package p02;

public class Hero extends Character {

	public Hero(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	public void attack() {
		System.out.println("勇者" + this.name + "の攻撃！");
	}
}
