package test.sp.iot2.anno4;

import java.util.List;
import java.util.Scanner;

public class GameStage {	
	InputBallNum ibn = new InputBallNumImpl();
	BallGame bg = new BallGameImpl();
	
	public static void main(String[] args){
		GameStage gs = new GameStage();
		gs.ibn.setScanner(new Scanner(System.in));
		gs.bg.makeBallNum();
		while(!gs.bg.getCheck()){
			List<Integer> numList = gs.ibn.inputNumList();
			String result = gs.bg.checkNum(numList);
			System.out.println(result);
		}
		gs.bg.printBallNum();
	}
}
