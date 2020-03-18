package Java15_thread.sync;

public class Input extends Thread{
	//덧셈의 결과를 집어넣음
	SyncData data;
	
	public Input(SyncData data) {
		this.data= data;
	}
	@Override
	public void run() {
		//동기화를 하게되면 순서는 지켜진다
		synchronized(data) {
			//1부터 100까지 덧셈
			System.out.println("---Input Start---");
			
			for(int i=1;i<=100;i++) {
				data.total+=i;
			}
			System.out.println("---Input   end---");
		}	
	
	}
}
