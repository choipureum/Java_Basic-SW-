package Java03_scanner;
import java.util.*;

public class ScannerEx_03 {
	public static void main(String[] args) {	
		//문자열
		String str= "Apple";
		String str2 = new String("Banans"); //원래는 이렇게 써줘야한다(참조형이기 때문에)
		//java.lang 패키지
		// 자바 프로그램에 필요한 기본적인 클래스를 모아 놓은 패키지
		// 기본적으로 import하지 않아도 사용할 수 있다(대표적으로 String class)
		System.out.println(str.charAt(2));
		//charAt(int index) : index의 위치에 있는 값 반환
		
		//Scanner로 단일 문자 받기
	    Scanner sc=new Scanner(System.in);
	    String inputData= sc.nextLine();
	    char temp = inputData.charAt(0);
	    // == String inputData = sc.nextLine().charAt(0);
	    System.out.println("0번째 단일문자: "+temp); 
	    
	    //----------------------------------------------------
	    //이 방법은 가급적 사용하지 마라
	    System.out.println("성별입력: ");
	    System.out.println("입력한 성별: "+ sc.nextLine().charAt(0)); //이것도 가능, 하지만 추천 X		
}
}
