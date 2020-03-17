package java14_network.socket.answer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex04_File_Client {
	public static void main(String[] args) {
	
		Socket sock = null; //클라이언트 소켓 객체
		
		PrintWriter out = null; //소켓 출력 스트림 객체
		
		BufferedReader in = null; //입력 스트림 객체
		
		// 입력 대상 파일
		File file = new File("./src/java14_network/socket", "data.txt");
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			
			// 접속 요청
			sock = new Socket("localhost", 10004);

			// 출력 스트림 개설, autoFlush=true
			out = new PrintWriter(
					sock.getOutputStream(), true );

			// 입력 스트림 개설
			in = new BufferedReader(
					new InputStreamReader(
						new FileInputStream(file)));
			
			// ----- 데이터 통신 -----
			String str = null;
			while( (str=in.readLine()) != null ) {
				out.println(str);
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
