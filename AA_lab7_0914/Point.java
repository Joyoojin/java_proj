package AA_lab7_0914;

public class Point {
	private int x,y; // 한 점을 구성하는 x, y 좌표
	public Point() {						//생성자
		this.x = this.y =0;
	}
	public Point(int x, int y) {			//매개변수있는 생성자
		this.x=x; this.y=y;
	}
	public void showPoint() {				//메서드
		System.out.println("("+x+","+y+")");
	}
} //클래스
