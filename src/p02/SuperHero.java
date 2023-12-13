package p02;

public class SuperHero extends Hero {
	
	public SuperHero(String name, int hp) {
		super(name, hp);
	}

	public void attack() {
		System.out.println("スーパー勇者" + this.name + "の攻撃！");
	}
}
