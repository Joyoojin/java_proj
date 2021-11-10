package AA_lab4_0914.arrayList.Exercise;

public class Fruit {

	// 메소드 오버라이딩 사용,

	// Arraylist에 객체 저장 , 향상된 for 문 사용하여 과일 이름,색, 크기 출력

	String name; // 필드 ---
	String color;
	int size;

	Fruit() {// 생성자 1---
	}

	Fruit(String name, String color, int size) { // 생성자 2---
		this.name = name;
		this.color = color;
		this.size = size;

	}

	public void introduction() { // 메서드 (오버라이딩 적용할거
		System.out.println("과일입니다.");
	}

	public void showInfo() { // 메서드
		System.out.println(name + "의 색은" + color + " 이고 크기는" + size + "입니다.");
	}

}
