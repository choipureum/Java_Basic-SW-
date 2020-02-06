package Java05_array;

import java.util.Arrays;

public class Array_01 {
	public static void main(String[] args) {
		int num; //int형 변수 선언
		num =123; //변수에 값대입
		
		//----------------------------------
		int[] arr; //int형 배열 변수 선언
		arr=new int[5]; //int형 배열 생성
		//배열 생성시 변수 공간 묶음(배열)이 만들어진다
		//배열을 생성하면서 변수공간의 개수를 정한다
		
		//-------------------------------
		//배열의 저장공간에 값 대입
		int sum=10;
	    for(int i=0;i<5;i++) {
	    	arr[i]=sum;
	    	sum+=10;
	    }
	    //arr[5]=60;
	    //ArrayIndexOutOfBoundsException -->배열의 범위를 벗어난 공간에 수를 대입하려고 시도하면 예외발생
	    System.out.println(arr); //I@2a139a55 -->참조값 : Int형 5개짜리 배열공간에 대표 주소값이 표시
	    //배열의 이름은 메모리에 배열이 생성된 위치(주소,참조)를 나타냄 // ->참조값, Reference
 		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------");
	}
}
//<배열의 선언>
//배열 공간의 참조값을 저장할 수 있는 변수 선언
//데이터 타입 [] 배열명 ;

//+배열의 생성
//실제데이터가 저장될 수 있는 공간(Elements, 요소)을 생성한다
//new 데이터타입[개수]
//**개수는 양수로 지정해야한다
//
//<배열의 요소 접근(활용)>
//-배열의 인덱스를 이용하여 요소(저장공간)에 접근할 수 있다
//인덱슨ㄴ 0부터 시작, 1씩 증가하면서 처리
//배열의 크기를 벗어난 인덱스 사용 불가
//음수 사용 불가
	
