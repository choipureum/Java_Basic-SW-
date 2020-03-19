package java15_thread.chat1on1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_1on1 {
	
	private final String HOST = "localhost"; //서버호스트,ip
	private final int PORT = 10005; //서버포트
	
	public Client_1on1() {
		Socket sock = null;
		
		try {
			System.out.println("+ + 클라이언트 시작 + +");
			sock = new Socket(HOST, PORT);
			
			//--- 데이터 통신 ---
			// 서버->클라이언트 통신
			// 클라이언트->서버 통신
			chat(sock);
			//---------------
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void chat(Socket sock) {
		// Sender Thread
		new Sender_1on1(sock).start();
		// keyboard input -> sock output
		
		// Receiver Thread
		new Receiver_1on1(sock).start();
		// sock input -> monitor output
	}

	public static void main(String[] args) {
		new Client_1on1();
	}
	
	
}












