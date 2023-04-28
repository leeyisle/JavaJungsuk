package ch07;

import ch07.Outer2.Inner2;

class Outer2 {
	static class Inner2 {
		int iv = 200;
	}
}

class Ex26 {
	public static void main(String[] args) {
		/*
		 * (1) . 알맞은 코드를 넣어 완성하시오
		 */
		Inner2 i = new Inner2(); //static클래스는 외부클래스 객체 생성 없이 바로 내부 객체 생성 가능 
//		Outer2.Inner2 oi = new Outer2.Inner2(); //이것도 가능
		System.out.println(i.iv);
	}
}
