package Java04_control.switchCase;

import java.util.Scanner;

public class SwitchQuiz_Menu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		- 메뉴 만들기
		//
//			===============================
//				M  e  n  u
//			===============================
//				1. Hello World 출력
//				2. 이름 출력
//				3. 성별 출력
//				4. 종료
//			===============================
		//
//			  >> _
		//
//			 -> 각 메뉴를 입력하면 메뉴에 알맞게 동작하도록 작성
		
		//이렇게 하면 case부분의 숫자에대해서 나중에 알아보기가 힘들다 이럴경우
		final int HELLO_MENU =1;
		final int NAME_MENU =2;
		final int GENDER_MENU =3;
		final int END_MENU =4;
		int menu=0;
		System.out.println("===============================");
		System.out.println("	M  e  n  u");
		System.out.println("===============================");
	
		String result ="";
		
		while(menu!=4) {
			System.out.print("메뉴를 입력하세요 : ");
			menu=sc.nextInt();
			System.out.println();
			switch(menu) {		
				case HELLO_MENU:
					result="Hello World";
					break;
				case NAME_MENU: //이렇게 할 수 있다 //상수를 이름을 지어두면 가독성이 올라간다!!!!
					result="최푸름";
					break;
				case GENDER_MENU:
					result="남자";
					break;
				case END_MENU:
					result="==============종료==============";
					break;
				default:
					result="1~4를 입력하세요";
			}			
		System.out.println(result);
		System.out.println("===============================");
		System.out.println();
	}
}
}
