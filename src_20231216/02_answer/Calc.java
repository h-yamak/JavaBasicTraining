/*
 *  以下のプログラムは2つのint型変数を指定した演算子で
 *  計算するプログラムである。
 *  現在、演算子が + である場合のみとなっているため、
 *  これを四則演算の演算子4種類のうち、どれが変数opeに入っていても
 *  正しく計算結果が得られるプログラムに修正してください。
 */
public class Calc {
	public static void main(String[] args) {
		// 解答例
		// 入力値を格納
		int first = 1;
		int sec = 2;
		
		// 四則演算の演算子（+, - , *, /）が入る
		String ope = "+";
		
		// 入力値の情報で計算する
		//int ans = first + sec;
		int ans = 0;
		switch(ope) {
			case "+":
				ans = first + sec;
				break;
			case "-":
				ans = first - sec;
				break;
			case "*":
				ans = first * sec;
				break;
			case "/":
				ans = first / sec;
				break;
		}
		
		System.out.println("答えは" + ans + "です");
	}
}
