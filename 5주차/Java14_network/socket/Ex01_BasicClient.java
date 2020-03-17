package Java14_network.socket;

import java.io.*;
import java.net.Socket;

public class Ex01_BasicClient {
	public static void main(String[] args) {
		Socket sock = null;
		BufferedReader in=null; //소켓 입력 스트림 
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			sock= new Socket("192.168.20.66",10001); 
//			sock= new Socket("localhost",10001);//localhost는 나자신 //직접 ip를 입력해줘도된다
			//Socket IP에 localhost를 적으면 내가 주고 내가받고
			//다른 사람 IP를 적으면 받을 수 있다 
			
			//--------데이터통신---------
			//sock에서 입출력스트림을 얻어 통신
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String msg = in.readLine(); //데이터 읽기
			System.out.println();
			System.out.println("\t>> 전송데이터 : "+msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//자원 해제
			try {
				if(in!=null)in.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	}
}
// < 콘솔 2개 동시에 실행하는법 >
//콘솔창에서 new console로 하나 더 실행가능
//pin console -> 누르면 고정된 파일만 실행 -> 안누르면 ctrl+f11하면 해당 파일 실행


//BindException : 서버가 사용중이라는 에러메세지 (서버를 연속으로 2번 실행시키면 안된다)
