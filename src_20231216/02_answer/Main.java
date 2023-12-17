/*
 *  3Lと5Lのバケツが1個ずつあり、この2個のバケツを使用して
 *  水槽に4Lの水を汲むことになった。
 *  水槽にバケツで水を汲む回数を求めるプログラムを作成し、
 *  水を汲む回数を出力してください。
 */
public class Main {
	public static void main(String[] args) {
		// 解答例
		int bucket1 = 3;
		int bucket2 = 5;
		int aquarium = 4;
		
		int cnt = aquarium / (bucket2 - bucket1);
		System.out.println("水槽にバケツで水を汲む回数は" + cnt + "回です。");
	}
}
