package Java07_inherit.Quiz;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	public Rectangle(){
		this(0,0,0,0);
	}
	public Rectangle(int x, int y, int width, int height){
		super(x,y);		
		setWidth(width);
		setHeight(height);
	}
	//getter, setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.print("좌측 중심점 : ");
		super.draw();
		System.out.println("사각형 : ");
		System.out.println("면적 : "+Math.round((getWidth()*getHeight())*10)/100.0);
		System.out.println("둘레 : "+Math.round((2*getWidth()*getHeight()))*10/10.0);
		System.out.println();
		
	}
	
}
