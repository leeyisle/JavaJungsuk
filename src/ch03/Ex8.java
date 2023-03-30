package ch03;

public class Ex8 {
	public static void main(String[] args) {
		//코드의 문제점 수정해서 결과 얻기
		byte a = 10;
		byte b = 20;
		//byte c = a + b;
//		이항연산은 피연산자의 타입을 일치시킨 후 연산을 수행함
//		int보다 작은 타입은 int로 자동변환함
		//int c = a + b;
		byte c = (byte) (a + b);
		
		char ch = 'A';
		//ch = ch + 2;
		ch = (char)(ch + 2);
		
		//float f = 3 / 2;
		float f = 3 / 2f;
		//long l = 3000 * 3000 * 3000;
//		int*int*int의 결과는 int 이므로 피연산자 중 적어도 한 값은 long 타입이어야 함
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d==f2;
		
		System.out.println("c="+c);				//30
		System.out.println("ch="+ch);			//C
		System.out.println("f="+f);				//1.5
		System.out.println("l="+l);				//27000000000
		System.out.println("result="+result);	//true

	}
}
