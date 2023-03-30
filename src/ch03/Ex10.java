package ch03;

public class Ex10 {
	public static void main(String[] args) {
//		대문자를 소문자로 변경하는 코드
//		문자코드는 소문자가 대문자보다 32만큼 더 큼
		
		char ch = 'Z';
		//(대문자 확인) ? (소문자로 변경) : ch
		char lowerCase =  'A' <= ch && ch <= 'Z' ? (char)(ch+32) : ch;
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}
