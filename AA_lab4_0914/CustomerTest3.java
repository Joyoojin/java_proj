package AA_lab4_0914;

public class CustomerTest3 { //매개변수가 3개인 생성자호출

	public static void main(String[] args) {

		VipCustomer customerKim = new VipCustomer(10020, "김유신", 12345);
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

	} //main

} //class
