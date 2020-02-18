package java07_inherit.person;

import java.util.Scanner;

import java07_inherit.product.Product;

public class Person_ver2 {
	private static final int LEN = 3;
	
	private String name;
	private int money;
	
	private Product[] prod = new Product[LEN];
	
	private int cnt; //구매한 물건 개수
	
	
	public Person_ver2(String name, int money) {
		this.name = name;
		this.money = money;
	}

	
	public void buy(Product prod) {
		if( money < prod.getPrice() ) {
			System.out.println("[ERROR] 잔액이 부족합니다");
			return;
		}

		if( cnt == LEN ) {
			System.out.println("[ERROR] 더 이상 물건을 구매할 수 없습니다");
			return;
		}
		
		
		
		//전달인자로 받은 Product를 멤버필드에 저장하고
		this.prod[cnt++] = prod;
		//물건가격만큼 money를 차감한다
		money -= prod.getPrice();
		
		//진행상황을 출력한다
		System.out.println(
			name + "님이 " + prod.getPrice() + "원을 "
			+ "지불하고 " + prod.getModel() + " 구매함");
		System.out.println("[잔액] " + money);
		
//		ex)
//		Alice님이 500원을 지불하고 i5 구매함
//		[잔액] 0원
	}

	public void sell() {
//		sell_v1(); //마지막 물건 판매
//		sell_v2(); //처음 물건 판매
		sell_v3(); //선택한 물건 판매
	}
	

	
	//마지막으로 구매한 물건을 판매
	public void sell_v1() {
		if( cnt==0 ) {
			System.out.println("[ERROR] 판매할 물건이 없습니다");
			return;
		}

		//판매한 물건값 받기
		money += this.prod[cnt-1].getPrice();

		//진행상황 출력
		System.out.println(
				name + "님이 " + prod[cnt-1].getPrice() + "원을 "
				+ "받고 " + prod[cnt-1].getModel() + " 판매함");
		System.out.println("[잔액] " + money);
		
		//물건 판매 (객체 제거)
		this.prod[--cnt] = null;
	}

	
	
	//처음으로 구매한 물건을 판매
	public void sell_v2() {
		if( cnt==0 ) {
			System.out.println("[ERROR] 판매할 물건이 없습니다");
			return;
		}
		
		//판매한 물건값 받기
		money += this.prod[0].getPrice();

		//진행상황 출력
		System.out.println(
				name + "님이 " + prod[0].getPrice() + "원을 "
				+ "받고 " + prod[0].getModel() + " 판매함");
		System.out.println("[잔액] " + money);
		
		//물건 판매 (객체 제거)
		for(int i=0; i<cnt-1; i++) {
			prod[i] = prod[i+1];
		}
		prod[cnt-1] = null;
		
		cnt--; //물건 개수 1 감소
	}

	
	
	//선택한 물건을 판매
	public void sell_v3() {
		if( cnt==0 ) {
			System.out.println("[ERROR] 판매할 물건이 없습니다");
			return;
		}
		
		Scanner in = new Scanner(System.in);

		System.out.println("현재 구매한 물건 수 : " + cnt);
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1) + ". " + prod[i].getModel());
		}
		System.out.print("몇번째 구매한 물건을 판매하시겠습니까? ");
		int idx = in.nextInt();
		
		if( idx > cnt || idx <= 0 ) {
			System.out.println("[ERROR] 구매하신 이력이 없습니다");
			return;
		}
		
		
		
		//판매한 물건값 받기
		money += this.prod[idx-1].getPrice();

		//진행상황 출력
		System.out.println(
				name + "님이 " + prod[idx-1].getPrice() + "원을 "
				+ "받고 " + prod[idx-1].getModel() + " 판매함");
		System.out.println("[잔액] " + money);
		
		//물건 판매 (객체 제거)
		for(int i=idx-1; i<cnt-1; i++) {
			prod[i] = prod[i+1];
		}
		prod[cnt-1] = null;
		
		cnt--; //물건 개수 1 감소
	}

	public void out() {
		System.out.println("[TEST] CNT : " + cnt);
		System.out.print("[TEST] ");
		for( Product p : prod ) {
			if(p == null)	System.out.print(p + " ");
			else	System.out.print(p.getModel() + " ");
		}
		System.out.println();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}








