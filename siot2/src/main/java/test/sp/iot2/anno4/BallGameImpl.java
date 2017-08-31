package test.sp.iot2.anno4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;
@Service
public class BallGameImpl implements BallGame{

	List<Integer> numList = new ArrayList<Integer>();
	private boolean check = false;
	
	public boolean getCheck(){
		return check;
	}
	
	public String checkNum(List<Integer> numList) {
		String result = ""; 
		for(int i=0, max=numList.size();i<max;i++){
			int idx = this.numList.indexOf(numList.get(i));
			if(idx!=-1){
				if(i==idx){
					result +="1s";
				}else{
					result +="1b";
				}
			}
		}
		if(result.equals("1s1s1s")){
			this.check = true;
			result = "win";
		}else if(result.equals("")){
			result = "out";
		}
		return result;
	}

	public void makeBallNum() {
		Random rn = new Random();
		while(numList.size()<3){
			int num = rn.nextInt(10)+1;
			if(numList.indexOf(num)==-1){
				numList.add(num);
			}
		}
	}
	
	public void printBallNum(){
		for(Integer i:numList){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args){
		BallGameImpl bgi = new BallGameImpl();
		bgi.makeBallNum();
		bgi.printBallNum();
	}

}
