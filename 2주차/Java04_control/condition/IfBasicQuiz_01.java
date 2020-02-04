package Java04_control.condition;
import java.util.*;

public class IfBasicQuiz_01 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
     	//프로그램 1
		//+ 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//		>> Input Number : -3
//		>> 음수입니다
		int input =sc.nextInt();
		if(input<0) {
			System.out.println("음수입니다");
		}
		else if(input>0){
			System.out.println("양수입니다");
		}
		else {
			System.out.println("0입니다");
		}
		
		//프로그램 2
		//+ 입력한 데이터가 3의 배수인지 판별하시오
		// (% 연산자 사용)
//			>> Input Number : 7
//			>> 3의 배수가 아닙니다
		int input2=sc.nextInt();
		if(input%3==0) {
			System.out.println("3의 배수입니다");
		}
		else {
			System.out.println("3의 배수가 아닙니다");
		}
		
		//프로그램 3
		//+ 두 수를 입력 받아 큰 수를 출력하시오
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 이 더 큰 수
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		if(input3>input4) {
			System.out.println(input3+"이 더 큰 수");
		}
		else if(input<input4) {
			System.out.println(input4+"이 더 큰 수");
		}
		else {
			System.out.println("두 수가 같다");
		}
		
	}
}
