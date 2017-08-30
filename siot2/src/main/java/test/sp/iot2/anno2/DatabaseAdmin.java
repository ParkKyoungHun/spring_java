package test.sp.iot2.anno2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(value=3)
public class DatabaseAdmin implements Worker {

	public void work() {
		System.out.println("DBA가 일을 합니다.");
	}

	public void goToWork() {
		System.out.println("DBA가 출근.");
	}

	public void getOffWork() {
		System.out.println("DBA가 퇴근~ 신나게 노는거야!아싸!");
	}

}
