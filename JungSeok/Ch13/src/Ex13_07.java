
class Ex13_07 implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_07());	//Thread(Runnable r)
		
//		t.setDaemon(true);	//이 부분이 없으면 종료되지 않는다.
		t.start();
		
		for(int i=1; i<=20; i++) {
			try {
				Thread.sleep(1000);	//1초 휴식
			} catch (InterruptedException e) {}
			//1초 지나면 아래 수행, 즉 1초마다 i 출력
			System.out.println(i);
			//5초 되면 autoSave=true로 돼 autoSave()바로 수행!
			//***그 뒤로는 3초 마다 수행!!!
			if(i==5) autoSave = true;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		while(true) {	//무한루프지만 일반쓰레드가 종료되면 데몬쓰레드는 자동종료이므로 괜찮음
			try {
				Thread.sleep(3 * 1000);	//3초 휴식
			} catch (InterruptedException e) {}
			//3초 지나면 아래 수행
			//autoSave의 값이 true면 autoSave()호출
			if(autoSave) autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}

}
