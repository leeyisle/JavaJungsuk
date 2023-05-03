package ch09;

import java.util.Arrays;

//커맨드라인으로 2-9사이의 두 개의 숫자를 받아 두 숫자 사이의 구구단을 출력하는 프로그램 작성

public class Ex11 {

	public static void main(String[] args) {
		int from = 0;
		int to = 0;
		
		try {
			if (args.length != 2)
				throw new Exception("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
			from = Integer.parseInt(args[0]);
			to = Integer.parseInt(args[1]);
			if (!(2 <= from && from <= 9 && 2 <= to && to <= 9))
				throw new Exception("단의 범위는 2와 9 사이의 값이어야 합니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		// 시작 단(from) 이 끝 단(to) 보다 작아야하니까
		// to보다 from의 값이 크면 두 값을 바꾼다
		if (from > to) {
			int tmp = from;
			from = to;
			to = tmp;
		}
		// from단부터 to단까지 출력한다
		for (int i = from; i <= to; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}

		/* 유효성검사 꼭 챙겨하기
		if(args.length != 2) {
			System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
		}
		int[] num = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			num[i] = Integer.parseInt(args[i]);
		}
		if(!(2<=num[0] && num[0]<=9 && 2<=num[1] && num[1]<=9)) {
			System.out.println("단의 범위는 2와 9 사이의 값이어야 합니다.");
		}
		
		Arrays.sort(num);
		
		for (int i = num[0]; i <= num[1]; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
			System.out.println();
		}
		 */
	}
}
