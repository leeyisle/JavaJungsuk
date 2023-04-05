package ch06;

public class Ex24 {
	/*
	 * (1) abs . 메서드를 작성하시오
	 * 주어진 값의 절대값 반환
	 * 반환타입 int, 매개변수 int value
	 */
	public static int abs(int value) {
		
		if(value < 0) {
			return -value;
		}else 
			return value;
		
//		삼항연산자를 이용해 간결한 코드 가능 
//		return value >= 0 ? value : -value;
	}
	public static void main(String[] args)
	{
	int value = 5;
	System.out.println(value+"의 절대값 :"+abs(value)); 
	value = -10;
	System.out.println(value+"의 절대값 :"+abs(value)); 
	}

}
