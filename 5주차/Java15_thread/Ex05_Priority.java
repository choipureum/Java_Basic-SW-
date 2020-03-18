package Java15_thread;


//우선순위
public class Ex05_Priority extends Thread{
	private int idx;
	public Ex05_Priority(int idx) {
		this.idx =idx;
	}
	@Override
	public void run() {
		System.out.println(idx+" 스레드 시작");
		
		for(int i=0;i<1000;i++) {
			System.out.print(idx);
		}
		System.out.println(idx+" 스레드 끝");
	}

	public static void main(String[] args) {	
		System.out.println("Main 스레드 시작");
		
		Ex05_Priority t1 = new Ex05_Priority(1);
		Ex05_Priority t2 = new Ex05_Priority(2);
		Ex05_Priority t3 = new Ex05_Priority(3);
		
		//우선순위 적용(큰 숫자가 높은 우선순위를 받는다)
		//3번이 우선순위가 높아져서 적용된다(보기에는 잘모른다)
		t1.setPriority(Thread.MIN_PRIORITY);//1
		t2.setPriority(Thread.NORM_PRIORITY);//5
		t3.setPriority(Thread.MAX_PRIORITY); //10 
		
		//스레드 활성화
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main 스레드 끝");
	}
	//thread Scheduling(스레드 스케줄링) //스레드를 관리한다
	// RoundRobin (순환할당) -time slice만큼 스레드를 번갈아가면서 실행한다 
	// time slice, 시간조각 
	//Priority , 우선순위 : 우선순위가 높은 스레드를 좀 더 많이 실행한다(더 많은 timeslice를 배당)
	//우선순위가 높은 애를 먼저 timeslice만큼 실행
	
	//자바는 RoundRobin과 Priority 두 알고리즘을 적용하여
	//스레드 스케줄링을 수행한다
	
}	
