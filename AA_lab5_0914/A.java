package AA_lab5_0914;
//상속과 다형성  ppt 53 페이지 그림 참고
public class A { 	//super(); : 부모클래스의 생성자를 호출
	
	public A() {						//생성자 1
		System.out.println("생성자 A");
	}
	
	public A(int x) {					//매개변수 하나인 생성자2
		System.out.println("매개변수 생성자 A "+ x);
		
	}
}//class
