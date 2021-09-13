package kr.or.kh18;

class CarFactory{
	
	private static CarFactory instance = new CarFactory();
	//private static ��ü����
	
	private CarFactory() {}
	//private ������
	
	public static CarFactory getInstance() {
		//public static ��ȯŸ���� Ŭ����
//		if(instance == null) {
//			instance = new CarFactory();
//		}
		return instance;
	}
	
	public static Car createCar() {
		//����������, Car ��ü�� ������ createCar() 
		Car car = new Car();
		return car;
	}
	
}

class Car{
	private static int serialNum = 10000;
	//�ܺο��� ������ private, ���� ��ü���� �����ϰ� static***
	private int carNum;
	
	public Car() {
		//�ܺο��� �����ϰ� public, �ٸ� ���� ��ü���� Car��ü�����ϹǷ� static����
		//���� ����� �ø���ѹ�++
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		//private�� carNum�� �������� ����
		return carNum;
	}
}


public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car myCar = factory.createCar();
		Car yourCar = factory.createCar();
		//��ȯŸ���� Car�̹Ƿ� �������
		System.out.println("���� ���� �ѹ� : "+myCar.getCarNum());
		System.out.println("���� ���� �ѹ� : "+yourCar.getCarNum());

	}

}
