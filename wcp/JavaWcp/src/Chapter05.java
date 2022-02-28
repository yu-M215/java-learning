
public class Chapter05 {
	public static void main(String[] args) {
		// プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
		long long1 = 12345678;
		double double1 = 0.1;
		boolean boolean1 = true;
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);
		
		// ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
		Float float1 = 0.5f;
		Integer integer1 = 215;
		Character char1 = 'こ';
		System.out.println(float1);
		System.out.println(integer1);
		System.out.println(char1);
		
		// 要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
        int[] array1 = { 1, 2, 3, 4, 5 };
        System.out.println(array1[2]);
	}

}
