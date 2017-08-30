package test.sp.iot2.anno1;

import org.springframework.stereotype.Component;

@Component
public class Money {

	private int won;
	public Money(){
	}
	public Money(int won){
		this.won = won;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	
}
