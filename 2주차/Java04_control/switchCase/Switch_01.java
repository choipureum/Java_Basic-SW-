package Java04_control.switchCase;

public class Switch_01 {
	public static void main(String[] args) {
			//switch문
			//선택문
			//switch-case문
			
//			switch(비교대상) {  <--특정 변수
//				case 값1:		<--변수의 값
//				case 값2:		
//              default: 가능
//			} --case는 여러개 가능
			int num=10;
			
			switch(num) {
				case 0:
					System.out.println("0입니다");
					break;
				case 10:
					System.out.println("10입니다");
					break;
				case 20:
					System.out.println("20입니다");
					break;
				case 30:
					System.out.println("30입니다");
					break;
				default :
					System.out.println("아무것도 아닙니당");				
			}
			//break를 하지않으면 특정 실행코드 밑으로 전부수행한다.
			//위의 코드는 case10:으로 찾아가서 그 밑 전부실행
			//break를 해줘야 탈출 가능
			//case에 지정한 값이 없으면 default로 간다
			//default는 case들 중에서 가장 마지막에 작성한다
			
	}
}
