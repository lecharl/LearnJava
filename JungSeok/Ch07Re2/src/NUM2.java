import java.util.Arrays;
import java.util.Scanner;

public class NUM2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열: ");
        String str1 = sc.nextLine();
        String[] array = str1.split("");
        for(int i = 0;i<array.length;i++) {
            //System.out.print(array[i]);
        }
        System.out.print("문자: ");
        String selectChar = sc.nextLine();
        int num = 0;
        System.out.print(str1+"에 "+selectChar+"가 존재하는 위치(인덱스) : ");
        for(int i = 0; i<array.length; i++) {
            if(selectChar.equals(array[i])) {
                num++;
//                System.out.print(str1+"에 "+selectChar+"가 존재하는 위치(인덱스) : "+i+" "+"\n");
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(selectChar+" 개수 : "+num);
    }
}