package AA_lab5_0914;

public class B extends A {// B는 A의 자식

	public B(){							//생성자 1
		System.out.println("생성자 B");
		System.out.println("===============");
	}
	
	
	public B(int x) {				//매개변수 하나인 생성자 2
	//	super(); 가 생략되어 있음.
		System.out.println("매개변수 생성자 B "+x);
		System.out.println("=============================");
		/*출력 결과
		생성자 A
		매개변수 생성자 B 5
		
		*/
	}
	
	
	public B(int x, int y) {			//매개변수 두개인 생성자 3(--나야나)
		super(x); //부모클래스의 매개변수가 있는 생성자 호출
			 		 
		System.out.println("매개변수 생성자 B "+x+y);
			
	}
	/*출력 결과
	매개변수 생성자 A 5
	매개변수 생성자 B 56
	
	/만약, super(x);을 super();로 고치면???
	// 출력결과는 
 	생성자 A
	매개변수 생성자 B 56

	
	*/
	
}//class