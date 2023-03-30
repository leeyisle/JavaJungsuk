package ch03;

public class Ex6 {
	public static void main(String[] args) {
//		num 값보다 크면서 가장 가까운 10의 배수에서 num의 값을 뺀 나머지를 구하는 코드
//		ex) num=24 일 때 6
		int num = 24;
		System.out.println(10-(num%10));
	}

}
