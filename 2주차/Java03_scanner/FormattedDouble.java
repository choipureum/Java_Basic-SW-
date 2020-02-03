package Java03_scanner;
import java.util.*;

public class FormattedDouble {
	public static void main(String[] args) {
		//double형 데이터를 서식화하여 출력하기
		// ->소수점 둘째자리까지 출력하기
		double avg=52.56789;
		
		//1. String.format()메소드 활용하기
		System.out.println(Double.parseDouble((String.format("%.2f", avg)))); //둘째자리까지표현, 반올림해줌
		//double로 변환 Double.parseDouble을 사용하지 않으면 String으로 변환된다
		//소수점 둘째자리까지 floating point -->문자열로 반환
		//기본
	
		//2. System.out.printf()메소드 활용하기
		System.out.printf("%.2f",avg);
		System.out.println();
		
		//3. double데이터 타입을 유지하며 반환하기
		System.out.println((double)Math.round(avg*100)/100);
}
}
