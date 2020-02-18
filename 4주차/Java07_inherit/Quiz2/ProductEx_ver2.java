
public class ProductEx_ver2 {
	public static void main(String[] args) {

		Person_ver2 p = new Person_ver2("Alice", 5000);
		
		p.sell();
		p.buy( new Tv("LG1", 1000) );
		p.buy( new Tv("SAMSUNG1", 700) );
		p.buy( new Computer("i5", 500) );
		p.buy( new Tv("SAMSUNG2", 800) );
		System.out.println("----------");
		p.sell();
		System.out.println("----------");
		p.sell();
		System.out.println("----------");
		p.sell();

		p.buy( new Computer("i5", 500) );
		p.buy( new Tv("SAMSUNG2", 800) );
		p.buy( new Tv("LG1", 1000) );
		p.buy( new Tv("SAMSUNG2", 800) );

		System.out.println("----------");
		p.sell();
		System.out.println("----------");
		p.sell();

	}
}





