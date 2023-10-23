/*
 *  プリミティブ型の初期化と代入
 */
public class DataType {
	public static void main(String[] args) {
		// 論理型
		boolean flg;				// 初期化
		flg = true;					// 代入
		System.out.println("論理型の変数flg：" + flg);
		
		// 整数型(byte)
		byte b;
		b = 8;
		System.out.println("整数型(byte)の変数b：" + b);
		
		// 整数型(short)
		short s;
		s = 10000;
		System.out.println("整数型(short)の変数s：" + s);
		
		// 整数型(int) ※整数型の場合、基本的にはint型を使用
		int i;
		i = 10000000;
		System.out.println("整数型(int)の変数i：" + i);
		
		// 整数型(long) ※long型の場合、代入の際に末尾にLを付加
		long lg;
		lg = 1000000000000L;
		System.out.println("整数型(long)の変数lg：" + lg);
		
		// 小数点型(float) ※float型の場合、代入の際に末尾にFを付加
		float ft;
		ft = 0.14F;
		System.out.println("小数点型(float)の変数ft：" + ft);
		
		// 小数点型(double) ※小数点型の場合、基本的にはdouble型を使用
		double dob;
		dob = 0.01;
		System.out.println("小数点型(double)の変数dob：" + dob);
		
		// 文字型(char)
		char c;
		c = '\u0041';
		System.out.println("小数点型(char)の変数c：" + c);
	}
}
