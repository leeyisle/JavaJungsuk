package ch04;

public class Ex10 {
	public static void main(String[] args) {
//		int타입 변수 num. 각 자리의 합을 더한 결과를 출력
		int num = 12345;
		int sum = 0;

//		(1) . 알맞은 코드를 넣어 완성하시오
		for(int i=0;num>0;i++) {
			
			sum += num%10;
			num = num/10;
//			System.out.printf("sum=%d, num=%d%n",sum,num);
			
		}
		/* while문
		while(num < 0) {
			sum += num%10;
			num/=10;
		}
		*/
		System.out.println("sum="+sum);


	}
}
