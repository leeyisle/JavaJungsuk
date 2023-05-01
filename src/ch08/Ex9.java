package ch08;
/*
예외 클래스 작성하고 테스트
클래스명 : UnsupportedFuctionException
조상 클래스 : RuntimeException

멤버변수
이 름 : ERR_CODE
저장값 : 에러코드
타 입 : int
기본값 : 100
제어자 : final private

메서드 : 
1.메서드명 : getErrorCode 
기 능 : 에러코드(ERR_CODE) 를 반환한다
반환타입 : int
매개변수 : 없음
제어자 : public

2.메서드명 : getMessage 
기 능 : 메세지의 내용을 반환한다 (Exception클래스의 getMessage() 를 오버라이딩)
반환타입 : String
매개변수 : 없음
제어자 : public
*/
public class Ex9 {
	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException(" 지원하지 않는 기능입니다.", 100);
	}

}

class UnsupportedFuctionException extends RuntimeException {
	final private int ERR_CODE;
	
	UnsupportedFuctionException(String msg, int code) {
		super(msg);
		ERR_CODE = code;
	}
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}
