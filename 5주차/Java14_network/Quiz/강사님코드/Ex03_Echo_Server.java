package java14_network.socket.answer;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_Echo_Server {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // 서버 리슨 소켓
		Socket sock = null; // 서버 통신 소켓
		
		BufferedReader in = null; // 소켓 입력 스트림
		PrintWriter out = null;	// 소켓 출력 스트림

		try {
			servSock = new ServerSocket(10003);
			System.out.println("+ + + 서버 소켓 생성 + + +");
			
			// 접속 및 통신 반복
			while(true) {
				try {
					System.out.println("----- 접속 대기중 -----");
					System.out.println("Linsten Port : "
							+ servSock.getLocalPort() );
					System.out.println("--------------------");
					sock = servSock.accept(); // Listen
					
					// ----- BLOCK -----
					
					System.out.println("클라이언트 접속!!");
					// Remote 정보 확인
					InetAddress ip = sock.getInetAddress();
					System.out.println("\t>>클라이언트 IP : "
							+ ip.getHostAddress()); //IP
					System.out.println("\t>>클라이언트 Port : "
							+ sock.getPort() ); //Port
							
					// 입력 스트림 개설
					in = new BufferedReader(
							new InputStreamReader(
								sock.getInputStream() ));
					
					// 출력 스트림 개설, autoFlush=true
					out = new PrintWriter(
							sock.getOutputStream(), true);

					// ----- 데이터 통신 -----
					String msg = null;
					
					while( (msg = in.readLine()) != null ) {
						System.out.println(" 받은메시지>> " + msg);
						out.println(msg); // ECHO
					}
					// --------------------
		
					//클라이언트의 정상 종료 : 클라이언트가 .close() 수행
					System.out.println("+ + + 클라이언트가 연결 끊김 + + +");
					
				} catch (IOException e) {
//					e.printStackTrace();
					
					//클라이언트의 비정상 종료 : 클라이언트 강제 종료
					System.out.println("+ + + 클라이언트 연결 끊김 + + +");
				} finally {
					try {
						if(in!=null)	in.close();
						if(out!=null)	out.close();
						if(sock!=null)	sock.close();
					} catch (IOException e) {
						System.out.println("[ERROR] 자원해제 실패");
					}
				} // try end - 클라이언트 접속 및 통신
				
			}	// while end - 서버 리슨 반복
			
		} catch (IOException e) {
			System.out.println("[ERROR] 소켓 생성 실패");
		} finally {
			try {
				if(servSock!=null)	servSock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] 자원해제 실패");
			}
		}
		
	}	
}
