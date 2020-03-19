package Java15_thread.ChatingProgramm;
import java.util.*;
import java.io.*;
import java.net.*;


public class Client {
	Sender s;
	
	public Client() {
		Socket sock =null;	
		try {			
			sock = new Socket("localhost",10004);
			System.out.println("+ + + 클라이언트 접속 + + +");
			chat(sock);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(s.flag) {
				try {					
					if(sock!=null)sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	public void chat(Socket sock) {
		s=new Sender(sock);
		s.start();
	    new Receiver(sock).start();
	}
	public static void main(String[] args) {
		new Client();
	}
}
//+ Client_1on1
//// 생성자
//+ Client_1on1()
//	Socket 생성
//	chat(Socket);
//
//+ chat(Socket): void
//   new Sender(Socket).start();
//   new Receiver(Socket).start();
//
//+ main()
//	new Client_1on1();
