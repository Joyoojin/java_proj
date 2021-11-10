package AA_lab4_0914.arrayList.Exercise;

class Banana extends Fruit {

	Banana(String name, String color, int size) { // 생성자1
		super(name, color, size);

	}

	@Override
	public void introduction() { // 메서드 --- //메소드 오버라이딩
		System.out.println("바나나입니다");
	}

}
