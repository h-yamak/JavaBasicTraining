/*
 *  String型の変数monthには、月が代入されている。
 *  変数monthの値に応じて、対応する2024年の月の月末日を
 *  表示するプログラムを作成してください。
 *  出力する文字列の形式は、
 *  「2024年○月の月末日は○日です。」とする。
 *  ※「」は出力する文字列は含まないものとする。
 */
public class Question3 {
	public static void main(String[] args) {
		// 解答例
		String month = "2";
		String lastDay = "";
		
		switch (month) {
			case "1":
				lastDay = "31";
				break;
			case "2":
				lastDay = "29";
				break;
			case "3":
				lastDay = "31";
				break;
			case "4":
				lastDay = "30";
				break;
			case "5":
				lastDay = "31";
				break;
			case "6":
				lastDay = "30";
				break;
			case "7":
				lastDay = "31";
				break;
			case "8":
				lastDay = "31";
				break;
			case "9":
				lastDay = "30";
				break;
			case "10":
				lastDay = "31";
				break;
			case "11":
				lastDay = "30";
				break;
			case "12":
				lastDay = "31";
		}
		
		System.out.println("2024年" + month + "月の月末日は" + lastDay + "日です。");
	}
}
