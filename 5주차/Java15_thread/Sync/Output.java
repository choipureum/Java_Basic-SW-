package Java15_thread.sync;

public class Output extends Thread{
	SyncData data;
	
	//덧셈의 결과를 가져옴
	public Output(SyncData data) {
		this.data = data;
	}
	@Override
	public void run() {
		System.out.println("---Output Start---");
		synchronized(data) {
			System.out.println("Total : "+data.total);		
		}		
		System.out.println("---Output   end---");
		
	}
}
