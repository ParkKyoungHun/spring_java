package test.sp.iot2.xml1;

public class Kia {
	public Kia(){
	}
	
	public Car sellCar(Money money){
		System.out.println("기아회사에서 " + money.getWon() + "을 받고 차를 팔았습니다.");
		Car car = new Car("K7");
		return car;
	}
}
