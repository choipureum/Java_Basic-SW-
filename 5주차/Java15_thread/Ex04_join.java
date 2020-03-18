package Java15_thread;

public class Ex04_join extends Thread{
	private int idx; //스레드의 인덱스
	
	public Ex04_join(int idx) {
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
		Ex04_join t1= new Ex04_join(1);
		Ex04_join t2= new Ex04_join(2);
		Ex04_join t3= new Ex04_join(3);
		
		t1.start();
		t2.start();
		t3.start();
		//원래 start만하면 끝날때를 기다리지 않고 Main스레드 끝이 출력되었다
		// 이것을 방지 -> 스레드가 끝날때를 기다린다 
		try {
			//public final void join()throws InterruptedException
			//	스레드가 종료될 때까지 기다린다(Main이 t1을 기다린다)			
			t1.join();  
			t2.join();  
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main 스레드 끝");
	}
}

//
//Main 스레드 시작
//1스레드 시작
//2스레드 시작
//3스레드 시작
//3스레드 끝
//2스레드 끝
//1스레드 끝
//Main 스레드 끝
