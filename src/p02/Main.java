package p02;

public class Main {
	public static void main(String[] args) {
		Character c1 = new Hero("みなと",100);
		Character c2 = new Wizard("あさか",100);
		
//		c1.attack();
		
		Character[] c = {c1,c2};
		
		for(Character chara : c) {
			chara.attack();
		}
	}
}
