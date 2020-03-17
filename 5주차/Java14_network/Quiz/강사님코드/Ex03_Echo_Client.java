package java14_network.socket.answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex03_Echo_Client {
	public static void main(String[] args) {
	
		Socket sock = null; //클라이언트 소켓 객체
		
		PrintWriter out = null; //소켓 출력 스트림 객체
		BufferedReader in = null; //소켓 입력 스트림 객체
		
		Scanner sc = new Scanner(System.in); //키보드입력
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			
			// 접속 요청
			sock = new Socket("localhost", 10003);

			// 출력 스트림 개설, autoFlush=true
			out = new PrintWriter(
					sock.getOutputStream(), true );

			// 입력 스트림 개설
			in = new BufferedReader(
					new InputStreamReader(
						sock.getInputStream() ));
			
			// ----- 데이터 통신 -----
			String msg = null; // 메세지
			
			while(true) {
				// 전송할 내용 입력
				System.out.print("\t보낼 메시지 : ");
				msg = sc.nextLine();
				
				// 통신 중단
				if( "/exit".equals(msg) )	break;
				
				// 서버로 전송
				out.println(msg);
				
				// ECHO
				System.out.println(">> 받은 메시지 : "
						+ in.readLine() );
			}
			System.out.println("+ + + 통신 완료 + + +");
			// --------------------
			
		} catch (UnknownHostException e) {
			System.out.println("[ERROR] 알 수 없는 호스트입니다");
		} catch (IOException e) {
			System.out.println("[ERROR] 소켓 생성 실패, 서버와 통신할 수 없습니다");
		} finally {
			try {
				if(out!=null)	out.close();
				if(in!=null)	in.close();
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] 자원 해제 실패");
			}
		}		

	}
}
