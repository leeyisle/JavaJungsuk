package ch07;

import java.util.Arrays;

/*
 * 메서드 완성
 * 1. buy
 * 기능 : 지정된 물건 구입. 가진돈에서 물건의 가격 빼고 장바구니에 담는다
 * 만일 가진 돈이 물건의 가격보다 적다면 바로 종료
 * 매개변수 : Product p (구입할 물건)
 * 2. add
 * 기능 : 지정된 물건을 장바구니에 담는다
 * 만일 장바구니에 담을 공간이 없으면 장바구니의 크기를 2배로 늘린 다음 담는다
 * 매개변수 : Product p (구입할 물건)
 * 3. summary
 * 기능 : 구입한 물건의 목록과 사용금액, 남은 금액 출력 
 * 
 * 실행결과
 * 잔액이 부족하여 Computer을/를 살수 없습니다.
 * 구입한 물건:Tv,Computer,Tv,Audio,Computer,Computer,
 * 사용한 금액:850
 * 남은 금액:150
 */

class Ex19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; //    Product배열 cart에 사용될 index

	void buy(Product p) {
		/*
		 * (1) . 아래의 로직에 맞게 코드를 작성하시오 
		 * 1.1 . 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다 
		 * 1.2 ,가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고 
		 * 1.3 .장바구니에 구입한 물건을 담는다. (add메서드 호출)
		 */
		if(money<p.price) {
			System.out.printf("잔액이 부족하여 %s을/를 살 수 없습니다.%n", p.toString());
			return;
		}
		
		money -= p.price;
		add(p);
	}

	void add(Product p) {
		/*
		 * (2) . 아래의 로직에 맞게 코드를 작성하시오 
		 * 1.1 i의 값이 장바구니의 크기보다 같거나 크면 
		 *  1.1.1  . 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다
		 *  1.1.2 . 기존의 장바구니의 내용을 새로운 배열에 복사한다 
		 *  1.1.3 . 새로운 장바구니와 기존의 장바구니를 바꾼다
		 * 1.2 물건을 장바구니(cart) 에 저장한다 그리고  i 의 값을 1 증가시킨다
		 */
		if(i>=cart.length) {
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		
		cart[i++] = p;
	} // add(Product p)

	void summary() {
		/*
		 * (3) . 아래의 로직에 맞게 코드를 작성하시오 
		 * 1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다 
		 * 1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다 
		 * 1.3  . 물건을 사고 남은 금액(money) 를 출력한다
		 */
		int totalPrice = 0;
		String list = "";
		
		for(i=0; i<cart.length; i++) {
			if(cart[i]==null)
				break;
			list += cart[i]+", ";
			totalPrice += cart[i].price;
		}
		
		System.out.printf("구입한 물건 : %s%n", list);
		System.out.printf("사용한 금액 : %d%n", totalPrice);
		System.out.printf("남은 금액 : %d%n", money);
	} // summary()
}

class Product {
	int price; // 제품의 가격
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}