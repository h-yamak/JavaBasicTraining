/*
 * 練習問題7
 * 3リットルと5リットルのバケツが1個ずつあり、この2個のバケツを使用して
 * 水槽に4リットルの水を汲むことになった。
 * 水槽にバケツで水を汲む回数を求めるプログラムを作成し、水を汲む回数を出力してください。
 * クラス名、変数名は任意とする。
 */
public class QuestionSeven {
	public static void main(String[] args) {
		// 以下に処理を実装すること
		int x = 3;
		int y = 5;
		int z = 4;
		int a = z / (y - x);
		
		System.out.println(a);
	}
}
