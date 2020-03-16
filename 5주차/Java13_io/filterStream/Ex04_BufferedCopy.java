package Java13_io.filterStream;

import java.io.*;

public class Ex04_BufferedCopy {
	public static void main(String[] args) {
		
		//BufferedStream을 이용한 파일 복사
		//Source.txt ->Dest.txt 복사
		//파일 복사완료 후 몇바이트 복사했는지 출력하기
		
		File file = new File("D:/file/","Source.txt");
		File file2  = new File("D:/file/","DestCopy.txt");
		FileInputStream fis = null; //1차 스트림
		BufferedInputStream bis = null; //2차스트림
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		//파일입력관련 보조 변수
		byte [] buf = new byte[1024]; //데이터 임시저장소
		int len =0; //입력데이터 길이
		long total=0;
		try {
			// File ->FileInputStream
			bis = new BufferedInputStream(new FileInputStream(file));
			 //true, false가능
			bos= new BufferedOutputStream(new FileOutputStream(file2));
			
			while((len = bis.read(buf))!=-1){
				String str= new String(buf,0,len);
				bos.write(str.getBytes());
				bos.flush();
				total+=len;
				//bos.write(buf,0,len)
				//bos.flush(); 이방법도 있음
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos!=null)bos.close();
				if(bis!=null)bis.close();
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("복사완료 ");
		System.out.println("총 출력 용량 : "+total+"Byte");
}
}


















