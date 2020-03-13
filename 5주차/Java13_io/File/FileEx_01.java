package Java13_io.File;

import java.io.*;

public class FileEx_01 {
	public static void main(String[] args) {
		
		//class File ->파일정보를 다룬다 
		// 파일의 입출력 대상으로 사용할 수 있다		
		File file1  =new File("파일의 경로","파일의 이름"); //이 방식을 사용한다
		File file2  =new File("D:/file/","test.txt"); // \는 제어문자로 알고있다 -> \를 나타내려면 2번씩 써줘야된다
													// 그래서 그냥 복붙말고  /그냥 슬래시 적어도 된다
		System.out.println("file2 : "+file2);
		System.out.println(file2.length()); //파일의 길이 //0
		System.out.println(file2.exists()); //파일이 존재하는가 //false
		//실제 파일로 연결안되도 된다
		
		File file3  =new File("D:/file/","file.txt");
		System.out.println("file3 : "+file3);
		System.out.println(file3.length()); //
		System.out.println(file3.exists()); //
	}
}
