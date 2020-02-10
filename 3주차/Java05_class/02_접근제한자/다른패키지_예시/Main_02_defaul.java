package Java06_class.defalutTest;

import Java06_class.Class_02; //임포트도 해줘야한다

public class Main_02_default {
	public static void main(String[] args) { //main()은 퍼블릭으로 둬야한다. 아니면 실행 X
		Class_02 cl = null; //객체 변수 선언
		cl=new Class_02(); //객체 생성, 인스턴스화
		
			System.out.println(cl.num4); //public
//			System.out.println(cl.num3); //protected //에러 //not visible (접근제한자 문제)
//			System.out.println(cl.num2); //default //에러
//			System.out.println(cl.num1); //private //에러
			
		}
}
