package test.sp.iot2.anno3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam {
	Map<String, String> map = new HashMap<String, String>();
	
	public Map<String, String> getMap(){
		Map<String, String> map = new HashMap<String, String>();
		return map;
	}
	
	public void printMap(){
		System.out.println(map);
	}
	
	public static void main(String[] args){
		Exam e = new Exam();
		Map<String, String> map = e.getMap();
		map.put("key", "key");
		e.printMap();
	}
}
