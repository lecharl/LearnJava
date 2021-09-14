package kr.or.kh21;

class Book{
	String book;
	String author;
	
	Book(){}
	
	Book(String book, String author){
		this.book = book;
		this.author = author;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
	
	public void showInfo() {
		System.out.println(book+", "+author);
	}
	
}


public class ObjectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			library[i] = new Book("태백산맥", "조정래");
		}
		
		//**Arraycopy 얕은복사
		System.arraycopy(library, 0, copylibrary, 0, 5);
		
		library[0].setBook("나목");
		library[0].setAuthor("박완서");
		
		//for(자료형 변수명 : 배열)***
		for(Book book : library) {
			book.showInfo();
		}
		System.out.println("==========");
		for(Book book : copylibrary) {
			book.showInfo();
		}
		//***얕은복사 : 주소복사이므로 하나만 변경하면 다같이 변경!
		
	}

}
