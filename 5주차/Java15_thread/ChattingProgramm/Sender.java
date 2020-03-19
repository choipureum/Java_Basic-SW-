package Java15_thread.ChatingProgramm;
import java.util.*;
import java.io.*;
import java.net.*;


public class Sender extends Thread{
	private Socket sock;
	private BufferedReader in;
	private PrintWriter out ;
	Boolean flag =false;
	
	public Sender(Socket sock) {
		this.sock =sock;
	}
	@Override
	public void run() {		
			String str= null;
			try {			
				in = new BufferedReader(new InputStreamReader(System.in));
				out = new PrintWriter(this.sock.getOutputStream(),true);
				
				while(true) {
					System.out.println(">> ");
					str=in.readLine();
					if(str.equals("exit")) {
						this.flag=true;
						System.out.println("+ + + 프로그램 종료 + + +");
						break;
					}	
					else {
						out.print(str+"\n");
						out.flush();
					}
					
				}
			}catch (IOException e1) {
				e1.printStackTrace();
			}finally {				
				try {					
						if(out!=null)out.close();
						if(in!=null)in.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
		}		
	}
}

//+ Sender_1on1 extends Thread
//// 통신소켓
//- sock: Socket
//	
//// 키보드입력
//- reader: BufferedReader
//	"/EXIT" 입력 시 종료
//	
//// 소켓출력
//- writer: PrintWriter
//	
//// 생성자
//+ Sender_1on1(Socket)
//
//// run() Override
//// 키보드입력 -> 소켓출력
