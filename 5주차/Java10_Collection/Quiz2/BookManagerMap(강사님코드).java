package java10_collection.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BookManagerMap implements BookManagerMapInterface {

	private HashMap booksMap;
	
	public BookManagerMap() {
		booksMap = new HashMap();
	}
	
	public BookManagerMap(HashMap map) {
		this.booksMap = map;
	}
	
	@Override
	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}

	@Override
	public void removeBook(String bNo) {	
		booksMap.remove(bNo);
	}
	
	@Override
	public String searchBook(String title) { //entrySet() 사용
		Set bNos = booksMap.keySet();
		Iterator<String> iter = bNos.iterator();
		
		while(iter.hasNext()) {
			Book currentBook = (Book) booksMap.get(iter.next());
			
			if( title.equals(currentBook.getTitle()) ) {
				return currentBook.getbNo();
			}
		}
		
		return null;
	}
	
	@Override
	public void displayAll() {
		System.out.println("번호\t카테고리\t제목\t저자");
		
		Set bNos = booksMap.keySet();
		Iterator<String> iter = bNos.iterator();
		
		while(iter.hasNext()) {
			Book currentBook = (Book)booksMap.get(iter.next());
			
			printBook(currentBook.getbNo());
		}
		
	}
	
	@Override
	public void printBook(String bNo) {
		Book book = (Book)booksMap.get(bNo);
		if( book == null ) {
			System.out.println("없는 책입니다");
			return;
		}
		System.out.print(book.getbNo() + "\t"); //책번호
		System.out.print(getCategoryText(book.getCategory()) + "\t"); //카테고리(한글)
		System.out.print(book.getTitle() + "\t"); //제목
		System.out.println(book.getAuthor() + "\t"); //저자
	}
	
	//카테고리 이름을 반환
	private String getCategoryText(int category) {
		switch(category) {
		case 1:
			return "인문";
		case 2:
			return "자연과학";
		case 3:
			return "의료";
		case 4:
			return "기타";
		default:
			return null;
			
		}
	}
}

