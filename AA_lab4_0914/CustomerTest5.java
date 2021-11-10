package AA_lab4_0914;

public class CustomerTest5 {

	public static void main(String[] args) {
		int price= 10000;
		Customer customerLee = new Customer(100100, "이순신");
		System.out.println(customerLee.getCustomerGrade()+" 님이 지불해야할 금액은 "
				+customerLee.calcPrice(price));	//10000출력
	

		VipCustomer customerKim = new VipCustomer(100200, "김유신",12345);
		System.out.println(customerKim.getCustomerGrade()+" 님이 지불해야할 금액은 "
				+customerKim.calcPrice(price)); //9000출력
		
		
		//업캐스팅 : 자식 객체를 생성해서 부모 객체의 타입으로 형식을 변환
		// 부모객체의 필드나 메소드만 사용
		// 단, 메소드 오버라이딩이 있을 경우 동적바인딩에 의해 자식 객체의 메소드 호출
		Customer vc = new VipCustomer(100300, "홍길동",2000); 	//부모 객체 타입으로 형식 변환
		System.out.println(vc.getCustomerGrade()+" 님이 지불해야할 금액은 "
				+vc.calcPrice(price)); //9000출력
		
		// vc는 Vip자식클래스의 필드,메서드 사용이불가
		
		

	}//main
}//class


