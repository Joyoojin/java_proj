package AA_lab5_0914;

public class ConstructorEx4 {

	public static void main(String[] args) {

		
		B b;  	// 객체 변수를 선언 (B: 객체형 데이터 타입. b는 인스턴스 변수)
		b = new B(5);	//매개 변수 하나가 있는 생성자 호출.
						//매개 변수에 5을 넣음.
		/*출력 결과
		생성자 A
		매개변수 생성자 B 5
		*/
		
		
		
		B c;
		c = new B(5,6); // 매개변수가 2개인 생성자(나야나) 호출
		/*출력 결과
		매개변수 생성자 A 5
		매개변수 생성자 B 56
		*/
		
		
		
		B d = new B(); //
		/*출력 결과
		생성자 A
		생성자 B
		*/
		
	}//main

}//class
