import java.util.Scanner;

public class Ex5_10 {

	public static void main(String[] args) {
		String[][] words = {
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"integer", "����"}
		};
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			String answer = scan.nextLine();
			if(answer.equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ "+words[i][1]+"�Դϴ�.");
			}
			
		}
		scan.close();

	}

}
