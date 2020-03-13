package Java13_io.File;
import java.io.*;

public class FileEx_03 {
	public static void main(String[] args) {
		
		//class File의 생성자 확인하기
		
		//	File(String path, String filename) //추천(여기 3가지는 무엇을 쓰든 괜찮다)
		File file1 = new  File("./src/Java13_io/File/","Hello");
		//	File(File path, String filename) 
			
		//  File(String Filepath)
		File file2 = new  File("./src/Java13_io/File/Hello.txt");
		System.out.println("디렉토리인가? : "+file2.isDirectory());
		//디렉토리 : 폴더인가? -->false (텍스트 파일이므로)		
	}
}
