package kr.or.kh21;

import java.util.Iterator;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			library[i] = new Book();
			library[i].setBook("�¹���");
			library[i].setAuthor("������");
		}
		//***��������
		for(int i=0; i<copylibrary.length; i++) {
			copylibrary[i] = new Book();
			copylibrary[i].setBook(library[i].getAuthor());
			copylibrary[i].setAuthor(library[i].getAuthor());
		}
		//library ������ ����
		library[0].setBook("����");
		library[0].setAuthor("�ڿϼ�");
		
		for(Book book : library) {
			book.showInfo();
		}
		System.out.println("==========");
		for(Book book : copylibrary) {
			book.showInfo();
		}
		//***copylibrary�� ����ȵ�!!! : ��������

	}

}
