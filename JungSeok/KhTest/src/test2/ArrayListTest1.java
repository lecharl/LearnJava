package test2;

import java.util.ArrayList;

import com.kh.test.model.vo.Card;

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		
		array.add("A");
		array.add(1);
		array.add(1.5);	//�������� �ٸ� Ÿ�� �� ��!! �� ��
		array.add(true);
		//���ϱ� �ϳ� Ÿ���� �ٸ� ��� �ϳ��� ������ ����ϱ� �����?
		
		ArrayList<String> sarray = new ArrayList<String>();
		//���� �� Ÿ�Ը� �ٷ� ��� �̷���! �� �⺻���� �ȵǰ� String �� ������ Ŭ������
		//�ٸ� Ÿ���� �����ϰ� <>�� �̸� ���Ƴ��´�.
		//test2�����μ� Card�� �� �� �ִ�.
		
		ArrayList<Card> array2 = new ArrayList<Card>();
		Card card = new Card("SPADE", 4);
		array.add(card);
		//		
		
		ArrayList<String> array3 = new ArrayList<String>();
		array3.add("�ѱ�");
		array3.add("�̱�");
		array3.add("�̱�");
		array3.add("�̱�3");
		for(int i=0; i<array3.size(); i++) {
			System.out.println(array3.get(i));//get()�����´�.
		}
//		array3.remove(0);
		array3.remove("�̱�");
		System.out.println(array3);
		

	}

}
