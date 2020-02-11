package Java06_class.method.quiz;
import java.util.*;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.print("2개의 수 입력하세요 : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.print("연산자를 입력하세요 : ");
		char temp =sc.next().charAt(0);
		
		switch(temp) {
			case '+':
				System.out.println(n1+"+"+n2+"="+calc.sum(n1, n2));
				break;
			case '-':
				System.out.println(n1+"-"+n2+"="+calc.sub(n1, n2));
				break;
			case '*':
				System.out.println(n1+"*"+n2+"="+calc.mul(n1, n2));
				break;
			case '/':
				System.out.println(n1+"/"+n2+"="+String.format("%.2f",calc.div(n1, n2)));
				break;
			default :
				System.out.println("잘못된 연산자입니다 ");
		}				
	}
}
//************문제!!!!!**************
//+ package
//java06_class.method.quiz
//
//+ 클래스 작성하기
//1. 기능 클래스 ( class Calculator )
//- 기능 : 사칙연산 계산기
//- 메소드 4개
//sum, sub, mul, div
//- 매개변수 : 정수 2개
//- return : 정수 (단, div는 double)
//
//2. 실행 클래스 ( class CaculatorEx )
//- 기능 : 계산기 기능클래스를 이용
//
//정수2개와 연산자 1개를 입력받음 (Scanner 이용)
//switch로 구분하여 계산기클래스 이용하기
//
//ex) switch( operator ) {
//case '+':
//System.out.println(n1+"+"+n2+"="+calc.sum(n1,n2));
//break;
