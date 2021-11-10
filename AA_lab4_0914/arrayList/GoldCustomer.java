package AA_lab4_0914.arrayList;

public class GoldCustomer extends Customer{
	double saleRatio; // 물품 가격 할인 비율
	
	public GoldCustomer(int customerID, String customerName) {		//생성자
		super (customerID,customerName);		//부모 생성자2 호출.	
		
		customerGrade = "Gold";
		bonusRatio = 0.02;	//포인트적립율 2프로
		saleRatio = 0.05;	//가격할인율 5프로
	}
	@Override
	public int calcPrice (int price) {	
		bonusPoint += price * bonusRatio;	
		return price - (int)(price*saleRatio);
	}
}
