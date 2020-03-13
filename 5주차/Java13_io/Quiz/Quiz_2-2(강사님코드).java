package java13_io.fileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy02_2 {
	public static void main(String[] args) {
		
		// 파일 객체
		File src = new File("./src/java13_io/fileCopy/Lower.txt");
		File dest = new File("./src/java13_io/fileCopy/Upper.txt");
		
		// 입출력 스트림 객체 선언
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// 파일 입출력 보조 변수
		int in = 0; // 입출력 길이(1회)
		int tot = 0; // 총 입출력 길이
		
		try {
			// 파일 입출력 스트림 개설
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
			
			// 파일 입력
			while( (in=fis.read()) != -1 ) {
				
				//방법1
				int upper = Character.toUpperCase(in);
				
				//방법2
//				int upper = in;
//				if( in >= 'a' && in <= 'z' ) {
//					upper -= 32;
//				}
				
				//파일 출력
				fos.write(upper);
				fos.flush();
				
				// 파일카피 총 길이
				tot++;
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










