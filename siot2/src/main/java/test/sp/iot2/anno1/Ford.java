package test.sp.iot2.anno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ford implements Maker{
	@Autowired
	private Car car;
	public Ford(){}
	
	public Car sellCar(Money money){
		System.out.println("포드회사에서" + money.getWon() + "원에 차 매매");
		car.setName("Mustang");
		return car;
	}
}
