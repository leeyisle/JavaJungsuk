package ch07;

/*
 * 실행결과 예측
 * 100
 * Child Method
 * 200
 * Child Method
 * 
 * 메서드의 경우 참조변수의 타입에 관계없이 항상 실제 인스턴스의 메서드 호출
 * 멤버변수는 참조변수의 타입에 따라 달라짐
 */

class Ex20 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}
}
