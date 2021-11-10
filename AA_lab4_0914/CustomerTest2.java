package AA_lab4_0914;

public class CustomerTest2 { //메소드 오버라이딩, 동적바인딩이 적용

	public static void main(String[] args) {
		Customer customerLee= new Customer(10010,"이순신"); //일반고객
		customerLee.bonusPoint=1000;
		
		VipCustomer customerKim = new VipCustomer(10020,"김유신",12345);//vip
		customerKim.bonusPoint=10000;
		
		int price=10000; 
		
		System.out.println(customerLee.getCustomerName()+" 님이 지불 해야할 금액은 "+
				+ customerLee.calcPrice(price));
		System.out.println(customerKim.getCustomerName()+" 님이 지불 해야할 금액은 " +
				+ customerKim.calcPrice(price));	
		}
	//메소드 오버라이딩:상속관계에서 부모클래스의 메소드를 재정의
		//-오버로딩과 구분
	
	/*동적 바인딩 : 상속 관계에서 부모클래스와 자식클래스에서 동일한 메소드가
존재할 경우, 자식 클래스의 메소드로 바인딩이 된다.
*/
}
