package AA_lab4_0914.arrayList.Exercise;

import java.util.ArrayList;


class FruitTest {//Arraylist에 객체 저장 
				//향상된 for 문 사용하여 과일 이름,색, 크기 출력

	// 업캐스팅

	public static void main(String[] args) {
		ArrayList<Fruit> fruitlist = new ArrayList<Fruit>();
		
		Fruit apple = new Apple("사과","빨간색",4);
		Fruit orange = new Orange("오렌지","주황",7);
		Fruit banana = new Banana("바나나","노란색",10);
		
		fruitlist.add(apple);
		fruitlist.add(orange);
		fruitlist.add(banana);
		
		
		System.out.println("==과일정보 출력 ==");
		
		for(Fruit fruit : fruitlist) {
			fruit.introduction();	//오버라이드 된 자식 출력
			fruit.showInfo();		
		}
	}
}
	