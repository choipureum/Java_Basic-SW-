package Java15_thread.Quiz;
import java.io.*;

import Java15_thread.Ex05_Priority;

public class TestThread {
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		System.out.println(">>[Inc]몇까지 2씩 증가시킬래");
		int n;
		int a,b;
		try {
			n = Integer.parseInt(br.readLine());
			System.out.println(">>[Dec]몇부터 몇까지 감소 ");
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			
			Increment ic = new Increment(n);			
			Decrement dc = new Decrement(a,b);
			
			Thread t1 = new Thread(ic);
			Thread t2 = new Thread(dc);
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("+ + + 종료 + + +");
	}
}
//+ 스레드 테스트 퀴즈
//
//- 실행용 클래스
//	java15_thread.quiz.TestThread.java
//
//- Thread 클래스
//	java15_thread.quiz.Increment.java
//	java15_thread.quiz.Decrement.java
//
//	1. 두 클래스 모두 Runnable 인터페이스 상속받음
//
//	2. Increment 클래스는 생성시, 정수를 하나 초기값으로 전달받음
//	  Increment inc = new Increment(50);
//		>> 1부터 50 될 때까지 정수를 2씩 증가시키는 내용 반복함
//		>> 숫자 하나 출력후 0.05초 멈춰있게함
//
//	3. Decrement 클래스 생성시, 정수를 두 개를 초기값으로 전달받음
//	  Decrement dec = new Decrement(12, 45);
//		>> 45부터 12될 때까지 1씩 감소시키는 내용 반복함
//		>> 숫자 하나 출력후 0.1초 멈춰 있게함.
//
//	4. 실행용 클래스에서 두 클래스를 멀티스래딩함.
