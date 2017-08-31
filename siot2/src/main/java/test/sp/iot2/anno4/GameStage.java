package test.sp.iot2.anno4;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import test.sp.iot2.anno3.Execute;

@Service
public class GameStage {
	InputBallNum ibn;
	BallGame bg;
	
	public void setIbn(InputBallNum ibn){
		this.ibn = ibn;
	}
	
	public void setBg(BallGame bg){
		this.bg = bg;
	}
	
	public static void main(String[] args){

		ApplicationContext factory;
		String path = "anno4/ioc.xml";
		factory = new ClassPathXmlApplicationContext(path);
		GameStage gs = (GameStage) factory.getBean("gs");
		gs.bg.makeBallNum();
		while(!gs.bg.getCheck()){
			List<Integer> numList = gs.ibn.inputNumList();
			String result = gs.bg.checkNum(numList);
			System.out.println(result);
		}
		gs.bg.printBallNum();
	}
}
