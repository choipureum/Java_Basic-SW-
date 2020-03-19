package java15_thread.chat1on1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1on1 {
	//PORT
	private final int PORT = 10005;
	
	public Server_1on1() {
		ServerSocket serv = null; // 서버소켓
		
		try {
			System.out.println("+ + 서버 시작 + +");
			serv = new ServerSocket(PORT);
			
			System.out.println("--- 클라이언트 대기중 ---");
			Socket sock = serv.accept();
			
			InetAddress ip = sock.getInetAddress();
			System.out.println(
				"클라이언트("+ip.getHostAddress()+") 접속");
			
			//--- 데이터 통신 ---
			// 서버->클라이언트 통신
			// 클라이언트->서버 통신
			chat(sock);
			//---------------
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
		new Server_1on1();
	}
	
}
















