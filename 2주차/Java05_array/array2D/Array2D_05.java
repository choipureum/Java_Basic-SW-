package Java05_array.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D_05 {
	public static void main(String[] args) {
		
		//new 연산자
		// 동적 할당 연산자
		// 할당: 변수공간 생성(저장 공간 생성)
		
		//정적 할당 =(static)하다 : 프로그램 실행 전에 끝나는 할당, Compile-time
		// +공간 자체에 대하여
		//동적 할당 : 프로그램 실행 도중에 준비 , Run-time
		// +new ~
		
		int num =1; //정적 할당
		int [] arr =new int[3]; //정적 할당 //동적 할당을 하면 참조형 변수에 저장할 참조값을 반환한다
		
		//**정적할당과 동적할당은 저장되는 메모리 영역이 따로 존재한다
		//-----------------------------------------------
//		int []arr2 = new int [-10]; //문법적으로 에러안난다 ->왜? : 할당이 Runtime(실행도중)일어나기 때문에
		
		//배열 선언 시점과 배열 생성 시점은 다르다
		
		//배열 변수 선언->정적할당
		//배열 공간 생성->동적할당
		
		//----------------------------------
		//<동적 할당이 필요한 이유?>
		int [][]score = new int[3][]; //만약 3명의 점수를 관리하나, 각 학생들의 과목수를 모른다?
		//-->동적할당으로 입력을 통해 관리하려고 한다. -->**정적으로는 표현 불가
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			System.out.print(i+"행 학생의 과목수는? ");
			int len =sc.nextInt();
			score[i]=new int[len];
			//동적으로 과목수를 변환시켜 대입해준다
		}
		System.out.println(Arrays.deepToString(score)); //공간확인해보세요
	}
}
