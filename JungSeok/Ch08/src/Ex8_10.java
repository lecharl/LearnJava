import java.io.File;

public class Ex8_10 {

	public static void main(String[] args) {
		try {
			File f = createfile(args[0]);	//여기서 오류 발생O/X
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
			//File클래스의 getName():파일에 이름을 반환. 파일이름만 String으로 변환
		} catch (Exception e) {
			System.out.println(e.getMessage()+" 다시 입력해 주십시오.");
			//아래 메소드가 던진 Exception객체 잡음
		}

	}
	//파일을 생성하는 메소드
	static File createfile(String fileName) throws Exception {
		if((fileName == null) || (fileName.equals(""))) {
			throw new Exception("파일이름이 유효하지 않습니다.");
			//"에러메세지"가 담긴 예외객체Exception 던짐 : 예외발생시키기
			//getMessage() = "에러메세지"
		}
		File f = new File(fileName);	
		//진짜로 파일생성할 때 이렇게 객체생성함. 저 안은 파일이름
		f.createNewFile();	//File클래스의 creatNewFile()메소드
		//파일생성하는 메소드. boolean반환인데 쓸일 없으므로 받는 변수 없음
		return f;	//그 주소 반환
	}

}
