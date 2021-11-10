package AA_lab8_0914;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL =1; 
	public static final int SUPERSONIC =2;
	
	public int flyMode = NORMAL;
	
	
	@Override	//어노테이션, @Override : 메소드 재정의 할때 오류 방지 위해사용
				//메소드 재정의(오버라이딩): 부모클래스의 데이터타입, 매개변수 갯수, 순서가 같아야 함
	
	
	public void fly(){
		if(flyMode ==SUPERSONIC) {
			System.out.println("초음속비행합니다");
		}else {
			//Airplane 객체의 fly()메소드 호출
			super.fly();
		}
		
	}
}

