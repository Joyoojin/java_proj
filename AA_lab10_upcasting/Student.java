package AA_lab10_upcasting;

public class Student extends Person {
	String grade;
	String department;
	
	public Student(String name) {
		super(name); 		//부모의 생성자 호출
		
	}
	
	@Override			//메소드 오버라이드
						//어노테이션 키를 넣지 않으면 메소드 오버라이드가 정확하게
						//되지 않고 void 타입이 int 이런식으로 바뀌어도 오류 못잡아냄	
	public void fly() {			//부모클래스와 데이터타입 같게 해야함, void 면 void 똑같이	
		System.out.println("비행기를 타고 날아용 - Student");
	}
}
 