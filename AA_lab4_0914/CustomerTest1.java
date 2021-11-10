package AA_lab4_0914;

public class CustomerTest1 { //기본 생성자 호출, setter을 통해서 값을 넣고 출력

	public static void main(String[] args) {
		Customer customerLee = new Customer(); 	// 객체 생성
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
	
		
		VipCustomer customerKim = new VipCustomer();
		customerKim.setCustomerID(10020); 	//부모클래스의 메소드
		customerKim.setCustomerName("김유신");//부모클래스의 메소드
		customerKim.bonusPoint = 10000;		//부모클래스의 메소드
		System.out.println(customerKim.showCustomerInfo());

	
	}
}
