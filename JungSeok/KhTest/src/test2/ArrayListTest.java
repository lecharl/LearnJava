package test2;

import java.util.ArrayList;

/*
ArrayListŬ������ Ư¡
1. arraylist�� ��Ҹ� �߰��ϸ� ���ʴ�� 0���ε��� ��ġ���� ��Ұ� �߰��Ǵ� ����
���� �������� �����̳� �ڿ������� �����͸� �߰��ϰų� ������ �� ȿ�����̴�.
���κп� ��� �߰�
��Ҹ� �߰��ϸ� �ش� �ε����� ��Ұ� ����(��������/��������)�Ǹ鼭 �߰��ȴ�.
����ϳ� �߰��� ArrayList array1 = new ArrayList();
(ArrayList��ü�� �迭�̱� ������ []�� �ʿ� ����.)


 */


public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList array1 = new ArrayList();
		
		array1.add("A");	//[0] = "A"
		array1.add("B");	//[1] = "B"
		array1.add("C");	//[2] = "C"
		array1.add("D");	//[3] = "D"
		array1.add("E");	//[4] = "E"
		System.out.println(array1);
		
		array1.remove(2);	//index=2
		System.out.println(array1);
		//�����Ǹ� ������ ��������!! ����! : �Ϲݹ迭�� �ٸ���
		//[0]=A [1]=B [2]=D [3]=E
		//�׷��� �ǹ����� �̰� ���� ���δ�.
		
		array1.add(2, "C");	//index=2 �� ���ڿ��� �־��.
		//������ �ڷ� �о������!! �ٸ���2
		System.out.println(array1);
		array1.add(2, "G");
		System.out.println(array1);
		
		//���� ������ �����Ӱ� �ٿ��� �ÿ��� �� �� �ִ�.
	}

}
