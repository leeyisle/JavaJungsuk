package ch04;

public class Ex1 {
	public static void main(String[] args) {
		
//	1. int형 변수 x 가 10보다 크고 20보다 작을 때 true
		int x = 13;
		
		if( 10<x && x<20) {
			System.out.println("x = " + x);
		}
		
//	2. char형 변수 ch가 공백이나 탭이 아닐 때 true
		char ch = 'A';
		if(!(ch==' ' || ch=='\t')) { //또는 ch!=' ' && ch!='\t'
			System.out.println("ch = " + ch);
		}
//	3. char형 변수 ch2가 'x' 또는 'X'일 때 true
		char ch2 = 'x';
		if(ch2=='x' || ch2=='X') {
			System.out.println("ch2 = " + ch2);
		}
//	4. char형 변수 ch3가 숫자('0'~'9')일 때 true
		char ch3 = '0';
		if('0'<=ch3 && ch3<='9') {
			System.out.println("ch3 = " + ch3);
		}
//	5. char형 변수 ch4가 영문자(대문자 또는 소문자)일 때 true
		char ch4 = 'x';
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) { //
			System.out.println("ch4 = " + ch4);
		}
//	6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true
		int year = 4404;
		if((year%400==0 || year%4==0) && year%100!=0) {
			System.out.println("year = " + year);
		}
//	7. boolean형 변수 powerOn가 false일 때 true
		boolean powerOn = false;
		if(!powerOn) { //또는 powerOn == false
			System.out.println("powerOn = " + powerOn);
		}
//	8. 문자형 참조변수 str이 "yes"일 때 true
		String str = "no";
		if(str.equals("yes")) { //또는 "yes".equals(str)
			System.out.println("str = " + str);
		}
		
	}
}
