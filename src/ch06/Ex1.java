package ch06;

public class Ex1 {
	public static void main(String[] args) {

		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
//Ex1. 다음과 같은 멤버변수를 갖는 sutdaCard 클래스 정의
//int num -카드숫자(1~10사이 정수) 
//boolean isKwang - 광이면 true, 아니면 false
class SutdaCard {
	int num; //카드숫자
	boolean isKwang; //광 여부

//	Ex2. Ex1에서 정의한 SutdaCard 클래서에 두 개의 생성자와 info()를 추가
//	실행결과
//	3
//	1K
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang ? "K" : "");
	}
}
