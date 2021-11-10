package AA_lab9_0914;
//상속과 다형성 ppt 73페이지 
public class MethodOverridingEx {

	static void paint(Shape p) { //매개변수 (Shape p)
		p.draw(); 				//업캐스팅 : =업캐스팅 메소드 A
	}
	static void paint_l (Line l) { //Line 클래스
		l.draw();
	} 
	static void paint_r (Rect r) {
		r.draw();
	}
	static void paint_c (Circle c) {
		c.draw();
	}
	
	public static void main(String[] args) {
		System.out.println("=====업캐스팅 메소드 A 이용해서 출력 ==========");
							
		Line line = new Line();  	//부모 Shape 객체가 먼저 만들어지고
									//자식 line 객체가 만들어짐.
		paint(line);			///중요///______업캐스팅______________
								/*line이라는 객체가 static void paint(Shape p)
								의 p에 들어가면서 Shape 라는 부모클래스로 데이터타입이
								업캐스팅됨.
								따라서, 원칙은 부모클래스의 변수,메소드만 접근가능하지만
								자식클래스에서 메소드를 오버라이드 해놨기 때문에
								예외적으로 오버라이드된 자식 메소드가 호출된다. 
								*/
		
		
		paint(new Shape()); 	//new Shape()이런식으로만 해도 객체가 생성되는건가?? 그렇다
		
		
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
		System.out.println("=======각자 자식 메소드 이용======");
		
		paint_l(new Line());
		paint_c(new Circle());
		
	}
/*
 * 	//객체 생성 후 적용 방법1___________
							Line line = new Line(); 
							paint(line);	 
							객체 생성 후 paint 에 던져줄수도 있고
							
	//방법2___________	  	paint(new Shape());  처럼
	    					new Shape() 객체를 생성하고
	    					static void paint(Shape p)에 넣어서
	    					Shape p = new Shape(); 이런 효과도 가능
 
 */
	
	
	/*출력결과		//메소드 오버라이딩을 통해 다양하게 다형성 출력 가능
Line
Shape
Line
Rect
Circle

	 */

}

