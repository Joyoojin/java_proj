package AA_lab4_0914.arrayList.Exercise;

public class Apple extends Fruit {

	Apple(String name, String color, int size) { // 생성자1
		super(name, color, size);
	}

	@Override
	public void introduction() { // 메서드 --- //메소드 오버라이딩
		System.out.println("사과입니다");
	}

}
