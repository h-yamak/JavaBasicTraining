/*
 *  �Q�ƌ^�̏������Ƒ��
 */
public class DataType2 {
	public static void main(String[] args) {
		// ������^(String)
		String str;
		str = "������Java�̕׋���ł��B";
		System.out.println("������^(String)�̕ϐ�str�F" + str);
		
		// �z��^(String�^�̔z��) ����������1
		// �z��̗v�f�ԍ���0����n�܂�
		String[] strArr = {"�o�i�i", "�����S", "�~�J��"};
		System.out.println("�z��^(String�^�̔z��)�̕ϐ�strArr�̗v�f1�ځF" + strArr[0]);
		System.out.println("�z��^(String�^�̔z��)�̕ϐ�strArr�̗v�f2�ځF" + strArr[1]);
		System.out.println("�z��^(String�^�̔z��)�̕ϐ�strArr�̗v�f3�ځF" + strArr[2]);
		
		// �z��^(String�^�̔z��) ����������2
		// �z��̗v�f�ԍ���0����n�܂�
		String[] strArrTwo = new String[3];
		strArrTwo[0] = "�o�i�i";
		strArrTwo[1] = "�����S";
		strArrTwo[2] = "�~�J��";
		System.out.println("�z��^(String�^�̔z��)�̕ϐ�strArrTwo�̗v�f1�ځF" + strArrTwo[0]);
		System.out.println("�z��^(String�^�̔z��)�̕ϐ�strArrTwo�̗v�f2�ځF" + strArrTwo[1]);
		System.out.println("�z��^(String�^�̔z��)�̕ϐ�strArrTwo�̗v�f3�ځF" + strArrTwo[2]);
		
		// �z��^(int�^�̔z��)
		int[] iArr = {10, 15, 18, 25};
		System.out.println("�z��^(int�^�̔z��)�̕ϐ�iArr�̗v�f1�ځF" + iArr[0]);
		System.out.println("�z��^(int�^�̔z��)�̕ϐ�iArr�̗v�f2�ځF" + iArr[1]);
		System.out.println("�z��^(int�^�̔z��)�̕ϐ�iArr�̗v�f3�ځF" + iArr[2]);
		System.out.println("�z��^(int�^�̔z��)�̕ϐ�iArr�̗v�f4�ځF" + iArr[3]);
	}
}
