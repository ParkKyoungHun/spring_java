package test.sp.iot2.anno1;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("om")
public class OrderManager {
	private String name;
	@Inject
	@Qualifier("au")
	private Maker maker;
	@Autowired
	private Money money;
	
	public OrderManager(){}
	public void order(){
		money.setWon(1000);
		Car car = maker.sellCar(money);
		System.out.println(car.getName());
	}
}
