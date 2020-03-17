package java14_network.socket.answer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex02_InputData_Client {
	public static void main(String[] args) {
		
		// 키보드 입력 스트림	
		Scanner sc = new Scanner(System.in);
		
		Socket sock = null; //클라이언트 소켓
		
		PrintWriter out = null; //출력스트림
		
		try {
			System.out.println(" + + + 클라이언트 실행 + + +");
			sock = new Socket("localhost", 10002); //서버 접속
			
			
			// 출력 스트림 개설
			out = new PrintWriter(
					sock.getOutputStream(), true );
			
			// 데이터 통신
			while(true) {
				String str = sc.nextLine();
				if( "/exit".equals(str) )	break;
				
				out.println(str);
			}
			
		} catch (UnknownHostException e) {
			// 잘못된 호스트
			e.printStackTrace();
		} catch (IOException e) {
			// 소켓 생성 실패
			e.printStackTrace();
		} finally {
			out.close();
		}
		
	}
}





