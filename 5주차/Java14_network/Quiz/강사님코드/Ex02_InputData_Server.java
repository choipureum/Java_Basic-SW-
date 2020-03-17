package java14_network.socket.answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02_InputData_Server {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; //서버 리슨 소켓
		Socket sock = null; //서버 통신 소켓
		
		BufferedReader in = null; //입력 스트림
		
		String msg = null; //입력한 데이터
		
		try {
			// ----- 서버 리슨 소켓 활성화 -----
			servSock = new ServerSocket(10002); //리슨 소켓 생성
			System.out.println(" + + + 서버 소켓 생성 + + +");
			
			System.out.println();
			System.out.println("----- 접속 대기중 -----");
			System.out.println("  Listen Port : "
					+ servSock.getLocalPort()); //서버 리슨 포트
			System.out.println("-----------------------");
			
			sock = servSock.accept(); // Listen
			// -----------------------------------
			
			// ----- BLOCKED -----
			
			// ----- 접속 정보 확인 -----
			System.out.println("클라이언트 접속!!");
			InetAddress ip = sock.getInetAddress();//클라이언트 ip정보얻기
			System.out.println("  >>클라이언트 IP : " + ip.getHostAddress());
			System.out.println("  >>클라이언트 Port : " + sock.getPort());
			System.out.println("-----------------------");
			// -------------------------
			
			
			//데이터 통신
			in = new BufferedReader(
					new InputStreamReader(
						sock.getInputStream() ));
			//Socket->InputStream->Reader->BufferedReader
			
			
			// 클라이언트가 전송한 문자열 출력하기
			while( (msg = in.readLine()) != null ) {
				System.out.println("\n\t>>전송데이터 : " + msg);
			}
			
		} catch (IOException e) {
			// 서버 리슨 소켓 생성 실패
			// accept() 실패 -> 통신 소켓 생성 실패
			e.printStackTrace();
		} finally {
			try {
				if(in!=null)	in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}




