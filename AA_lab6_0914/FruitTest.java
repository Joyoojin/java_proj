package AA_lab6_0914;

import java.util.ArrayList;

//선생님 정답 따라적은 페이지
class Fruit { // 부모클래스
	String fruitName; // 변수의 초기값 할당 방법 1.생성자 2.setter 3.객체에서 변수값을 할당
	String color;
	int large;

	public Fruit() {
	}

	public Fruit(String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}

	// 오버라이드 할 메소드
	public String showInfo() { // return 메소드 사용하셨구나.
		return "과일의 내용을 출력합니다.";
	}
}

class Apple extends Fruit {
	public Apple(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}

	@Override // 메소드 오버라이드
	public String showInfo() {
		return "과일 이름은" + fruitName + "이고, 색깔은 " + color + "이고 크기는 " + large + "입니다";
	}

	public void app() {
		System.out.println("다운 캐스팅으로 사과를 출력합니다.");
	}
}

class Orange extends Fruit {
	public Orange(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}

	@Override // 메소드 오버라이드
	public String showInfo() {
		return "과일 이름은" + fruitName + "이고, 색깔은 " + color + "이고 크기는 " + large + "입니다";
	}

	public void ora() {
		System.out.println("다운 캐스팅으로 오렌지를 출력합니다.");
	}
}

class Banana extends Fruit {
	public Banana(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}

	@Override // 메소드 오버라이드
	public String showInfo() {
		return "과일 이름은" + fruitName + "이고, 색깔은 " + color + "이고 크기는 " + large + "입니다";
	}

	public void ban() {
		System.out.println("다운 캐스팅으로 바나나를 출력합니다.");
	}
}

public class FruitTest {

	public static void main(String[] args) {
		ArrayList<Fruit>fruitlist = new ArrayList<Fruit>();
		
		Fruit apple = new Apple("사과","빨간색",10); //업캐스팅
		Fruit orange = new Orange("오렌지","주황",20);
		Fruit banana = new Banana("바나나","노란색",30);
		
		fruitlist.add(apple);
		fruitlist.add(orange);
		fruitlist.add(banana);
		
		for(Fruit fruit : fruitlist) {
			System.out.println(fruit.showInfo());
		}


	
	//다운캐스팅으로 자식 메소드 출력하기 
		System.out.println("===다운캐스팅으로 자식 메소드 출력하기 ====");
/*
Apple a =(Apple) apple;
 		
 */
		//배열은 length로 썼는데 arraylist는 size로 함.
		
		for(int i=0; i<fruitlist.size(); i++) {
			Fruit fruit = fruitlist.get(i);
			
			if(fruit instanceof Apple) {
				Apple a =(Apple) fruit;
				a.app();
			}
			else if(fruit instanceof Orange) {
				Orange o =(Orange) fruit;
				o.ora();
			}	
			else if(fruit instanceof Banana) {
				Banana b =(Banana) fruit;
				b.ban();
			}
			else {
				System.out.println("지원되지 않는 타입입니다.");
			}
		}	
	
		
	}// main

}// class