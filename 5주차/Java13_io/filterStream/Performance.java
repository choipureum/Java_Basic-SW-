package Java13_io.filterStream;
import java.io.*;

public class Ex02_Performance {
	public static void main(String[] args) {
		
		//성능 평가, Performance Evaluation
		// 알고리즘 시작 전 현재시간 체크 ->start
		// 알고리즘 시작 후 현재시간 체크 ->end
		// 둘의 차이를 구한다 -> 수행시간 : end-start
		
		//시간구하기(시간복잡도)
		long start=System.currentTimeMillis(); // 현재시간을 밀리초로 변환 //반환값이 long타입		
		long end=System.currentTimeMillis();
		//여기에 수행시간을 측정할 알고리즘을 작성함
		
		//Ex_01수행시간 측정
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
					fis = new FileInputStream(file);// File ->FileInputStream
					bis = new BufferedInputStream(fis);
//					bis = new BufferedInputStream(new FileInputStream(file));
					start = System.currentTimeMillis();
					while((len = bis.read(buf))!=-1) {	}					
					end = System.currentTimeMillis();
					System.out.println(end-start); 
					System.out.println((end-start)/(double)1000); //초단위로 확인
					fis = new FileInputStream(file);// File ->FileInputStream
					bis = new BufferedInputStream(fis);
//					bis = new BufferedInputStream(new FileInputStream(file)); //리셋
					start = System.currentTimeMillis();
					while((len = fis.read(buf))!=-1) {	}	
					end = System.currentTimeMillis();
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
				System.out.println(end-start); 
				System.out.println((end-start)/(double)1000); //초단위로 확인	
	}
}
