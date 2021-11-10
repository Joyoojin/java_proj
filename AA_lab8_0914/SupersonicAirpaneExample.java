package AA_lab8_0914;

public class SupersonicAirpaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa= new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();			//일반비행합니다 	
		sa.flyMode = SupersonicAirplane.SUPERSONIC;	//클래스 이름으로 호출(static) //클래스이름.상수변수
		sa.fly();			//초음속비행합니다
		sa.flyMode = SupersonicAirplane.NORMAL;		//클래스 이름으로 호출(static) 
		sa.fly();			//일반비행합니다
		sa.land();
	}
}
