/*
 *  参照型の初期化と代入
 */
public class DataType2 {
	public static void main(String[] args) {
		// 文字列型(String)
		String str;
		str = "今日はJavaの勉強会です。";
		System.out.println("文字列型(String)の変数str：" + str);
		
		// 配列型(String型の配列) 書き方その1
		// 配列の要素番号は0から始まる
		String[] strArr = {"バナナ", "リンゴ", "ミカン"};
		System.out.println("配列型(String型の配列)の変数strArrの要素1つ目：" + strArr[0]);
		System.out.println("配列型(String型の配列)の変数strArrの要素2つ目：" + strArr[1]);
		System.out.println("配列型(String型の配列)の変数strArrの要素3つ目：" + strArr[2]);
		
		// 配列型(String型の配列) 書き方その2
		// 配列の要素番号は0から始まる
		String[] strArrTwo = new String[3];
		strArrTwo[0] = "バナナ";
		strArrTwo[1] = "リンゴ";
		strArrTwo[2] = "ミカン";
		System.out.println("配列型(String型の配列)の変数strArrTwoの要素1つ目：" + strArrTwo[0]);
		System.out.println("配列型(String型の配列)の変数strArrTwoの要素2つ目：" + strArrTwo[1]);
		System.out.println("配列型(String型の配列)の変数strArrTwoの要素3つ目：" + strArrTwo[2]);
		
		// 配列型(int型の配列)
		int[] iArr = {10, 15, 18, 25};
		System.out.println("配列型(int型の配列)の変数iArrの要素1つ目：" + iArr[0]);
		System.out.println("配列型(int型の配列)の変数iArrの要素2つ目：" + iArr[1]);
		System.out.println("配列型(int型の配列)の変数iArrの要素3つ目：" + iArr[2]);
		System.out.println("配列型(int型の配列)の変数iArrの要素4つ目：" + iArr[3]);
	}
}
