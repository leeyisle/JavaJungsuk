package ch07;

/*
 * 아래 세 개의 클래스로부터 공통부분을 뽑아 Unit이라는 클래스를 만들고 이 클래스를 상속받도록 코드 변경
 */

abstract class Unit {	//추상메서드가 있기때문에 추상클래스 
	int x, y; // 현재 위치

	Unit() {
	}

	abstract void move(int x, int y) ; //클래스마다 이동방법이 다르므로 추상메서드 정의

	void stop() {
		/* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
	int x, y; // 현재 위치

	void move(int x, int y) {
		/* 지정된 위치로 이동 */ }

	void stimPack() {
		/* 스팀팩을 사용한다. */}

}

class Tank extends Unit { // 탱크
	int x, y; // 현재 위치

	void move(int x, int y) {
		/* 지정된 위치로 이동 */ }

	void changeMode() {
		/* 공격모드를 변환한다. */}

}

class Dropship extends Unit { // 수송선
	int x, y; // 현재 위치

	void move(int x, int y) {
		/* 지정된 위치로 이동 */ }

	void load() {
		/* 선택된 대상을 태운다. */ }

	void unload() {
		/* 선택된 대상을 내린다. */ }
}
