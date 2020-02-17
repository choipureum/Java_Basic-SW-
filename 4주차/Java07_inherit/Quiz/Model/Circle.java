package Java07_inherit.Quiz;

public class Circle extends Point {
	private int radius;
		
	public Circle() {
		this(0,0,0);
	}
	public Circle(int x, int y, int radius) {
		super(x,y);
		setRadius(radius);		
		//center point로 취급
	}
	//getter setter
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.print("중심점 : ");
		super.draw();
		System.out.println("원 : ");
		System.out.println("원의 넓이 : "+Math.round((Math.PI*getRadius()*getRadius())*10)/10.0);
		System.out.println("원의 둘레 : "+Math.round((Math.PI*getRadius()*2)*10)/10.0);	
		System.out.println();
		//원의 x, y좌표, 면적과 둘레 계산 출력함
	}	
}
