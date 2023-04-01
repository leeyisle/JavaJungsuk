package ch05;

public class Ex10 {
	public static void main(String[] args) {
//		알파벳과 숫자를 주어진 암호표로 암호화 하는 프로그램
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'};
						// 0   1   2   3   4   5   6   7   8   9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		//    문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
		
			char ch = src.charAt(i);
//		(1) . 알맞은 코드를 넣어 완성하시오
			if('a'<=ch&&ch<='z') {
				result += abcCode[ch-'a'];	//알파벳이나 숫자는 문자코드가 연속적으로 할당되어 있기 때문에 'c'에서 'a'를 배면 2를 결과로 얻는다(99-97)
			} else if('0'<=ch&&ch<='9') {
				result += numCode[ch-'0'];
			}
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}
}
