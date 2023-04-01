package ch05;

public class Ex6 {
	public static void main(String[] args) {
//		거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산
		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) {
//		(1) . 알맞은 코드를 넣어 완성하시오
			System.out.printf("%d원 : %d%n",coinUnit[i], money/coinUnit[i]);
			money %= coinUnit[i];
		}
	}
}
