package test.sp.iot2.xml2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

public class Designer implements Worker {

	public void work() {
		System.out.println("디자이너가 일을 합니다.");
	}

	public void goToWork() {
		System.out.println("디자이너가 출근.");
	}

	public void getOffWork() {
		System.out.println("디자이너가 퇴근~ 신나게 노는거야!아싸!");
	}

}
