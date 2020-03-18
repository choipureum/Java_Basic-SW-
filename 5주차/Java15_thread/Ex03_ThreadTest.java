package Java15_thread;

import java.util.Random;

public class Ex03_ThreadTest extends Thread{
	private int idx; //스레드의 인덱스
	
	public Ex03_ThreadTest(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		System.out.println(idx+"스레드 시작");
//		Random ran = new Random(); //난수
		int rans = (int)(Math.random()*3000);
		try {
			//0~3000밀리초 사이의 랜덤한 sleep
			Thread.sleep(rans); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(idx+"스레드 끝");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main 스레드 시작");
		 
		for(int i =0;i<10;i++) {
			new Ex03_ThreadTest(i).start();
		}
		System.out.println("Main 스레드 끝");
	}
}
//ex)
//Main 스레드 시작
//0스레드 시작
//1스레드 시작
//2스레드 시작
//3스레드 시작
//Main 스레드 끝
//5스레드 시작
//4스레드 시작
//8스레드 시작
//9스레드 시작
//7스레드 시작
//6스레드 시작
//4스레드 끝
//9스레드 끝
//3스레드 끝
//8스레드 끝
//5스레드 끝
//0스레드 끝
//7스레드 끝
//1스레드 끝
//6스레드 끝
//2스레드 끝
