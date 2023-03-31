package ch04;

public class Ex11 {
	public static void main(String[] args) {
//	피보나치수열은 앞의 두 수를 더해서 다음 수를 만들어 나가는 수열. 1,1,2,3,5,8,13...
//	1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		
		System.out.print(num1+","+num2);
		
		for (int i = 0 ; i < 8 ; i++ ) {
//		(1) . 알맞은 코드를 넣어 완성하시오
			num3 = num1+num2; 
			System.out.printf(", %d", num3);

			num1 = num2;
			num2 = num3;
		}
	

	}
}
