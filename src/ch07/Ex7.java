package ch07;

class Parent {
	int x = 100;

	Parent() {
		this(200); // Parent(int x)를 호출
	}

	Parent(int x) { //마찬가지로 super();추가 -> Object() 호출
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000); // Child(int x)를 호출
	}

	Child(int x) {
		//생성자 첫 줄에 다른 생성자가 없으므로 컴파일러가 super(); 추가(조상기본생성자 호출) -> Parent() 호출
		this.x = x;
	}
}

class Ex7 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX());
	}
}