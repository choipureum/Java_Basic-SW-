package Java07_inherit.Quiz2;

public class Tv extends Product{
		
	public Tv(String model,int price) {
		super(model,price);
	}
	@Override
	public void out() {			
		System.out.println("----Tv----");
		System.out.print("model : "+super.getModel()+", price : "+super.getPrice());
		System.out.println();
	}	
	
}
