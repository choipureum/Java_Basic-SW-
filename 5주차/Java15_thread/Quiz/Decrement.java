package Java15_thread.Quiz;

public class Decrement implements Runnable{
	int a;
	int b;
	
	public Decrement(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void run() {
		System.out.println("+ + + Decrement 실행 ");
		for(int i=b;i>=a;i--) {
			System.out.println(">>Dec : "+i+" /");
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Decrement 종료 + + +");
	}
}
