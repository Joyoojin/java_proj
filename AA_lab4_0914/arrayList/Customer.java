package AA_lab4_0914.arrayList;
	//do it 자바 프로그래밍 입문 
public class Customer { //부모 클래스. 고객정보

	protected int customerID;			//-----필드-----
	protected String customerName;		//private는 상속되지 못해서 protected로 적용
	protected String customerGrade; //고객의 등급(vip, gold, silver..)
	int bonusPoint;
	double bonusRatio;				//포인트적립율
	
	public Customer() {				//-----생성자 1-----
	initCustomer();			
	
	//System.out.println("Customer()생성자 호출");
	}

	public Customer(int customerID,String customerName) { //-----생성자2-----
	this.customerID = customerID;
	this.customerName = customerName;
	initCustomer();	
	//System.out.println("Customer(int, String)생성자 호출");
	}
	
	
	private void initCustomer() {	//고객등급을 초기화하는 메서드
		customerGrade = "SILVER";
		bonusRatio = 0.01;		
	}
	
	public int calcPrice(int price) {			//_______메소드_______
		bonusPoint += price * bonusRatio;		//구매한 물건에 대한 보너스 포인트 적립.
		return price;							//일반고객은 가격할인 없음.
	}
	
	public String showCustomerInfo() {			//_______메소드_______
		return customerName + "님의 등급은 "+ customerGrade+ "이며, 보너스 포인트는 "+ bonusPoint +"입니다."; 
	}
	
	
	
	public int getCustomerID() {		//customerID,customerName,customerGrade --->>getter setter 적용
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
		}
	
	
}//class
