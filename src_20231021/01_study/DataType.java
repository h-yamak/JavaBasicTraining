/*
 *  �v���~�e�B�u�^�̏������Ƒ��
 */
public class DataType {
	public static void main(String[] args) {
		// �_���^
		boolean flg;				// ������
		flg = true;					// ���
		System.out.println("�_���^�̕ϐ�flg�F" + flg);
		
		// �����^(byte)
		byte b;
		b = 8;
		System.out.println("�����^(byte)�̕ϐ�b�F" + b);
		
		// �����^(short)
		short s;
		s = 10000;
		System.out.println("�����^(short)�̕ϐ�s�F" + s);
		
		// �����^(int) �������^�̏ꍇ�A��{�I�ɂ�int�^���g�p
		int i;
		i = 10000000;
		System.out.println("�����^(int)�̕ϐ�i�F" + i);
		
		// �����^(long) ��long�^�̏ꍇ�A����̍ۂɖ�����L��t��
		long lg;
		lg = 1000000000000L;
		System.out.println("�����^(long)�̕ϐ�lg�F" + lg);
		
		// �����_�^(float) ��float�^�̏ꍇ�A����̍ۂɖ�����F��t��
		float ft;
		ft = 0.14F;
		System.out.println("�����_�^(float)�̕ϐ�ft�F" + ft);
		
		// �����_�^(double) �������_�^�̏ꍇ�A��{�I�ɂ�double�^���g�p
		double dob;
		dob = 0.01;
		System.out.println("�����_�^(double)�̕ϐ�dob�F" + dob);
		
		// �����^(char)
		char c;
		c = '\u0041';
		System.out.println("�����_�^(char)�̕ϐ�c�F" + c);
	}
}
