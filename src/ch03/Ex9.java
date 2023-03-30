package ch03;

public class Ex9 {
	public static void main(String[] args) {
//		ch가 영문자이거나 숫자일 때만 b의 값이 true
		
		char ch = 'L';
		boolean b = ('A'<=ch && ch <= 'z') || ('0' <= ch && ch <= '9');
		
		System.out.println(b);
	}
}
