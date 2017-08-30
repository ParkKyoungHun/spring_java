package test.sp.iot2.xml1;

public class OrderManager implements OrderInterface{

	private Kia kia;
	
	public OrderManager(){
	}
	
	public void setKia(Kia kia){
		this.kia = kia;
	}
	
	public void order(){
		Money m = new Money(100000);
		Car c = this.kia.sellCar(m);
	}
}
