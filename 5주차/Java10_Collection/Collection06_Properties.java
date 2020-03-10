
import java.io.*;
import java.util.*;

public class Collection06_Properties {
	public static void main(String[] args) throws Exception {
		
		Properties prop= new Properties(); //Properties 객체
		//파일경로에서 파일을 읽어온다
		try {
			//파일의 정보 ->Properties로 불러오기
			prop.load(new FileReader("./src/Java10_collection/user.properties"));
			// ./ =현재위치를 나타내는 경로
			// 자바는 현재위치를 클래스패스(Class Path)로 제공한다
			// Class Path : 프로그램이 실행된 위치 ->프로젝트 폴더
			System.out.println(prop); //->file을 불러온다(map형태로 key, value로 불러온다)
			//{password=123, username=Alice}
			//파일은 한줄에 하나의 key와 value쌍이 좋다
			
			//---------------------------------
			//속성 값 가져오기
			String user = prop.getProperty("username"); //get함수 인데 properties는 getPropertiey가 기본이다
			System.out.println(user); //Alice
			
			String pass = prop.getProperty("password");
			System.out.println(pass); //123
			
			//로그인 인증 Authentication, Auth
			if("abc".equals(user) && "123".equals(pass)) {
				System.out.println("로그인 성공"); //성공
			}
			else {
				System.out.println("로그인 실패");
			}
			//----------------------------
			user ="abc";
			pass="123";
			
			prop.setProperty("username", user); // prop set하기
			prop.setProperty("password", pass);
			System.out.println(prop); 
			//파일은 바뀌지 않음 메모리만 바꿈
			
			prop.store(new FileWriter("./src/Java10_collection/user.properties"),"user information");
			//Properties의 정보 -> 파일 기록 //코멘트가 주석으로 들어가고 시간도 주석으로 들어간다
			
			//---------------------------------------
			
			//시스템이 가지고 있는 정보 //시스템 정보 Properties얻기
			Properties sysProp = System.getProperties();
			System.out.println("---자바 버전---");
			System.out.println(sysProp.getProperty("java.version")); //java.version이라는 key값의 value출력
			
			System.out.println("---OS 이름---");
			System.out.println(sysProp.getProperty("os.name"));
			
			System.out.println("---사용자 계정---");
			System.out.println(sysProp.getProperty("user.name"));
			
			System.out.println("---sysProp의 key 목록---");
			
			for(Object i : sysProp.keySet()) {
				System.out.println(i);
			}
			}catch(FileNotFoundException e) {			
				e.getMessage();
			}catch(IOException e) {
				e.printStackTrace();
			}	
		
	}
}

//< class Properties >
//- Hashtable 하위 클래스
//- key,value의 데이터타입이 String으로 제한되어 있음(String)만 넣을 수 있다
//
//	- 프로그램의 옵션정보, 데베 연결 정보, 다국어정보(Locale) 등등 
// 설정파일을 프로그램이 읽고 저장할 때 사용할 수 있게 해준다
//(동적 저장은 프로그램이 종료되면 모두 데이터가 날아가버리는데 이같은 단점해결)
//
//-주로 .properties 확장자를 가진다
