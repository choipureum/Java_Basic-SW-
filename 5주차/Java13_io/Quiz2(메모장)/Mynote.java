package Quiz;
import java.util.*;
import java.io.*;


public class Mynote {
	private final Scanner sc = new Scanner(System.in);
	
	//파일저장
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String str = null;
		String title =null;
		System.out.println("저장할 내용을 입력하세요[exit=반복종료] : ");
		while(true) {
			str=sc.nextLine();
			if(str.equals("exit")) {
				System.out.println("[입력종료]");
				break;
			}
			sb.append(str+"\r\n");	//개행과 앞쪽보내기
		}
		System.out.print("저장하시겠습니까?(y/n) : ");
		//저장N이면 반복문수행
		out:
		while(true) {
			String fin = sc.next(); //y,n받기

			if(fin.equalsIgnoreCase("N")) {
				System.out.println("[저장없이 종료]");
				return ;
			}
			else if(fin.equalsIgnoreCase("Y")) {
				while(true) {
					System.out.print("저장할 파일명 : ");
					sc.nextLine(); //버퍼비우기
					title = sc.nextLine(); //파일 이름
					File file  = new File(".src/Quiz/note/"+title+".txt");
					if(!file.exists()) {
						break out;
						}
					else {
						//생성하고자 하는 파일명이 중복될때 에러발생!그리고 다시 파일명 받기
						System.out.println("[ERROR] 이름이 중복됩니다!");
						continue;
					}
					}
				}
			else {
				System.out.print("[ERROR]y/n으로 다시 입력하세요(대소문자 상관없음) : ");
				continue;
			}			
		}
		System.out.println("[Complete]"+title+".txt 에 성공적으로 저장되었습니다!");
		PrintWriter  bw=null; //프린트 객체 생성		
		try {
			bw = new PrintWriter(new FileWriter("./src/Quiz/note/"+title+".txt/"),true);
			bw.println(sb);
			
		} catch (Exception e) {
			System.out.println("[Error]: 경로를 찾을 수 없습니다");
		}finally {
			System.out.println();
			bw.close();
		}		
	}
	//파일 열기
	public void fileOpen() {
		System.out.print("오픈할 파일명을 입력하세요 : ");
		String title = sc.nextLine(); //파일제목
		BufferedReader br= null;
		String str = null; //입력받을 스트링
		int total =0; //문자수		
		try {
			br= new BufferedReader(new FileReader("./src/Quiz/note/"+title+".txt"));
			System.out.println();
			System.out.println("< "+title+".txt > \r\n");
			while(( str = br.readLine())!=null) {
				System.out.println(str);
			}		
			System.out.println("-----------------");
			System.out.println("출력완료\n");
		} catch (Exception e) {
			System.out.println("[Error]: 파일을 찾을 수 없습니다");
			fileOpen();
		} finally {
			try {								
				if(br!=null)br.close();			
			} catch (Exception e) {
				System.out.println("[Error]");
			}
		}
		
	}
	//파일수정
	public void fileEdit() {
		System.out.print("수정할 파일명을 입력하세요 : ");
		String title = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		BufferedReader br=null; //입력
		PrintWriter bw =null; //출력
		String str = null;
		
		try {
			File file = new File("./src/Quiz/note/"+title+".txt");
			//파일명이 존재하지 않을때 새롭게 파일작성
			if(!file.exists()) {
				System.out.println("[Error] 존재하지 않는 파일명!");
				System.out.println("-----------------------");
				System.out.println("새롭게 파일을 작성합니다");
				System.out.println("-----------------------");
				fileSave();
				return;
			}
			br= new BufferedReader(new FileReader(file));	
			bw= new PrintWriter(new FileWriter(file,true),true);
			//입력받고 출력
			System.out.println("--현재"+title+".txt 파일 내용--");
			while((str = br.readLine())!=null) {
				System.out.println(str);			
			}
			
			System.out.println("파일에 추가할 내용을 입력하세요[exit : 종료] : ");
			while(true) {
				str=sc.nextLine();
				if(str.equals("exit")) {				
					System.out.println("[입력종료]");
					break;
				}
				sb.append(str+"\r\n");		 //개행까지	
			}
			System.out.print("저장하시겠습니까?(y/n) : ");
			out:
			while(true) {
				String fin = sc.next(); //y,n받기

				if(fin.equalsIgnoreCase("N")) {
					System.out.println("[저장없이 종료]");
					return ;
				}
				else if(fin.equalsIgnoreCase("Y")) {											
							break out;
							}
						else {
							//생성하고자 하는 파일명이 중복될때 에러발생!그리고 다시 파일명 받기
							System.out.println("[ERROR] 이름이 중복됩니다!");
							continue;
						}
				}
			bw.print(sb);
			System.out.println("[Complete]수정된 저장완료");
		}catch(Exception e) {
			System.out.println("[ERROR]발생!");
		}finally {
			bw.close();
			try {
				System.out.println();
				if(br!=null)br.close();
			} catch (IOException e) {
				System.out.println("[ERROR]발생!");
			}
		}
		
	}
}

