package Java07_inherit.Quiz;

public class Point {
	protected int x;
	protected int y;
	
	public Point() {
		this(0,0); //기본값
	}
	public Point(int x, int y) {
		setX(x);
		setY(y);
		
	}
	//getter setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("x좌표 : "+ x+" , y좌표 : "+y);
	}
}
