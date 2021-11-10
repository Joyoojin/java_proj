package AA_lab4_0914.arrayList;
/*새로운 고객 등급이 필요한 경우
• 단골고객에 대한 혜택이 필요 함
• 우수 고객을 관리 하기 위해 다음과 같은 혜택을 줌
• 고객 등급 : VIP
• 제품 구매 할인율 :10%
• 보너스 포린트 : 5%
• 담당 전문 상담원 배정
*/

public class VipCustomer extends Customer { // 자식클래스
							//_________자식에게 추가된 필드
	private int agentID;	//vip 담당사원
	double saleRatio;		//물품 할인율, vip만 적용

	public VipCustomer() { // ___________자식 생성자1
	//	super(); 가 생략되어있음.컴파일러가 자동으로 넣음. 부모클래스의 생성자를 호출
		//반드시 첫 라인에 와야함. 
		customerGrade = "Vip";  //부모로부터 상속된 필드 재정의
		bonusRatio = 0.05;		//부모로부터 상속된 필드 재정의
		saleRatio = 0.1;
	//	System.out.println("VIP Customer() 생성자 호출");
	}
	public VipCustomer(int customerID,String customerName, int agentID) {  //_____생성자 2( 매개변수 3개
																	//부모클래스의 모든 필드를 가져올 필요는 없음.
		super(customerID, customerName); //부모 생성자를 호출
		customerGrade ="VIP";			//부모로부터 상속된 필드 재정의
		bonusRatio = 0.05;				//부모로부터 상속된 필드 재정의
		saleRatio = 0.1;				//자식 클래스 필드 정의
		this.agentID = agentID;			//자식 클래스 필드 정의
	//	System.out.println("VIP Customer(int, String) 생성자 호출");
	}
	@Override
	public int calcPrice(int price) {  //___________메소드
									//메소드 오버라이딩:상속관계에서 부모클래스의 메소드를 재정의
									/*동적 바인딩 : 상속 관계에서 부모클래스와 자식클래스에서 동일한 메소드가
							존재할 경우, 자식 클래스의 메소드로 바인딩이 된다.
							*/
		bonusPoint += price * bonusRatio; 	//보너스 포인트 적립
		return price - (int)(price*saleRatio); 	//vip 고객은 물품 가격할인
	}
	public int getAgentID() {  	  //_________메소드
		return agentID;
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo()+ "담당자는 " + agentID; 
	}
	
	
}// class
