package inner_class_sample;

public class Outer {
	// 外部クラスにに定義したフィールドgreeting
	private String greeting = "こんにちは";
	public class Inner {
		public String hello() {
			// 内部クラスInnerから外部クラスのOuterクラスのフィールドgreetingを参照
			return greeting;
		}
	}
}
