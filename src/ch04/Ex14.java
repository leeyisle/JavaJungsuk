package ch04;

public class Ex14 {
	public static void main(String[] args) {
//	숫자맞추기 게임

		// 1~100 사이의 임의의 값을 얻어서 answer 에 저장한다
		int answer = (int) (Math.random()*100)+1; //(1)
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		System.out.println(answer);
		
		//  화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt(); //  . 입력받은 값을 변수 input에 저장한다
//		(2) . 알맞은 코드를 넣어 완성하시오
			if(input==answer) {
				System.out.printf("맞췄습니다.%n시도횟수는 %d번 입니다.",count);
				break;
			}else if(input<answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(input>answer){
				System.out.println("더 작은 수를 입력하세요.");
			}
			
		} while(true); // 무한반복문

	}
}
