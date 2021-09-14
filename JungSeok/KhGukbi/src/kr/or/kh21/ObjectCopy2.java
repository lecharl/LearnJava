package kr.or.kh21;

import java.util.Iterator;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			library[i] = new Book();
			library[i].setBook("태백산맥");
			library[i].setAuthor("조정래");
		}
		//***깊은복사
		for(int i=0; i<copylibrary.length; i++) {
			copylibrary[i] = new Book();
			copylibrary[i].setBook(library[i].getAuthor());
			copylibrary[i].setAuthor(library[i].getAuthor());
		}
		//library 데이터 변경
		library[0].setBook("나목");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showInfo();
		}
		System.out.println("==========");
		for(Book book : copylibrary) {
			book.showInfo();
		}
		//***copylibrary는 변경안됨!!! : 깊은복사

	}

}
