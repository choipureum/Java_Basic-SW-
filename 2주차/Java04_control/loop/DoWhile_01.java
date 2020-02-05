package Java04_control.loop;

public class DoWhile_01 {
	public static void main(String[] args) {
//		<do-while 루프>
//		do{  } //반복 수행코드
//		while(조건식);
//		우선 반복수행->최초 1회 반복코드 수행을 무조건 한다 ->나중에 조건식 검사
		
		do {
			System.out.println("실행될까?");
		}while(false);
		//처음 두 키워드를 만난 후 조건 검사 없이 반복코드를 수행한다
		//그 이후 조건검사를 통해 반복 진행 여부 결정

		//--------------------------------------------------
//		do {
//			메뉴보여주기
//			메뉴선택하기
//			종료메뉴를 선택하지 않으면 반복
//		}while(종료메뉴를 선택하지 않는다면 반복);
		
		//--------------------------------------------------
		
		int i=0; //초기식
		while(i<5) {
			System.out.println(i);
			i++;
		}
		System.out.println("--------------------");
		
		int j=0;
		do {
			
			System.out.println(j);
			j++;
		}while(j<5);
		//do-while은 잘 사용하지 않는다
	}
}
