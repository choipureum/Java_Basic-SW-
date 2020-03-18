package Java15_thread.sync;

public class WaitNotifyEx {
	public static void main(String[] args) {
		
		SyncData data= new SyncData(); //공유자원
		
		//두개의 데이터는 같은 주소값을 공유하고 있다
		Output o = new Output(data);
		Input i = new Input(data);
		// 일부러 아웃풋을 먼저 실행시켜본다
		o.start();	
		i.start();
		
	}
}
