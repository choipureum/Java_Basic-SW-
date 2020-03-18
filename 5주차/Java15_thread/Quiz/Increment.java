package Java15_thread.Quiz;

public class Increment implements Runnable{
	int n;
	
	public Increment(int n) {
		this.n =n;
	}
	@Override
	public void run() {
		System.out.println("+ + + Increment 실행 ");
		for(int i=1;i<=n;i+=2) {			
			System.out.println(">>Inc : "+i+" /");
			try {
				Thread.sleep(50);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}		
		}
		System.out.println("Increment 종료 + + +");	
	}
}
