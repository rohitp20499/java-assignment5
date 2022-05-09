package my.com.assignments;

public class Q3MemberClass {
	public static void main(String[] args) {
		OC2 a = new OC2();
		new OC2().new IC3().show();
	}
}

class OC2 {
	private int x = 1;
	float ft = 1.3f;

	public class IC2 {
		public int y = 2;

		public void print() {
			System.out.println(x + y + ft);
		}
	}

	class IC3 {
		public void show() {
			System.out.println("Hello World ");
		}
	}
}
