/*
 *  B����̊����e�X�g�̌��ʂ́A���ꂪ49�_�A���w��93�_�A
 *  �p�ꂪ27�_�������B
 *  30�_�����̋��Ȃ�1�ł�����ꍇ�́A�u�ǎ��ł��v�A
 *  ����ȊO�̏ꍇ�́u�ǎ��͂���܂���v
 *  �̕�������o�͂���v���O���������������Ă��������B
 *  ���u�v�͏o�͓��e�ɂ͊܂܂Ȃ����̂Ƃ���B
 */
public class Question2 {
	public static void main(String[] args) {
		// �𓚗�
		int jpn = 49;
		int math = 93;
		int eng = 27;
		
		if (jpn < 30 || math < 30 || eng < 30) {
			System.out.println("�ǎ��ł�");
		} else {
			System.out.println("�ǎ��͂���܂���");
		}
	}
}
