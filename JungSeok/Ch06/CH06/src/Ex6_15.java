
public class Ex6_15 {

	public static void main(String[] args) {
		// cv초기화 방법인 static{} 사용하기
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}

	}

	static int[] arr = new int[10];		// 10칸짜리 배열 생성
	
	static {		// static{} : cv 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
			// 1이상 10이하의 정수를 랜덤하게 뽑아서 배열에 넣기
		}
	}

}
