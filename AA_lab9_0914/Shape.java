package AA_lab9_0914;
//상속과 다형성 pdf 69페이지
public class Shape { 	//슈퍼(부모) 클래스
	public Shape next;		//객체 선언. Shape는 객체형 데이터타입, next 는 인스턴스 변수
	public Shape() {next = null;}		//생성자
	
	public void draw() {				// 메소드
		System.out.println("Shape");
	}
}

class Line extends Shape{	//자식 클래스
	public void draw() {		//메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape{	//자식 클래스
	public void draw() {	//메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shape{	//자식 클래스
	public void draw() {	//메소드 오버라이딩
		System.out.println("Circle");
		
	}
}


