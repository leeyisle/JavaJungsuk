package ch06;

public class Ex22 {
	 /*
	 * (1) isNumber . 메서드를 작성하시오
	 * 주어진 문자열이 모두 숫자로만 이루어져 있는지 확인
	 * 모두 숫자면 true 반환, 아니면 false 반환
	 * 만일 주어진 문자열이 null이거나 빈문자열 "" 이면 false 반환 
	 */
	public static boolean isNumber(String str){

		if(str == null || str.equals("")) {
			return false;
		} 
	
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if( ch < '0' || ch > '9' ) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
	String str = "123";
	System.out.println(str+"는 숫자입니까 ? "+isNumber(str)); 
	str = "1234o";
	System.out.println(str+"는 숫자입니까 ? "+isNumber(str)); 
	}

}
