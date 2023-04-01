package ch05;

public class Ex11 {
	public static void main(String[] args) {
//		주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성하여 
//		배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력
		int[][] score = {
				  {100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
			};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {
//				(1) . 알맞은 코드를 넣어 완성하시오
				//기존 배열 복사
				result[i][j] = score[i][j];
				
				//score[i][j]를 어디에 더해줄 것인지. 
				result[i][score[0].length] += score[i][j];	//행 총합
				result[score.length][j] += score[i][j];		//열 총합
				result[score.length][score[0].length] += score[i][j];//전체 홍합

			}
		}
		
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}

	}
}
