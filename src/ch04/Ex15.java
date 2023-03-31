package ch04;

public class Ex15 {
	public static void main(String[] args) {
//	회문수 구하는 프로그램
//	회문수 : 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다.
		int number = 12321;
		int tmp = number;
		int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
		
		while(tmp !=0) {
//		(1) . 알맞은 코드를 넣어 완성하시오
			result = result*10 + tmp%10;
			tmp = tmp/10;
			
		}
		
		if(number == result)
			System.out.println( number + " 는 회문수 입니다."); 
		else
			System.out.println( number + " 는 회문수가 아닙니다.");
	}
}
