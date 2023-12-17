/*
 *  Bさんの期末テストの結果は、国語が49点、数学が93点、
 *  英語が27点だった。
 *  30点未満の教科が1つでもある場合は、「追試です」、
 *  それ以外の場合は「追試はありません」
 *  の文字列を出力するプログラムを完成させてください。
 *  ※「」は出力内容には含まないものとする。
 */
public class Question2 {
	public static void main(String[] args) {
		// 解答例
		int jpn = 49;
		int math = 93;
		int eng = 27;
		
		if (jpn < 30 || math < 30 || eng < 30) {
			System.out.println("追試です");
		} else {
			System.out.println("追試はありません");
		}
	}
}
