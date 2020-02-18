package Java07_inherit.Quiz2;

//추상클래스(설계도 역할)이지만 건물은 못짓는다
//Product p = new Product(); 이런 객체생성 할수 없다
public abstract class Product {
	private String model;
	private int price;
	
	public Product() {
		setModel("-1");
		setPrice(-1);
	}
	public Product(String model, int price) {
		setModel(model);
		setPrice(price);
	}
	
	public  String getModel() {
		return model;
	}
	public  void setModel(String model) {
		this.model = model;
	}
	public  int getPrice() {
		return price;
	}
	public  void setPrice(int price) {
		this.price = price;
	}
	//추상메소드(추상메소드는 일반클래스에서 사용할 수 없다)
	public abstract void out(); //추상화하다(오버라이드해야한다)근데 몸체에서는 할게없다(추상메소드)
	
}
