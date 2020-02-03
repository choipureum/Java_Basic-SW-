package Java03_scanner;
import java.util.Scanner;

public class ScannerEx_04 {
	public static void main(String[] args) {
		//문자열 입력 처리 메소드
		//nextLine(), next();
		
		//ctrl+shift+o : import organize 임포트가 필요한것들을 자동으로 임포트해준다
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str1=sc.nextLine(); //공백포함 그 줄 저장//1 1 1 -> 1 1 1저장
		//개행문자(엔터키)를 기준으로 문자열 구분
		String str2=sc.next();// 공백 미포함 한단어저장 //1 1 1 -> 1만 저장
		//공백을 기준으로 문자열 구분
				
		System.out.println(str1);
		System.out.println(str2);
	}
}
// <공백문자, White Space Character>
//	-띄어쓰기(아스키코드 32)
//	-개행, 줄바꿈 ('\n')(아스키코드 10) 많이쓰는 방법이다
//	-탭, 수평탭('\t')(아스키코드 9)

// ** 개행은 운영체제에 따라 다르다 '\r' '\n' 을 사용하고 조합 방법이 달라진다
//  -'\r' : CR, Carraige Return
//  -'\n' : LF, Line Feed, New Line
//  -윈도우 : '\r''\n'으로 사용
//	-리눅스: '\n' 사용
//	-맥OS : '\r'이었는데 요즘은 '\n'
