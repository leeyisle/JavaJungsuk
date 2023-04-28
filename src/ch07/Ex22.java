package ch07;

/*[7-22]
 * 도형을 정의한 Shape 클래스를 조상으로하는 Circle클래스와 Rectangle클래스 작성
 * 생성자도 각 클래스에 맞게 적절히 추가
 * 1. Circle
 * 조상클래스 : Shape
 * 멤버변수 : double r(반지름)
 * 2. Rectangle 
 * 조상클래스 : Shape
 * 멤버변수 :double width(폭), double height(높이)
 * 메서드 : isSquare
 * 	기능 : 정사각형인지 아닌지 알려준다
 * 	반환타입 : boolean
 * 
 * [7-23]
 * sumArea 메서드 작성
 * 기능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환
 * 반환타입 : double
 * 매개변수 : Shape[] arr
 */
class Ex22 {
	/*[7-23]
	 * (1) sumArea . 메서드를 작성하시오
	 */
	static double sumArea(Shape[] arr) {
		double sum = 0;
		
		for(Shape a : arr) {
			sum += a.calcArea();
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합 :" + sumArea(arr));
	}
}

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

class Circle extends Shape {
	double r;
	
	Circle(double r){
		this(new Point(0,0), r); //Circle(Point p, double r)호출
	}
	
	Circle(Point p, double r){
		super(p);
		this.r = r;
	}
	
	double calcArea() {
		return Math.PI * r * r;
	}
}

class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(double width, double height){
		this(new Point(0,0), width, height);
	}
	
	Rectangle(Point p, double width, double height){
		super(p); //조상의 멤버는 조상의 생성자가 초기화하도록 한다.
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() {
		return width*height!=0 && width==height;
	}
	
	double calcArea() {
		return width * height;
	}

}