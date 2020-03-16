package Quiz;
import java.util.*;
import java.io.*;

public class TestMynote {
	final static Mynote note = new Mynote();//기능클래스 객체생성
	final static BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); //키보드입력
	
	public static void main(String[] args) {
		menu();

	}
	// 메뉴
	public static void menu() {
		out:
		while(true) {
			int sw = 0;
			System.out.println("*******  PureumNote  *******\n");
			System.out.println("1. 노트 새로 만들기\n"+"2. 노트 열기\n"
								+"3. 노트 열어서 수정하기\n"+"4. 종료하기\n");
			System.out.println("****************************");
			System.out.print("[입력] : ");
			try {
				sw = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("[ERROR]올바른 값을 입력하세요");
			}
			//항목별로 실행			
			switch(sw) {
				case 1:
					System.out.println("******* fileSave  *******\n");
					note.fileSave();
					break;
				case 2:
					System.out.println("******* fileOpen  *******\n");
					note.fileOpen();
					break;
				case 3:
					System.out.println("******* fileEdit  *******\n");
					note.fileEdit();
					break;
				case 4:
					System.out.println("******* Program finish  *******\n");
					break out;
				default:
					System.out.println("[ERROR]1부터 4사이의 숫자를 입력하길 바랍니다");
					continue out;
				}
			
			}
		}
}



