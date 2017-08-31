package test.sp.iot2.anno1;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

@Named
public class Hyundai implements Maker{
	
	private Car car1 = new Car();
	public Hyundai(){}
	
	public Car sellCar(Money money){
		System.out.println("현대회사에서" + money.getWon() + "원에 차 매매");
		car1.setName("Sonata");
		return car1;
	}
}
