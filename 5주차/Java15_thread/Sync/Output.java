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
			if(!data.available) {
				//덧셈이 완료되지 않은상황
				try {
					data.wait();//그냥 wait()을 하게되면 자기자신을 기다리는것이다(data)를 기다리는 것이므로
					// data.를 기다려야한다 //LOCK반납
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			}else {
				System.out.println("Total : "+data.total);	
		
			}	
		}
		System.out.println("---Output   end---");
		
	}
}
