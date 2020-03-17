package network;
import java.io.*;
import java.net.*;
import java.util.*;


public class Server {
	public static void main(String[] args) {
		ServerSocket serv = null;
		Socket sock = null;
		BufferedReader in =null;
		File file=new File("./src/network/data.txt"); //입력
		FileWriter out =null;
		//보조스트림
		char [] c = new char[1024];
		int len =0;
		try {
			serv = new ServerSocket(10001);
			sock = serv.accept();
			String str="";
			//Remote정보 출력
			InetAddress ip = sock.getInetAddress();
			System.out.println("+ + + 클라이언트 정보 + + +");
			System.out.println("IP 정보 : "+ip.getHostAddress());
			System.out.println("Port정보 : "+sock.getPort());
			System.out.println("+ + + + + + + + + + + + + +");
			
			in= new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = new FileWriter("./src/network/receive.txt",true); //받기
			
			while((len = in.read(c))!=-1) {
				out.write(c,0,len);				
			}	
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				if(out!=null)out.close();
				if(in!=null)in.close();
				if(sock!=null)sock.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
//-------------------------
//class Ex04_Server
//-------------------------
//- serv : ServerSocket
//- sock : Socket
//- in : BufferedReader
//- file : File
//- out : FileWriter
//-------------------------
//1. serv 생성
//2. Listen 및 sock 생성
//3. Remote 정보 출력
// IP정보 : InetAddress
// Port정보 : sock
//4. in 생성
// 네트워크 입력스트림
//5. out 생성
// 파일 출력 스트림
//6. 파일 받아서 저장
// read(char[])
// write(char[], int, int)
//7. close() 적절히
//
