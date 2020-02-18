package Java07_inherit.Quiz2;

public class Person{
	private int money;
	private String name;
	private Product []prod =new Product[5] ;
	int sum;
	static int cnt=0;

	public Person(String name, int money) {
		for(int i=0;i<5;i++) {
			prod[i]=new Product();
		} //초기화
		setName(name);
		setMoney(money);
		System.out.println(name+"님이 "+money+"만원을 가지고 있습니다");
		System.out.println();
	}
	public void buy(Product p) {
		sum=this.money-p.getPrice();
		if(sum>=0) {
			prod[cnt]=new Product(p.getModel(),p.getPrice());
			prod[cnt].setModel(p.getModel());
			prod[cnt].setPrice(p.getPrice());							
			System.out.println(this.name+"님이 "+prod[cnt].getModel()+"을 구매하고 "+ prod[cnt].getPrice()+"만원을 사용한다");
			System.out.println("[잔액] : "+sum+"만원");
			setMoney(sum);
			cnt++;
		}
		else {			
			System.out.println("[ERROR] : 잔액이 부족합니다");
			}
		}
	
	public void sell() {
		if(cnt-1>=0&&prod[cnt-1].getPrice()!=-1) {// 이 배열에 물건이 들어가있을때
			sum=this.money+prod[cnt-1].getPrice();
			System.out.println(this.name+"님이 "+prod[cnt-1].getModel()+"을 팔고 "+ prod[cnt-1].getPrice()+"만원을 받았다");
			System.out.println("[잔액] : "+sum+"만원");
			prod[cnt-1]=new Product();
			cnt--;
			setMoney(sum);				
			}
			else {
				System.out.println("[ERROR] : 더이상 팔게 없습니다!");
		}
	}
	
	//getter setter
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
