package AA_lab4_0914;

public class CustomerTest4 {
	//업캐스팅 : 자식 객체를 생성해서 부모 객체의 타입으로 형식을 변환. 
	// 부모 객체의 필드나 메소드만 사용가능
	//단, 메소드 오버라이딩이 있을경우 동적 바인딩에 의해 자식객체의 메소드를 호출
	

	public static void main(String[] args) {
		Customer vc = new VipCustomer(10030,"홍길동",2000);
		//데이터타입을 부모로 하는 것을 업캐스팅이라고 함.
		
		
		vc.bonusPoint=1000;
		
		System.out.println(vc.getCustomerName()+" 님이 지불해야할 금액은"+
		vc.calcPrice(10000));
		
	}

}
