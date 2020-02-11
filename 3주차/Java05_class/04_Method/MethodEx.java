package Java06_class.method;

import java.util.Arrays;

//실행 클래스
public class MethodEx {
	public static void main(String[] args) {
		//인스턴스화 , 객체생성
		Method_01 m01 =new Method_01();
		
		int res=m01.add(100, 200); //res=300
		System.out.println("결과 : "+res);
		System.out.println("결과2 : "+m01.add(31, 34));
		
		//-------------------------------------------
		Method_02 m02 = new Method_02();
		m02.method01();
		m02.method02(100); //parameter를 넣어줘야한다 //100, 전달인자, 전달인수, argument
		m02.printnum2(21, 32);
		System.out.println(m02.returnNum());
		System.out.println(m02.add(3456,1231));
		
		//-------------------------------------------
		Method_03 m03 =new Method_03();
		int [] arr = new int[5]; //배열
		int num; //int형 변수
		arr[2]=100;
		num=200;
		//비교
		System.out.println("----메소드 호출 전----");
		System.out.println(Arrays.toString(arr)); //Arrays API클래스 ->배열을 문자열로 변환해서 반환해준다(출력용)
		//Arryas.fill(arr,5) -->배열에 전부 5로 채워준다  
		System.out.println(num);
		m03.arrTest01(arr); //참조, Reference전달
		m03.arrTest02(num); //값, Value 전달
		System.out.println("----메소드 호출 후----");
		System.out.println(Arrays.toString(arr));
		System.out.println(num);
		
		//----------------------------------------------
		int n=m03.arrTest03();
		n=20;
		
		int [] ar=m03.arrTest04();
		ar[0]=99;
	}
}


//< 메소드, Method >
//-함수(Function)
//-클래스의 기능 또는 동작 또는 행위 등을 정의하는 코드
//-객체 변수를 통해 호출하여 사용한다
//-객체들 간의 데이터 전달 수단으로 사용한다
//

//< 메소드 정의 방법 >
//-[접근제한자] [리턴타입(데이터의 자료형)][메소드명](매개변수(있을수도 있고 없을수도 있고){
//   실행코드
// }  //기본 문법
//
//-return 데이터가 없을 경우 리턴타입을 void로 작성 
//-매개변수가 없을 경우 ()안을 비워둔다
//
