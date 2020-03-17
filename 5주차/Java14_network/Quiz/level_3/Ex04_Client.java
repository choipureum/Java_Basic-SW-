package network;
import java.io.*;
import java.net.*;
import java.util.*;


public class Client {
	public static void main(String[] args) {
		Socket sock = null;
		PrintWriter out=null;
		File file = new File("./src/network/data.txt");
		FileReader in=null;
		char [] c = new char[1024];
		int len=0;
		
		try {
			sock= new Socket("localhost",10001);
			in = new FileReader(file);
			out = new PrintWriter(sock.getOutputStream(),true);
			while((len=in.read(c))!=-1) {
				out.write(c,0,len);
			}
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
//class Ex04_Client
//-------------------------
//- sock : Socket
//- out : PrintWriter
//- file : File
//- in : FileReader
//-------------------------
//1. sock 생성
//2. in 생성
// 파일 입력 스트림
//3. out 생성
// 네트워크 출력스트림
//4. 파일 읽어서 보내기
// read(char[])
// write(char[], int, int)
//5. close() 적절히
