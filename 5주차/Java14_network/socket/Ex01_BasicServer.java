package Java14_network.socket;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;

public class Ex01_BasicServer {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; //서버 리슨소켓
		Socket sock = null; //통신 소켓
		
		PrintWriter out =null; //소켓출력스트림
		
		try {
			
			//----------서버 리슨 소켓 활성화-------------//
			servSock = new ServerSocket(10001);//리슨 소켓 생성
			System.out.println("+ + + 서버 소켓 생성 + + +\n");
			System.out.println("--- 클라이언트 접속 대기중 ---");
			System.out.println(" Listen Port : "+servSock.getLocalPort()); //10001출력
			System.out.println("-----------------------");
			//클라이언트가 접속하면 통신용 소켓을 반환한다
			sock=servSock.accept(); 
			//프로그램을 BLOCK시킨다 (일시정지) -무한 대기중
			
			//----------- 일시 정지 상태, BLOCKED--------------------
			
			//----------- 접속 정보 확인-----------------
			System.out.println("클라이언트가 접속!");
			InetAddress ip = sock.getInetAddress(); //InetAddress로 통신용소켓에서 주소를 받아옴
			System.out.println("  >>클라이언트 IP : "+ip.getHostAddress());
			System.out.println("  >>클라이언트 Port : "+sock.getPort()); //소켓에서 포트받아옴
			System.out.println("-----------------------");
			//--------데이터 통신----------------
			// 통신 소켓 sock 에서 입출력스트림을 얻어 통신한다
//			sock.getInputStream(); // 소켓을 통한 입력 스트림
//			sock.getOutputStream(); //소켓을 통한 출력 스트림
			//---서버에서 출력을하고 클라이언트에서 받아보기---
			out =new PrintWriter(sock.getOutputStream(),true); //autoflush
			out.println("상옥이바보 상옥이바보 상옥이바보 상옥이바보 상옥이바보 상옥이바보");
			
			//--------------------------------
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원 해제
				try {
					if(out!=null)out.close();
					if(sock!=null)sock.close();
					if(servSock!=null)servSock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}

	}
}
















