package Java04_control.switchCase;

public class Switch_04 {
	public static void main(String[] args)
	{		
		int num=30;
		
		if(num==10) {
			System.out.println("n은 10");
		}
		else if(num==20) {
			System.out.println("n은 20");
		}
		else if(num==30) {
			System.out.println("n은 30");
		}
		else {
			System.out.println("n은 다 아님");
		}
		System.out.println("-----------------------");
		
		//switch의 한계점
		int score =88;
		
		if(score>=90) {
			System.out.println("A");
		}
		else if(score>=80){
			System.out.println("B");
		}
		//범위비교는 switch로 안되기때문에 위와 같은 용도로는 사용 불가
		
		System.out.println("------------------------");
		
		switch(score/10) {
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
		}
		//이런식으로 바꿔서 표현은 가능
		
	}
}
