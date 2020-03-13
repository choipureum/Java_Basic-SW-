package java13_io.fileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FileCopy02 {
	public static void main(String[] args) {

		// 파일 객체
		File src = new File("./src/java13_io/fileCopy/Lower.txt");
		File dest = new File("./src/java13_io/fileCopy/Upper.txt");
		
		// 입출력 스트림 객체 선언
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// 파일 입출력 보조 변수
		byte[] buf = new byte[1024]; // 버퍼
		int len = -1; // 입출력 길이(1회)
		int tot = 0; // 총 입출력 길이
		
		try {
			// 파일 입출력 스트림 개설
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
			
			// 파일 입력
			while( (len=fis.read(buf)) != -1 ) {
				
				String str = new String(buf, 0, len);
				String upper = str.toUpperCase();
				
				//파일 출력
				fos.write(upper.getBytes(), 0, len);
				fos.flush();
				
				// 파일카피 총 길이
				tot += len;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 파일스트림 개설 실패");
			System.out.println("\t>> 파일 없음");
			System.out.println("\t>> 알 수 없는 경로");
			
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 입출력 실패");
			
		} finally {
			try {
				// 스트림 닫기
				if(fis!=null)	fis.close();
				if(fos!=null)	fos.close();
				
			} catch (IOException e) {
				System.out.println("[ERROR] 파일닫기 실패");
				
			}
		}
		
		System.out.println(tot+" 바이트 복사 완료");
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
	}
}






