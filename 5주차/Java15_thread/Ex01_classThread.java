package Java15_thread;
import java.util.*;
import java.io.*;

public class Ex01_classThread {
	//메인스레드 생성
	public static void main(String[] args) {
		Thread01 th = new Thread01();
		//th.run(); 일반메소드 호출, 하지말 것, 스레드 아님
		
		th.start(); //스레드 실행, 활성화	
		//번갈아 수행되는데 어떤 식으로 먼저 수행할 지는 알 수 없다
		
		for(int i=0;i<100;i++) {
			System.out.println("Main : "+(i+1));
			try {
				Thread.sleep(50); //메인 메소드 스레드를 50밀리초 일시정지 시킨다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

//일반클래스 ->상속받는순간 스레드클래스
class Thread01 extends Thread{
	@Override
	public void run() { //스레드코드
		for(int i=0;i<100;i++) {
			System.out.println("Thread :"+(i+1));		
		try {
			Thread.sleep(50); //Thread01 스레드를 50밀리초 일시정지 시킨다
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
	//스레드 제어 메소드
	// 스레드의 동작을 제어하는 메소드
	// 스레드 생명주기(Life Cycle, 라이프사이클 ) 에 영향을 준다
	//sleep도 그 중 하나
	
	//public static void sleep(long millis) throws InterruptedException
	//주어진 밀리초만큼 sleep을 호ㅜㄹ한 스레드를 일시정지 시킨다
	//
	
	





