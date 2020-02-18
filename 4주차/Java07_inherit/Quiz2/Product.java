package Java07_inherit.Quiz2;

public class Product {
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
	public void out() {
		
	}
	
}
