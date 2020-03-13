package Java13_io.FileStream;
import java.io.*;

public class FileInputStreamEx_01 {
	public static void main(String[] args) {
		
		//입력 대상 파일
		File file1 = new File("./src/Java13_io/File/","Hello");
		System.out.println("파일이 존재하는가? :"+(file1.exists()?"예":"아니요"));
		
		FileInputStream fis = null; //파일 입력스트림 객체
		
		//파일 입력 보조 변수
		int in = -1; //입력데이터
		int len=0; //입력 받은 길이
		StringBuilder sb = new StringBuilder(); //입력한 데이터 저장소
		
		try {
			fis = new FileInputStream(file1);
			while((in = fis.read())!=-1) {
				sb.append((char)in); //catch 코드 하나 더추가
				len++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close(); //스트림 닫기
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		System.out.println("입력받은 길이 : "+len);
		System.out.println(sb); 
	}
}
