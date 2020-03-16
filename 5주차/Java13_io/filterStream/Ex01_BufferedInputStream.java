package Java13_io.filterStream;
import java.io.*;

public class Ex01_BufferedInputStream {
	public static void main(String[] args) {
		
		//입력대사 파일 객체
		File file = new File("D:/file/","Source.txt");
		System.out.println(file.exists());
		
		//파일 입력 스트림 객체
		FileInputStream fis = null; //1차 스트림
		BufferedInputStream bis = null; //2차스트림
		
		//파일입력관련 보조 변수
		byte [] buf = new byte[1024]; //데이터 임시저장소
		int len =0; //입력데이터 길이
		
		try {
//			fis = new FileInputStream(file);// File ->FileInputStream
//			bis = new BufferedInputStream(fis);
			bis = new BufferedInputStream(new FileInputStream(file));
			while((len = bis.read(buf))!=-1) {
				System.out.println(new String(buf,0,len));
			}			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				//스트림 닫기
				if(fis!=null) fis.close();
				if(bis!=null) bis.close();			
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
