package Java15_thread.ChatingProgramm;
import java.util.*;
import java.io.*;
import java.net.*;


public class Receiver extends Thread {
	private Socket sock;
	private BufferedReader in ;
	private PrintWriter out ;

	public Receiver(Socket sock) {
		this.sock =sock;
	}
	
	public void run() {				
			String str="";
			
			try {			
				in = new BufferedReader(new InputStreamReader(this.sock.getInputStream()));
				
				while((str=in.readLine())!=null) {	
					System.out.println("받은메세지 : "+str);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(in!=null)in.close();
					if(out!=null)out.close();
				}catch( IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

//+ Receiver_1on1 extends Thread
////통신소켓
//- sock: Socket
//
//// 소켓입력
//- reader : BufferedReader
//
//// 모니터출력
//- writer : PrintWriter
//
//// 생성자
//+ Receiver_1on1(Socket)
//
//// run() Override
//// 소켓입력 -> 모니터출력
