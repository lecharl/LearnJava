import java.util.Arrays;
import java.util.Scanner;

public class NUM2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���ڿ�: ");
        String str1 = sc.nextLine();
        String[] array = str1.split("");
        for(int i = 0;i<array.length;i++) {
            //System.out.print(array[i]);
        }
        System.out.print("����: ");
        String selectChar = sc.nextLine();
        int num = 0;
        System.out.print(str1+"�� "+selectChar+"�� �����ϴ� ��ġ(�ε���) : ");
        for(int i = 0; i<array.length; i++) {
            if(selectChar.equals(array[i])) {
                num++;
//                System.out.print(str1+"�� "+selectChar+"�� �����ϴ� ��ġ(�ε���) : "+i+" "+"\n");
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(selectChar+" ���� : "+num);
    }
}