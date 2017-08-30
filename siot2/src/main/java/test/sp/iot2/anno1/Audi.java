package test.sp.iot2.anno1;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

@Named("au")
public class Audi implements Maker{
	@Autowired
	private Car car;
	public Audi(){}
	
	public Car sellCar(Money money){
		System.out.println("아우디회사에서" + money.getWon() + "원에 차 매매");
		car.setName("A6");
		return car;
	}
}
