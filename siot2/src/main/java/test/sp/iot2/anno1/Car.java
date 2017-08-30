package test.sp.iot2.anno1;

import javax.inject.Named;

@Named
public class Car {
	private String name;
	public Car(){}
	
	public Car(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
