package ch04;

public class Ex12 {
	public static void main(String[] args) {
//	구구단 출력 2단부터 9단까지 각 3줄씩만
		/* 풀이
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=3; j++) {
				int x = j+1+(i-1)/3*3;
				int y = i%3==0 ? 3 : i%3;
				
				if(x > 9) break;
				
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
			System.out.println();
			if(i%3==0)	System.out.println();
		}
		*/
		//풀이가 너무 어렵다. 다른 풀이 참고해서 다시 풀기
		for(int i=2; i<10; i+=3) {	
			for(int j=1; j<=3; j++) { //곱하는 수
				for(int k=i; k<=i+2 && k<10; k++) { //단
					System.out.printf("%d*%d=%d \t",k,j,k*j);
				}
				System.out.println();	
			}
			System.out.println();	
		}
		/* 이건 세로로 전체 출력
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=3;j++) {
				System.out.printf("%d*%d=%d%n",i,j,i*j);
			}
			System.out.println();
		}
		*/

	}
}
