package AA_lab10_upcasting;

public class Person { 			// 슈퍼 클래스
								// _________필드
	String name;
	String id;

	public Person(String name) { // __________생성자
		this.name = name;
	}

	public void fly() {
		System.out.println("하늘을 날아용");
	}
}
 