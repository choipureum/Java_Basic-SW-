package Java15_thread;

public class Ex02_interfaceRunnable {
	public static void main(String[] args) {
		Thread02 th = new Thread02(); //new (새롭게 발생한 쓰레드 객체)
		
		//th.start()메소드는 쓰레드 클래스의 메소드이다(Runnable에는 없음)
		//실행하려면 Thread타입으로 생성하되 Runnable타입을 매개변수에 대입가능하다
		Thread threadExcutor = new Thread(th); //스레드 실행객체
		threadExcutor.start();
		//Runnable을 이용하는법, Thread를 상속받아서 하는법 둘중 Runnable을 사용하는 이 방법이 더 좋다
		
		for(int i=0;i<100;i++) {
			System.out.println("Main :"+(i+1));		
		try {
			Thread.sleep(50); //Thread01 스레드를 50밀리초 일시정지 시킨다
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}

//Runnable 클래스
class Thread02 implements Runnable{
	//추상메소드라 반드시 구현해야하는 run()메소드
	@Override
	public void run() {
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
