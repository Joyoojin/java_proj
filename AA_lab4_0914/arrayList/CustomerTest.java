package AA_lab4_0914.arrayList;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerlist = new ArrayList<Customer>();

		Customer customerLee = new Customer(10010, "이순신"); //일반고객
		Customer customerShin = new Customer(10020, "신사임당"); 
		
		Customer customerHong = new GoldCustomer(10030, "홍길동"); //Gold등급 고객이나, customer 데이터타입으로 업캐스팅되어있음
		Customer customerYul = new GoldCustomer(10040, "이율곡"); //업캐스팅 한 이유는 ArrayList안에 저장하기위해
																//ArrayList가 Customer 데이터타입만 저장하게 되어있으므로
		
																//업캐스팅 하지 않아도
																//ArrayList 안에 들어갈 때 자동 데이터타입변환되긴 함.
		
		Customer customerKim = new VipCustomer(10050, "김유신",12345); //Vip 고객이나 customer 데이터타입으로 업캐스팅됨.

		
			//사실 , 여기에 바로 넣어줘도 자동 업캐스팅 됨.
		
		customerlist.add(customerLee); //배열 0번쨰 index0
		customerlist.add(customerShin); //index1
		customerlist.add(customerHong); //index2
		customerlist.add(customerYul); //index3
		customerlist.add(customerKim);//index4
		
		
		System.out.println("===========고객정보 출력==============");
		
		for(Customer customer : customerlist) {
			System.out.println(customer.showCustomerInfo()); //customerlist를 출력하면 주소값만 나옴.
		}
		System.out.println("========보너스포인트와 할인율 계산 ==========");
		int price =10000;
		
		for(Customer customer : customerlist) {
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName()+"님이 "+cost +"원 지불하셨습니다.");
		
			System.out.println(customer.getCustomerName()+"님의 현재 포인트는 "+customer.bonusPoint +"입니다.");
		}
		
		Customer c = customerlist.get(4); //arraylist 안의 index4번 방을 가져와라
		System.out.println(c.showCustomerInfo()); 
		//출력결과 김유신님의 등급은 VIP이며, 보너스 포인트는 500입니다.담당자는 12345

	}//main

}//class
