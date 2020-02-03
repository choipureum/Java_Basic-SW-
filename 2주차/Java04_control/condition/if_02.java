package Java04_control.condition;

public class if_02 {
	public static void main(String[] args) {
		int num=10;
		if(num==10) {
			System.out.println("참!");
		}
		else {
			System.out.println("거짓!");
		}
		//중괄호-> 코드를 묶어주는 역할을 한다
		//--------------------------------------------------------------------
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
			//세줄 모두 tab하고 싶으면 전부 드래그하고 tab키 클릭
		}
		//--------------------------------------------------------------------
		if(false) System.out.println("if문"); //중괄호가 없으면 하나만 if문으로 처리
		System.out.println("if문밖"); //정상적으로 동작은 되나 가독성이 떨어진다 // 중괄호는 꼭 해주기!
		
		if(true) {
			System.out.println();
			System.out.println();
			System.out.println();
		}
		//중괄호로 3개모두 if문안에서 동작하도록 설정
		//--------------------------------------------------------------------
		
		if(false) ; { //(flase) ;세미콜론으로 종료했으므로 뒤는 if문의 영향을 받지 않는다 조심!
			System.out.println("HI");
			System.out.println("Hello");
			System.out.println("Hola"); //;(세미콜론)때문에 정상출력이 되버림
		}
	}
}
