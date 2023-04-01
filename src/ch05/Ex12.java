package ch05;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
//		예제5-23을 변경하여 "전체 3문제 중 2문제 맞추셨습니다." 출력
		String[][] words = {
				{"chair","의자"}, // words[0][0], words[0][1]
				{"computer","컴퓨터"}, // words[1][0], words[1][1]
				{"integer","정수"} // words[2][0], words[2][1]
		};
		
		int cnt = 0;	//맞춘 횟수 카운트
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
				cnt++;	//맞출 때마다 값 증가
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
			}
		} // for
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", words.length, cnt);
	}
}
