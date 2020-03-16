package Java13_io.filterStream;
import java.io.*;
import java.util.List;

public class Ex_08_02_ObjectInputStream {
	public static void main(String[] args) {
		File file  = new  File("./src/Java13_io/filterStream/","ObjectTest2.ser"); //파일객체 선언
		//스트림객체
				ObjectInputStream os = null;
				//Object 를 이용해서 입력받고 출력하기
				try {
					os= new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
					//파일 읽기
					List list=(List)os.readObject();
					for(Object i : list) {
						System.out.println(i);
					}				
				} catch (IOException e) {			
					e.printStackTrace(); 
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}finally {
					try {
						if(os!=null) os.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
