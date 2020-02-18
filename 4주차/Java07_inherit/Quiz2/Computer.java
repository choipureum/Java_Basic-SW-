package Java07_inherit.Quiz2;

public class Computer  extends Product{
		
	public Computer(String model, int price) {
		super(model,price);
	}
	
	@Override
		public void out() {			
			System.out.println("----Computer----");
			System.out.print("model : "+super.getModel()+", price : "+super.getPrice());
			System.out.println();
		}	
	
}
