package Java06_class.constructor;

public class Car {
	private String model;
	private String color;
	
	public Car(String model, String color){
		this.model =model;
		this.color =color;
	}
	public void display() {
		System.out.println("모델명 : "+model +", 색 : "+ this.color);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
//---------------
//class Car
//---------------
//- model : String
//- String color
//---------------
//<<constructor>>
//+ Car(String,String)
//
//<<method>>
//+ display() : void
//
//<<setter>>
//+ setModel(String model) : void
//+ setColor(String color) : void
//
//<<getter>>
//+ getModel() : String
//+ getColor() : String
//---------------
