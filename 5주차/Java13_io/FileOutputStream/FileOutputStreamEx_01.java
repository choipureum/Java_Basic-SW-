package Java13_io.FileStream;
import java.io.*;


public class FileOutputStreamEx_01 {
	public static void main(String[] args) {
		
		//출력 대상 파일
		File file = new File("./src/Java13_io/FileStream/","Result");
		System.out.println("파일이 존재하는가? "+(file.exists()?"예":"아니요"));
		
		FileOutputStream fos = null; //파일 출력 스트림 객체
		
		try {
//			fos= new FileOutputStream(file); //파일이 없으면 파일을 만든다//Result.txt 를만듬
			fos= new FileOutputStream(file,true); //: 추가모드 -> 파일의 끝에 추가로 기록
//			fos= new FileOutputStream(file,false); : 쓰기모드 ->파일의 처음부터 기록
			String str= "Hello FileStream\n"; //출력데이터
			fos.write(str.getBytes(),0,str.length()); //파일 출력
			fos.flush(); //버퍼 비우기
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null)fos.close(); //스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
