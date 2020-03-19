package java15_thread.chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender_1on1 extends Thread {
	private Socket sock; //통신 소켓
	
	// 키보드입력 -> BufferedReader
	private BufferedReader reader;
	
	// 소켓출력 -> PrintWriter
	private PrintWriter writer;
	
	public Sender_1on1(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		// 키보드입력 받아서 소켓출력으로 보낸다

		// 키보드 입력 객체 생성
		reader = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			// 소켓 출력 객체 생성
			writer = new PrintWriter(
					sock.getOutputStream(), true);
			
			//--- 실제 통신 ---
			while(true) {
				String msg = reader.readLine();//키보드입력
				if( "/EXIT".equals(msg) )	break;//통신중단
				writer.println(msg);
			}
			//---------------
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer!=null)	writer.close();
			try {
				if(reader!=null)	reader.close();
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}






