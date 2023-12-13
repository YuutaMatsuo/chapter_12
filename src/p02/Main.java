package p02;

public class Main {
	public static void main(String[] args) {
		// インスタンス化
		Character c1 = new Hero("みなと", 100);
		c1.attack();
		Character c2 = new Wizard("あさか", 100);
		c2.attack();
		Character c3 = new SuperHero("すがわら", 100);

		// ざっくりと捉えたためJVMはCharacterの箱の中に入っているのがHeroなのか分からない・・・
//		Hero h = c1;

		// キャスト演算子を使うことで強制的にHero型として扱う
//		Hero h = (Hero)c1;

		// 中身のインスタンスの型が違うとき、コンパイルは通るが実行時エラーが発生する
//		Wizard w = (Wizard)c1;

		// 各インスタンスを「Hero型」に格納できるかチェックを行う
		if (c2 instanceof Hero) {
			Hero h = (Hero) c2; // キャスト演算子を使用
			System.out.println("ダウンキャストに成功しました！");
		} else {
			System.out.println("ダウンキャスト出来ません！");
		}

		// Character型の一次元配列に「Hero」と「Wizard」のインスタンスを格納
		Character[] c = { c1, c2, c3 };

		// 拡張for文で各キャラクター(勇者・魔法使い）に共通の「attack()」を呼び出している
		for (Character chara : c) {
			chara.attack();
		}
	}
}
