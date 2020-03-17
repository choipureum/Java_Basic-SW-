package Java14_network.Quiz2;
import java.io.*;
import java.net.*;
import java.util.*;
public class Ex03_Echo_Server {
	public static void main(String[] args) {
		ServerSocket servSock = null; //서버 리슨소켓
		Socket sock = null; //통신 소켓
		BufferedReader in=null;
		PrintWriter out =null;
		try {			
			//----------서버 리슨 소켓 활성화-------------//
			servSock = new ServerSocket(10000);//리슨 소켓 생성
			System.out.println("+ + + 서버 소켓 생성 + + +\n");
			System.out.println("--- 클라이언트 접속 대기중 ---");
			System.out.println(" Listen Port : "+servSock.getLocalPort()); //10001출력
			System.out.println("-----------------------");
			//클라이언트가 접속하면 통신용 소켓을 반환한다
			sock=servSock.accept(); 
			//프로그램을 BLOCK시킨다 (일시정지) -무한 대기중
			
			//----------- 일시 정지 상태, BLOCKED--------------------

			//--------데이터 통신----------------
			// 통신 소켓 sock 에서 입출력스트림을 얻어 통신한다
//			sock.getInputStream(); // 소켓을 통한 입력 스트림
//			sock.getOutputStream(); //소켓을 통한 출력 스트림
			//---서버에서 출력을하고 클라이언트에서 받아보기---
			
			
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				String msg = in.readLine(); //데이터 읽기
				System.out.println();
				System.out.println("\t>> 전송데이터 : "+msg);
				out = new PrintWriter(sock.getOutputStream(),true); //autoflush를안해주면 flush를 꼭해줘라!
				out.println(msg);
				out.flush();
				
				

			//--------------------------------
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원 해제
				try {
					if(in!=null)in.close();
					if(sock!=null)sock.close();
					if(servSock!=null)servSock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}

	}
}
