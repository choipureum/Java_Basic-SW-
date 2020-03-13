package Java13_io.File;
import java.io.*;


public class FileEx_02 {
	public static void main(String[] args) {
		
		//절대경로방식
		//alt +enter => 속성옵션(현재 작업하는 경로를 찾아갈수 있다 -> 이거를 복붙)
					//최상위D(root Directory부터 모두 적는방법 ->절대경로
		File file1 = new File("D:\\workspace\\JavaBasic\\src\\Java13_io\\File","Hello");
			
		System.out.println("file1"+file1);
		System.out.println(file1.length()); 
		System.out.println(file1.exists()); 
		
		//상대경로 방식 : 주로사용
		// . ->현재 있는 위치 경로 D:\\workspace\\JavaBasic -> . 
		//class path로부터 파일까지 경로를 적은 것: 상대경로
		//class path : 프로그램이 실행된 위치  ->이클립스 에서는 프로젝트 폴더가 클래스패스로 적용되어있다
		
		// **절대경로는 작업환경에 따라 작동안할 수도 있다 -> 상대경로가 훨씬 안전하다
		File file2 = new File(".\\src\\Java13_io\\File","Hello");
		
		System.out.println("file2"+file2);
		System.out.println(file2.length()); 
		System.out.println(file2.exists()); 
		
		//경로 지정문자
		// . -> 현재 디렉토리
		// .. -> 부모 디렉토리
		// / -> 루트 디렉토리
		// ex) /test/folder   -> D:/test/folder
		
		// ex) ./test   ->프로그램 실행폴더/test
		
		// ex) D:/test/folder/../myfolder -> D:/test/myfolder
	}
}
