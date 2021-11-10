package AA_lab10_upcasting;

public class UpCastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동"); 
		
		//업캐스팅		
		p =s; 
		// 위의 세줄이 Person p = new Student(); 과 같은 의미
				//p는 업캐스팅 됨.
		
		 
		
		System.out.println(p.name); 	//홍길동 출력

	//	s.	찍으면 알수있듯이 s는 자식인스턴스라서 부모,자식 클래스의 모든 필드와 메소드에 접근가능
		
	//  p.  찍으면 알수있듯이 p는 부모인스턴스라서 부모 클래스의 필드,메소드에만 접근가능
		//단, 메소드 오버라이딩 된 메소드에 접근했을 때, 동적바인딩에 의해서
		// 자식의 메소드를 호출
		//프로그램 할 때 업캐스팅, 동적바인딩 많이 씀!!
		
		
	//	p.grade = "A"; 			[x] 업캐스팅 해서 오류. 자식 변수 쓰지 못해
	//	p.department = "Com"; 	[x] 업캐스팅 해서 오류. 자식 변수 쓰지 못해
	
		
		
					//업캐스팅 -------------
		p.fly();  //비행기를 타고 날아용 - Student 가 출력됨.
				 //부모 클래스의 fly 메소드가 아니라
				//동적 바인딩 적용해서 자식 클래스의 fly 메소드가 출력됨.

	}
}
