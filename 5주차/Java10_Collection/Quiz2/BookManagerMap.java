package Java10_collection.Practice2;

import java.util.*;

public class BookManagerMap  {
	
	private Map <String, Book> bm;
	
	
	BookManagerMap(){
		this.bm=new HashMap<String,Book>();
	}	
	
	BookManagerMap(Map bm) {
		this.bm=bm;
	}
	
	public void putBook(Book b) {
		this.bm.put(b.getbNo(), b);
	}
	
	public void removeBook(String key)  {
		boolean flag=true;		
		for(String i : bm.keySet()) {
			if(i.equals(key)) {
				this.bm.remove(key);
				flag=false;
				System.out.println("삭제완료");
				break;
			}
		}
		
		if(flag) {
			System.out.println("도서번호가 없습니다");
		}
	}
	
	public String searchBook(String bTitle) {	
		for(Map.Entry<String, Book> entry: bm.entrySet()) {
			if(entry.getValue().getTitle().equals(bTitle)) {
				return String.valueOf(entry.getKey());
			}
		}
		return null;
	}
	public void displayAll() {
		System.out.println("도서번호\t도서분류코드\t책이름\t책저자");
		for(Object i : bm.keySet()) {
			System.out.println(bm.get(i).toString());			
		}
	}
	public void printBook(String key) {
		for(Object i : bm.keySet()) {
			if(i.equals(key)) {
				System.out.println(bm.get(i).getTitle());
			}
		}
	}
}
//
//- 클래스명 : java10_collection.practice2.BookManagerMap.java
//	//Field
//	- booksMap : HashMap	//도서번호를 키로 사용함
//
//	//기본생성자 : 맵 객체 생성함
//
//	//매개변수있는 생성자 : 다른 맵을 전달받아. 
//	//		booksMap 객체의 초기값으로 생성함
//
//	//Method
//	+ putBook(book:Book) : void	//맵에 객체 추가, 도서번호를 키로 사용함
//	+ removeBook(key:String) : void	//맵에서 객체 제거
//	+ searchBook(String bTitle) : String	: entrySet() 사용
//		//도서명이 일치하는 객체의 도서번호를 리턴
//		//도서명이 객체가 맵에 없으면, null 리턴함
//	+ displayAll():void		//맵정보 모두 출력 : keySet() 사용
//	+ printBook(key:String) : void	//key에 해당하는 Book 출력
//
//
//

