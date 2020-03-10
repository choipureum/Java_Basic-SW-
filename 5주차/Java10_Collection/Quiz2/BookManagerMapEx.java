package Java10_collection.Practice2;
import java.util.*;


public class BookManagerMapEx {
	static Scanner sc =new Scanner(System.in);
 
	public static void main(String[] args) {
		BookManagerMap bp = new BookManagerMap();
		System.out.print("*** 도서 관리 프로그램 ***");
		out:
		while(true) {			
			System.out.println();
			menu();
			switch(sc.nextInt()) {
				case 1 :					
					bp.putBook(inputBook());
					break;
				case 2 :
					System.out.println("삭제할 도서번호 입력: ");
					String temp=sc.next();
					bp.removeBook(temp);
					break;
				case 3 :					
					String k=inputBookTitle();
					if(bp.searchBook(k)!=null) {
						System.out.println("도서번호 : "+bp.searchBook(k));
					}
					else {
						System.out.println("그런거 없습니다");
					}		
					break;
				case 4 :
					bp.displayAll();
					break;
				case 5 :
					System.out.println("종료");
					break out;
				default :
					System.out.println("1~5의 숫자 중 입력하세요");
					continue out;					
				}
			
		}
	}	
	public static void menu() {
		
		System.out.println("--------------------");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 삭제");
		System.out.println("3. 도서 검색출력");
		System.out.println("4. 전체 출력");
		System.out.println("5. 끝내기");	
		System.out.println();
		System.out.print("입력 : ");
	}
	
	public static Book inputBook() {		
		Book book = new Book();
		System.out.print("도서번호 : ");		
		book.setbNo(sc.next());
		System.out.print("카테고리 (도서분류코드(1.인문/2.자연과학/3.의료/4.기타)) : ");			
		book.setCategory(sc.nextInt());
		System.out.print("책이름: ");
		book.setTitle(sc.next());
		System.out.print("책저자 : ");		
		book.setAuthor(sc.next());	
		return book;
		
	}
	public static String inputBookTitle() {
		System.out.print("도서 타이틀 입력: ");
		return sc.next();
	}
	
}
//
//- 클래스명 : java10_collection.practice2.BookManagerMapEx.java
//   >> main() 포함
//	>> menu() 메소드 추가함
//	public static void menu(){}
//
//		=> 다음 내용이 출력되게 함
//		=> BookManagerMap 클래스 객체 생성함
//
//	*** 도서 관리 프로그램 ***
//
//	1. 새 도서 추가	//putBook(inputBook() 이 리턴한 객체) 실행
//	2. 도서 삭제	//removeBook(삭제할 책번호) 실행
//	3. 도서 검색출력	//searchBook(검색할 도서명) 실행 
//			=> index 리턴받아 printBook(key) 실행
//	4. 전체 출력	//displayAll() 실행
//	6. 끝내기
//
//	>>추가, 삭제, 검색에 필요한 키정보는 키보드로 입력받도록 함
//	//Book 객체의 필드값을 키보드로 입력받아 초기화하고 객체 리턴
//	+ static inputBook() : Book
//
//	//삭제 또는 검색을 위한 도서 타이틀을 키보드로 입력받아 리턴
//	+ static inputBookTitle() : String
//
//	>> 끝내기 메뉴 선택 전까지는 메뉴 반복 실행되도록 
