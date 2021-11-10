package AA_lab6_0914;

public class A { 		//기본 생성자를 명시하지 않아서 오류가 나는 사례
	
	
	public A() {			//기본 생성자 // 처음에 이 부분을 지웠다고 가정
		}					//생략될경우 자식 클래스에서 생략된 super();가
							//불렀을때 오류 발생 가능
							
	
	public A (int x) {			//매개변수가 있는 생성자
		System.out.println(" 매개변수 생성자 A "+ x);
		
	}

	
}//class
