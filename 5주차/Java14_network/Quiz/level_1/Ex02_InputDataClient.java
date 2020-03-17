package Java14_network.Quiz1;

import java.io.*;
import java.net.*;
import java.util.*;
public class Ex02_InputDataClient {
	final static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		Socket sock = null;
		PrintWriter out = null; //출력스트림
		try {
			System.out.println("++서버로 보낼 내용을 입력하세요 : ");
			sock= new Socket("localhost", 10000);
			
				String str= sc.nextLine();
				out =new PrintWriter(sock.getOutputStream(),true); //autoflush
				out.println(str);
					
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
		
	}
}
