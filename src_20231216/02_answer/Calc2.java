/*
 *  �ȉ��̃v���O������2��int�^�ϐ����w�肵�����Z�q��
 *  �v�Z����v���O�����ł���B
 *  ���݁A���Z�q�� + �ł���ꍇ�݂̂ƂȂ��Ă��邽�߁A
 *  ������l�����Z�̉��Z�q4��ނ̂����A�ǂꂪ�ϐ�ope�ɓ����Ă��Ă�
 *  �������v�Z���ʂ�������v���O�����ɏC�����Ă��������B
 *  �������A�v�Z����2�̒l�Ɖ��Z�q�̓R�}���h���C�������Ŏw�肷����̂Ƃ���B
 */
public class Calc2 {
	public static void main(String[] args) {
		// �𓚗�
		// ���͒l���i�[
		int first = Integer.parseInt(args[0]);
		int sec = Integer.parseInt(args[2]);
		
		// �l�����Z�̉��Z�q�i+, - , *, /�j������
		String ope = args[1];
		
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
