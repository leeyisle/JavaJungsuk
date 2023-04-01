package ch05;

public class Ex4 {
	public static void main(String[] args) {
//		2차원배열 arr에 담긴 모든 값의 총합과 평균
		int[][] arr = {
			{ 5, 5, 5, 5, 5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
		};
		int total = 0;
		float average = 0;
		/*
		(1) . 알맞은 코드를 넣어 완성하시오
		*/
//		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
			}
//			cnt += arr[i].length;
			average = total/(float)(arr.length*arr[0].length);	//이건 모든 배열의 length가 같을 때만 사용 가능할 듯
		}
		
		
		System.out.println("total="+total);
		System.out.println("average="+average);

	}
}
