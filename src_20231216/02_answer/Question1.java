/*
 *  A����̊����e�X�g�̌��ʂ́A���ꂪ83�_�A���w��65�_�A
 *  �p�ꂪ63�_�������B
 *  A�����3���Ȃ̕��ϓ_��70�_�ȏ�̏ꍇ�́u���i�v�A
 *  70�_�����̏ꍇ�́u�s���i�v�̕�������o�͂���
 *  �v���O���������������Ă��������B
 *  ���u�v�͏o�͓��e�ɂ͊܂܂Ȃ����̂Ƃ���B
 */
public class Question1 {
	public static void main(String[] args) {
		// �𓚗�
		double jpn = 83;
		double math = 65;
		double eng = 63;
		
		double ave = (jpn + math + eng) / 3;
		
		if (ave >= 70) {
			System.out.println("���i");
		} else if (ave < 70) {
			System.out.println("�s���i");
		}
	}
}
