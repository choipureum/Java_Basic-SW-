package Java13_io.filterStream;
import java.io.*;


public class Ex07_01_ObjectOutputStream {
	public static void main(String[] args) {
		File file  = new  File("./src/Java13_io/filterStream/","ObjectTest.ser"); //파일생성
		
		ObjectOutputStream os = null;
		try {
			os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		
			//출력 대상 객체 생성
			Point p1 = new Point(11,22);
			Point p2 = new Point(111,222);
			Point p3 = new Point(1111,2222);
			
			//출력
			os.writeObject(p1);
			os.writeObject(p2);
			os.writeObject(p3);
			os.flush();
			//에러발생 : 직렬화안되는 Object를 넣으면 에러발생 
			//직렬화 시키려면 ? -> 해당 객체에 Serializable을 상속받는다

			
		} catch (IOException e) {			
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
class Point implements Serializable{ //{
	private int x;
	private int y;
	
	public Point(int x,int y) {
		setX(x);
		setY(y);
	}
	
	
	//getter setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point : x="+getX()+" y="+getY();
	}
	
}
