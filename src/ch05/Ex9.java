package ch05;

public class Ex9 {
	public static void main(String[] args) {
//		주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램
		char[][] star = {
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		//star 출력
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//result에 star 저장
		for(int i=0; i < star.length;i++) {	//4
			for(int j=0; j < star[i].length;j++) {	//5
//			(1) . 알맞은 코드를 넣어 완성하시오	
				result[j][i] = star[star.length-1-i][j];
				/*해설 답. 
				int x=j;
				int y=star.length-1-i;
				
				result[x][y]=star[i][j];
				*/
			}
		}
		//result 출력
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
			System.out.print(result[i][j]);
			}
			
			System.out.println();
		}

	}
}
