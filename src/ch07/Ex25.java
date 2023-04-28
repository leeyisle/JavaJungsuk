package ch07;

import ch07.Outer.Inner;

/*
 * Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값 출력
 * 실행결과 
 * 100
 */

class Outer {
	class Inner {
		int iv = 100;
	}
}

class Ex25 {
	public static void main(String[] args) {
//		 (1) . 알맞은 코드를 넣어 완성하시오
		//내부클래스는 외부클래스의 멤버로 취급되기 때문에 외부클래스의 객체 생성 후 내부클래스 객체생성 가능
		Outer o = new Outer(); //1. 외부클래스 객체 생성
		Outer.Inner oi = new Outer().new Inner(); //2. 외부클래스.내부클래스 형식으로 내부클래스 객체 생성
//		Outer.Inner oi = o.new Inner(); //이것도 가능
		System.out.println(oi.iv);
		
	}
}
