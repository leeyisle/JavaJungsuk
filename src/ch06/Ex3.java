package ch06;

public class Ex3 {
	public static void main(String[] args) {
//		Ex3, Ex4 사용
		/*
		Student s = new Student();
		s.name = "홍길동"; 
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름 :"+s.name); 
		System.out.println("총점 :"+s.getTotal()); 
		System.out.println("평균 :"+s.getAverage());
		*/
//		실행결과 홍길동,1,1,100,60,76,236,78.7
		Student s = new Student("홍길동",1,1,100,60,76); 
		
		System.out.println(s.info());
		
	}
}
//Ex3. Student클래스 정의
class Student {
	String name; //학생 이름
	int ban; //반
	int no; //번호
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	
//	Ex4. Ex3에서 정의한 Student 클래스에 getTotal(), getAverage() 메서드 추가
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return (int)(getTotal()/3f*10+0.5f)/10f;
	}
	
//	Ex5. Student클래스에 생성자와 info() 추가
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
}
