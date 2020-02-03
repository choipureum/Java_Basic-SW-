package Java03_scanner;

//패키지 임포트; 외부 패키지에 있는 클래스를 사용할 수 있도록 선언하는 코드;
import java.util.*; 

public class ScannerEx_01 {
	public static void main(String[] args) 
	{		
		int num; //변수 선언
		Scanner sc= //입력객체 변수선언
				new Scanner(System.in); // new + 클래스이름();
		System.out.print("문자열을 입력 :");
		String text=sc.nextLine(); //입력한 문자열을 처리하는 메소드(기능); 	
		System.out.println("입력한 문자열: " +text); 
	}
}
// <Scanner 클래스>
//	-키보드의 입력을 받아서 변수에 저장할 수 있도록 기능을 제공하는 클래스
//	-java.util 패키지
//	Tip!!--------------------
//콘솔은 사용하면 누적된다 -->스탑누르고 리무브해주는 관리 해줘야한다 -> No consoles~나오면 끝

// <Scanner의 주요기능>
//	-nextLine() : 문자열을 한줄을 입력받아 String타입으로 리턴한다(띄어쓰기 포함)
//  -next() : 문자열 한개를 String으로 반환(띄어쓰기 포함X)
//	-nextDouble()
//	-nextInt()
//	-nextBoolean();

//	-nextLong(); 잘 사용 X

// **char를 처리하는 전용 기능(메소드)는 없다
//    -->nextLine()을 이용하여
