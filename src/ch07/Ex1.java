package ch07;
/*
 * [7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌 (SutdaDeck클래스) 을 정의한 것이다
 *  섯다카드 20장을 담는 SutdaCard배열을 초기화하시오 단 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고
 *  숫자가 1,3,8인 경우에는 둘 중의 한 장은 광(Kwang) 이어야 한다 즉 SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다
 * 실행 결과 : 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
 */
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
//		(1) 배열 SutdaCard를 적절히 초기화 하시오
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = i<10 && (num==1 || num==3 || num==8);
			cards[i] = new SutdaCard(num, isKwang);
		}
		
	}
	/*
	 * [7-2] 메서드 추가
	 * 1. shuffle : 배열 cards에 담긴 카드의 위치 뒤섞는다. (Math.random() 사용)
	 * 2. pick : 배열 cards에서 지정된 위치의 SutdaCard를 반환 (반환타입 : SutdaCard, 매개변수 : int index)
	 * 3. pick : 배열 cards에서 임의의 위치의 SutdaCard를 반환 (Math.random() 사용, 반환타입 : SutdaCard)
	 * */	
	
	void shuffle(){
		for(int i=0; i<cards.length; i++) {
			int ran = (int) (Math.random()*cards.length);
			
			SutdaCard tmp = cards[i];
			cards[i] = cards[ran];
			cards[ran] = tmp;
		}
	} //shuffle() end
	
	SutdaCard pick(int index) {
		//유효성검사 잊지말고 해주기
		if(index < 0 || CARD_NUM <= index)
			return null;
		return cards[index];
	}
	
	SutdaCard pick() {
		int ran = (int) (Math.random()*cards.length);
		return cards[ran];
		/*다소 비효율적이지만, 객체지향적인 방식으로도 코드 작성 가능
		int index = (int) (Math.random()*cards.length);
		return pick(index);
		*/
	}
	
	
} //SutdaDeck end

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

//  info()대신 Object클래스의 toString()을 오버라이딩했다
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Ex1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
