package Java07_inherit.Quiz2;

public class ProductEx {
	public static void main(String[] args) {
		System.out.println("---상속 전 테스트-----------------");
		Computer c1 = new Computer("i7", 1000);
		c1.out();
		
		Tv t1 = new Tv("Canvas", 800);
		t1.out();
		
		
		System.out.println();
		System.out.println("---상속 후 테스트-----------------");
		Product p1 = new Computer("i5", 700);
		p1.out();
		
		Product p2 = new Tv("LG", 500);
		p2.out();
		
		
		System.out.println();
		System.out.println("---Product 배열 테스트------------");
		Product[] products = new Product[5];
		int count = 0;
		
		products[count++] = new Computer("com1", 100);
		products[count++] = new Tv("tv1", 200);
		products[count++] = new Tv("tv2", 300);
		
		for(int i=0; i<count; i++)
			products[i].out();
		
		System.out.println();
		System.out.println(count+"개 물건 구입");
		
		
		System.out.println("-------Person------------");
		Person p = new Person("Alice", 1000);
		
		Product prod1 = new Tv("LG", 500);
		Product prod2 = new Computer("i5", 500);
		Product prod3 = new Tv("SAMSUNG", 700);
		Product prod4 = new Tv("APPLE", 800);
		
		p.buy(prod1);
		p.buy(prod2);
		p.sell();
		p.sell();
		p.buy(prod3);
		p.buy(prod4);
		p.sell();
		p.sell();
	
		
		System.out.println("------추상화클래스 Product------");
//		Product p = new Product("data",123); //추상화 클래스라서 에러발생(객체 생성 불가)
		Product p0; //추상클래스여도 객체 변수는 선언가능
		p0=new Tv("d1",123); //몸체는 받을 수 있다
	}
}


