/*
 *  �ȉ��̃v���O������2��int�^�ϐ����w�肵�����Z�q��
 *  �v�Z����v���O�����ł���B
 *  ���݁A���Z�q�� + �ł���ꍇ�݂̂ƂȂ��Ă��邽�߁A
 *  ������l�����Z�̉��Z�q4��ނ̂����A�ǂꂪ�ϐ�ope�ɓ����Ă��Ă�
 *  �������v�Z���ʂ�������v���O�����ɏC�����Ă��������B
 */
public class Calc {
	public static void main(String[] args) {
		// �𓚗�
		// ���͒l���i�[
		int first = 1;
		int sec = 2;
		
		// �l�����Z�̉��Z�q�i+, - , *, /�j������
		String ope = "+";
		
		// ���͒l�̏��Ōv�Z����
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
		
		System.out.println("������" + ans + "�ł�");
	}
}
