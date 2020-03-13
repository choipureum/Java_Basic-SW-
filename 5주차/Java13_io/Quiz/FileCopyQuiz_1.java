package Java13_io.Quiz;
import java.io.*;

public class FileCopyQuiz_1 {
	public static void main(String[] args) {
			
	File file1 = new File("D:/file/","Lower.txt");
	File file2 = new File("D:/file/","Dest.txt");
	
	byte [] b = new byte[1024]; //입력데이터
	//파일 입력 보조 변수
	int len= -1; //입력데이터
	int total=0; //총입력길이	
	FileInputStream fis = null;
	FileOutputStream fos = null;
	String str="";
	
	try {
		fis= new FileInputStream(file1);
		fos = new FileOutputStream(file2,true);
		while((len = fis.read(b))!=-1) {
			str+=new String(b,0,len);
			total+=len;
			}
		fos.write(str.getBytes(),0,str.length());	
		System.out.println("복사완료, "+ total+"Byte");
		} catch (IOException e) {	
			e.printStackTrace();
		}finally {		
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		
		
	}	
	}
}

//+ 파일 복사, File Copy
//- Source.txt 파일을 Dest.txt 파일로 복사한다
//
//- 프로그램 절차
//
//	1. 파일 객체 생성 ( Source.txt, Dest.txt )
//	2. 파일 입력,출력 스트림 객체 선언
//	3. byte[1024] 버퍼 생성
//
//	4. 파일 입출력 스트림 객체 생성
//	5. read(byte[]) , write(byte[], int, int) 를 이용하여 복사
//	  단, 5번은 while문을 이용하여 파일의 끝까지 복사되도록함
//	  추가적으로, "복사 완료, ?? Byte"라고 출력
//	6. 스트림 close()
//
//	-> 4, 5, 6 예외처리 적절히
//	-> e.printStackTrace() 지우고 직접 상황 출력할것
//	->	ex) [ERROR] 파일스트림 생성 실패
