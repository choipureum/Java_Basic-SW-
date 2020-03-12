package Java12_exception;
import java.io.*;
import java.util.*;


public class Exception_09_throws {
	public static void main(String[] args)  {
		
		try {
			//키보드의 입력을 받아들이는 메소드(스캐너보다 원시적인)
			//키보드의 입력 1바이트 받기(기능이 너무 적다)
			//예외처리를 무조건해줘야 되는 메소드
			char input =(char)System.in.read();
			System.out.println("입력값 : "+input);
			System.out.println("아스키코드 : "+(int)input);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		 
	}
}
