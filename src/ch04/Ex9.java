package ch04;

public class Ex9 {
	public static void main(String[] args) {
//		숫자로 이루어진 문자열 str. 각 자리의 합을 더한 결과를 출력하는 코드
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i < str.length(); i++) {
//		(1) . 알맞은 코드를 넣어 완성하시오
			sum += str.charAt(i)-'0';
		}
		
		System.out.println("sum="+sum);

	}
}
