package ch07;

import ch07.Outer3.Inner3;

/*실행결과
 *30
 *20
 *10
 */
class Outer3 {
	int value = 10;

	class Inner3 {
		int value = 20;

		void method1() {
			int value = 30;
			System.out.println(/* (1) */value);
			System.out.println(/* (2) */this.value);
			System.out.println(/* (3) */Outer3.this.value);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝

class Ex27 {
	public static void main(String args[]) {
		/*
		 * (4) . 알맞은 코드를 넣어 완성하시오
		 */
		Outer3 outer = new Outer3();
		Inner3 inner = outer.new Inner3();
		
		inner.method1();
	}
}
