package Java06_class.method.quiz;
import java.util.*;

public class MethodQuizEx {
	public static void main(String[] args) {

		MethodQuiz mq =new MethodQuiz();
		Scanner sc=new Scanner(System.in);
		
		int [] arr = {10,20,30,40,50,60,70}; //예시 배열
		
		out: while(true) {
			System.out.print("몇번을 출력할까요(1~6) : ");
			int n=sc.nextInt();
				switch(n) {
					case 1:
						mq.Q1();
						break;	
						
					case 2:
						System.out.print("몇번 Hello를 출력? :");
						int q=sc.nextInt();
						mq.Q2(q);
						break;
						
					case 3:
						System.out.print("몇번 텍스트를 반복할래요? :");
						int w=sc.nextInt();
						System.out.print("무슨 텍스트를 입력하나요? :");
						String k=sc.next();
						mq.Q3(w,k);
						break;
						
					case 4:
						mq.print(arr);
						break;
						
					case 5:						
						mq.mul10(arr);
						System.out.println("원본배열 : "+Arrays.toString(arr)); //원래 배열
						break;
						
					case 6:						
						mq.mul10v2(arr);	//깊은복사
						System.out.println("원본배열 : "+Arrays.toString(arr)); //원래 배열
				}
				System.out.print("그만하시겠습니까?(y/n) : ");
				char temp=sc.next().charAt(0);
				if(temp=='y') {
					System.out.println("-----시스템 종료-----");
					break out;
				}		
		}
}
}
//+ 메소드 퀴즈(Method Quiz)-----------------------------------
//- MethodQuiz 클래스와 MethodQuizEx 클래스를 작성하여 문제 해결!
//
//Q1. 1~100 출력
//
//Q2. 입력한 횟수만큼 "Hello" 출력
//
//Q3. 입력한 횟수만큼 입력한 텍스트 출력
//
//---------------------------------------------------------
//
//Q4. 다음 메소드들을 작성하시오
//	- 배열의 모든 요소 출력 (메소드명 print)
//
//	- 배열의 모든 요소 10배 (메소드명 mul10)
//	(원본인 main의 arr이 변경됨)
//
//	- 배열의 모든 요소 10배한 새로운 배열 반환 (메소드명 mul10v2)
//	(원본인 main의 arr은 그대로)
