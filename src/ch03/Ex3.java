package ch03;

public class Ex3 {
	public static void main(String[] args) {
//		 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다 삼항 연산자를 이용해서 알맞은 코드를 넣으시오 
		int num = 10;
		System.out.println(num==0? num : (num>0? "양수" : "음수") );
		
		int num2 = -5;
		System.out.println(num2==0? num2 : (num2>0? "양수" : "음수") );
		
		int num3 = 0;
		System.out.println(num3==0? num3 : (num3>0? "양수" : "음수") );
		
		//풀이 답
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
	}
}
