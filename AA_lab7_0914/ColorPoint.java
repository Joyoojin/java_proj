package AA_lab7_0914;
 	//상속과 다형성 ppt 54페이지
public class ColorPoint extends Point {// 나는 자식클래스
							//___________필드________
	private String color; // 점의 색
	
	public ColorPoint(int x, int y, String color) { //____생성자____
		super(x,y); 	//Point 의 생성자 (x,y)호출
						//이걸 super();로 바꾸거나 생략하면
						//출력 결과는 blue(0,0)으로 바뀌어 버림.

		this.color = color; 
	}
	public void showColorPoint() {		//_____메소드___________
		System.out.println(color); 
		showPoint(); 		//Point 클래스의 메서드 호출
	}
	
}
