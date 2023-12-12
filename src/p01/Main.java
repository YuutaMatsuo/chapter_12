package p01;

public class Main {
	public static void main(String[] args) {
		// Slime型の変数にSlimeインスタンスを生成・格納する
		Slime s = new Slime();

		// Doragon型の変数にDoragonインスタンスを生成・格納する
		Dragon d = new Dragon();

		// ここから「多態性」を利用する
		// 抽象クラスの「Monster」型の変数
		Monster m1;
		// 親クラスの「クラス型変数」にSlimeインスタンスを生成・格納 （多態性を利用）
		m1 = new Slime();
		// 「ドラゴン」をざっくりと「モンスター」として捉える
		Monster m2 = new Dragon();

		// インターフェースの「Creature」型の変数
		Creature c1;
		// 親インターフェースの「クラス型変数」にSlimeインスタンスを生成・格納(多態性を利用）
		c1 = new Slime();
		// 「ドラゴン」をざっくりと「生き物」として捉える
		Creature c2 = new Dragon();

	}
}
