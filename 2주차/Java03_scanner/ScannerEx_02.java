package Java03_scanner;

import java.util.*;

public class ScannerEx_02 {
	public static void main(String[] args) 
	{
		//int형 입력받고 출력하기
		Scanner sc=new Scanner(System.in);
//		import가 없이 한다면
//		java.util.Scanner sc = new java.util.Scanner(System.in);으로 가능하지만 불편하기 때문에 임포트한다
//		^--실제로는 사용X
		System.out.print("정수 입력하세요 : ");
		int num=sc.nextInt();
		System.out.println("입력된 정수 : "+num);
		
	}
}

// 1. 입력객체 변수 선언
// 2. 입력객체 생성(new 연산자 이용)
// 3. int형 데이터 입력받기
// 4. 입력받은 int데이터 출력

// Tip!!----------------------
// ctrl+F7 => 원하는 창으로 이동 (에디터 ->콘솔등)
