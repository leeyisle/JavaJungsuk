package ch05;

public class Ex5 {
	public static void main(String[] args) {
//		1과 9 사이 중복되지 않는 숫자로 이루어진 3자리 숫자 만들어내는 프로그램.
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];

		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
//			(1) . 알맞은 코드를 넣어 완성하시오
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		//    . 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
		/* (2) */
		System.arraycopy(ballArr, 0, ball3, 0, ball3.length);
		
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}

	}
}
