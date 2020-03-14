package Java13_io.Quiz;
import java.io.*;


public class FileCopyQuiz_2 {
	public static void main(String[] args) {
		File file1 = new File("D:/file/","Lower.txt");
		File file2 = new File("D:/file/","Upper.txt");
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
				str+=new String(b,0,len).toUpperCase();
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
//+ 파일 복사2, File Copy2
//- Lower.txt 파일을 Upper.txt로 복사한다
//
//- Lower.txt에서 읽은 문자가 소문자라면 대문자로 변환한다 
//

