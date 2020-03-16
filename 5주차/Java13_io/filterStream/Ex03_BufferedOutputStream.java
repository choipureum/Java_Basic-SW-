package Java13_io.filterStream;
import java.io.*;

import sun.java2d.pipe.BufferedBufImgOps;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {
		
		
		//출력 대상 파일 객체
		File file = new File("./src/Java13_io/filterStream/","BufferedOut.txt");
		
		//파일 출력 스트림 객체
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos= new FileOutputStream(file,true); //true, false가능
			bos= new BufferedOutputStream(fos);
			
			bos.write("Orange".getBytes()); //파일쓰기
			bos.flush();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}finally {			
				try {
					//스트림닫기 -입력과 반대로 버퍼닫고 파일닫기
					if(bos!= null)bos.close();
					if(fos!=null) fos.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
			
		}
		
		
	}
}
