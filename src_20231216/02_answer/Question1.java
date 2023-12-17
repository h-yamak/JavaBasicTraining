/*
 *  Aさんの期末テストの結果は、国語が83点、数学が65点、
 *  英語が63点だった。
 *  Aさんの3教科の平均点が70点以上の場合は「合格」、
 *  70点未満の場合は「不合格」の文字列を出力する
 *  プログラムを完成させてください。
 *  ※「」は出力内容には含まないものとする。
 */
public class Question1 {
	public static void main(String[] args) {
		// 解答例
		double jpn = 83;
		double math = 65;
		double eng = 63;
		
		double ave = (jpn + math + eng) / 3;
		
		if (ave >= 70) {
			System.out.println("合格");
		} else if (ave < 70) {
			System.out.println("不合格");
		}
	}
}
