/*
 *  String�^�̕ϐ�month�ɂ́A�����������Ă���B
 *  �ϐ�month�̒l�ɉ����āA�Ή�����2024�N�̌��̌�������
 *  �\������v���O�������쐬���Ă��������B
 *  �o�͂��镶����̌`���́A
 *  �u2024�N�����̌������́����ł��B�v�Ƃ���B
 *  ���u�v�͏o�͂��镶����͊܂܂Ȃ����̂Ƃ���B
 */
public class Question3 {
	public static void main(String[] args) {
		// �𓚗�
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
		
		System.out.println("2024�N" + month + "���̌�������" + lastDay + "���ł��B");
	}
}
