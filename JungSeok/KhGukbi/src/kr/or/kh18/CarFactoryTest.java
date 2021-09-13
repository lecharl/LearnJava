package kr.or.kh18;

class CarFactory{
	
	private static CarFactory instance = new CarFactory();
	//private static 객체생성
	
	private CarFactory() {}
	//private 생성자
	
	public static CarFactory getInstance() {
		//public static 반환타입은 클래스
//		if(instance == null) {
//			instance = new CarFactory();
//		}
		return instance;
	}
	
	public static Car createCar() {
		//마찬가지로, Car 객체를 생성할 createCar() 
		Car car = new Car();
		return car;
	}
	
}

class Car{
	private static int serialNum = 10000;
	//외부에서 못쓰게 private, 내부 객체들이 접근하게 static***
	private int carNum;
	
	public Car() {
		//외부에서 접근하게 public, 다른 내부 객체에서 Car객체생성하므로 static없음
		//차를 만들면 시리얼넘버++
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		//private인 carNum을 가져오기 위해
		return carNum;
	}
}


public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car myCar = factory.createCar();
		Car yourCar = factory.createCar();
		//반환타입이 Car이므로 맞춰야지
		System.out.println("나의 차의 넘버 : "+myCar.getCarNum());
		System.out.println("너의 차의 넘버 : "+yourCar.getCarNum());

	}

}
