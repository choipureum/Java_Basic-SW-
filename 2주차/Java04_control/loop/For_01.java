package Java04_control.loop;
import java.util.*;

public class For_01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//변수 i가 0부터 5보다 작은 동안에 1식 증가하며 반복한다
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
		}
	}
}

//
//	<기본 문법>
//	for(초기식; 조건식; 증감식) {
//		//반복해서 수행할 코드를 작성하는 영역
//		//조건식이 참일 때 수행한다
//	}
//
//	<FOR의 수행순서>
//	1.초기식 수행
//	2.조건식 판별
// 	 2-1 TRUE일때 3번수행
// 	 2-2 FLASE일때 FOR문 종료
//	3. 반복코드 1회수행
//  4. 증감식 수행
//  5. 2번수행
