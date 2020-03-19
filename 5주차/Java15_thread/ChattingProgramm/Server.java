package Java15_thread.ChatingProgramm;
import java.util.*;
import java.io.*;
import java.net.*;



public class Server {
	Sender s;
	public Server() {
		ServerSocket serv = null;
		Socket sock =null;
	
		try {
			System.out.println("+ + + 서버 오픈 + + +");
			serv=new ServerSocket(10004);
			sock= serv.accept();
			System.out.println("+ + + 클라이언트  접속 + + +");
			chat(sock);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {			
				try {
					if(s.flag) {
						if(sock!=null)sock.close();
						if(serv!=null)serv.close();
					}
				
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}	
	}
	
	
	
	
	public void chat(Socket sock) {
		s=new Sender(sock);
		s.start();
	    new Receiver(sock).start();
	}
	public static void main(String[] args) {
		new Server();
	}
}
//+ Server_1on1 class
//// 생성자
//+ Server_1on1()
//	ServerSocket 생성
//	accept();
//	chat(Socket);
//
//+ chat(Socket): void
//   new Sender(Socket).start();
//   new Receiver(Socket).start();
//
//+ main()
//	new Server_1on1();
