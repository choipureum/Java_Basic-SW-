package Java04_control.switchCase;

public class Switch_02 {
	public static void main(String[] args) {
		int num=20;
		
		switch(num-5) {
			case 10:
				System.out.println("1번 영역");
				break;
			case 15:
				System.out.println("2번 영역");
				break;
			case 20:
				System.out.println("2번 영역");
				break;
		}
		//가능
		//안의 수가 true/false로 나오면 표현할 수 없다.
		//안의 비교대상이 정수여야한다
		//
		//그래도 변수자체를 쓰는경우가 많다
	}
}
