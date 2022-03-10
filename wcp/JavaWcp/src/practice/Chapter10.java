package practice;

import java.sql.SQLException;

public class Chapter10 {
	public static void main(String[] args) {
		try {
			int array[] = { 1, 3, 5 };
			Chapter10.validIndex(array, 2);
			Chapter10.validIndex(array, 3);
			
			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}
		
		try {
			Chapter10.throwSQLException();
		} catch (SQLException e) {
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
		} finally {
			System.out.println("throwSQLExceptionの呼び出し終了");
		}
		
		System.out.println("mainメソッドの終了");
	}
	
	public static void validIndex(int[] array, int n) {
		if (array.length <= n) {
			throw new IllegalArgumentException(n + " はサイズの範囲外です");
		}
		System.out.println("インデックス " + n + " の要素は " + array[n] + " です");
	}
	
	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}
}
