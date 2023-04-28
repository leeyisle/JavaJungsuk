package ch07;

class myProduct {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수

	myProduct(){}	//조상클래스 기본생성자 추가
	myProduct(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class myTv extends myProduct {
	myTv() {} //조상생성자 super()를 호출하는데, 조상 Product의 기본생성자가 정의되어 있지않아 에러 발생

	public String toString() {
		return "Tv";
	}
}

class Ex5 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}