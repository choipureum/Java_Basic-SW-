package Java14_network.Quiz2;
import java.io.*;
import java.net.*;
import java.util.*;
public class Ex03_Echo_Client {
	final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Socket sock = null;
		PrintWriter out = null; //출력스트림
		BufferedReader in = null; //입력스트림
		
		System.out.println("+++ 서버로 보낼 내용을 입력하세요 : ");
		try {
			sock= new Socket("localhost",10000);
			String str = sc.nextLine();
			out = new PrintWriter(sock.getOutputStream(),true); //autoflush
			out.println(str);
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			System.out.println("Echo 서버로 부터 돌아온 값: ");			
			str= in.readLine();
			System.out.println("\t >>"+str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//자원 해제
			try {
				if(in!=null)in.close();
				if(sock!=null)sock.close();
				if(out!=null)out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	}
}
