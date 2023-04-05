package ch06;

public class Ex19 {
//	실행결과 예측
	public static void change(String str) {
		str += "456";
	}

//	public static String change(String str) {
//		str += "456";
//		return str;
//	}
	
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
//		str = change(str);
		
		System.out.println("After change:" + str); //문자열은 내용을 변경할 수 없기 때문에 덧셈 연산을 하면 새로운 문자열 생성됨
	}

}
