package ch03;

public class Ex7 {
	public static void main(String[] args) {
//		화씨를 섭씨로 변환하는 코드 
//		변환공식 : C=5/9*(F-32)
//		변환값은 소수점 셋째자리에서 반올림, Math.round() 사용불가
		int fahrenheit = 100;
//		5/9가 0이기 때문에 두 피연산자 중 하나를 float이나 double로 해야 실수 결과를 얻을 수 있음
//		소수점 셋째자리에서 반올림하는 법
//		1. 값에 *100
//		2. 1의 값에 +0.5 (반올림)
//		3. 2의 결과를 int타입으로 변환
//		4. 3의 결과를 100f로 나눔 (100으로 나누면 소수점 아래 값 탈락)
		float celcius = (int)((5/9f * (fahrenheit-32))*100+0.5)/100f;
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);

	}
}
