package my.com.assignments;

class OuterClass {
	void m1() {
		class InClass {
			void m2() {
				System.out.println("Hi");
			}
		}
		new InClass().m2();
		System.out.println("m1() called");
	}
}

public class Q4ClassInsideAMethod {
	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.m1();
	}
}
