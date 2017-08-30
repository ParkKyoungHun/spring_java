package test.sp.iot2.anno2;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Execute {
	@Autowired
	List<Worker> workerList;
	Map<String,Object> map;
	
	Worker w;

	@Autowired
	public Execute(@Qualifier("developer")Worker w){
		this.w = w;
	}

	@Autowired
	@Qualifier("map")
	public void setMap(Object m){
		this.map = (Map)m;
	}
	
	public void setWorker(Worker w){
		this.w = w;
	}
	
	public static void main(String[] args){
		ApplicationContext factory;
		String path = "classpath:/anno2/ioc.xml";
		factory = new ClassPathXmlApplicationContext(path);
		Execute e = (Execute) factory.getBean("execute");
		for(Worker w : e.workerList){
			w.goToWork();
			w.work();
			w.getOffWork();
		}
		e.w.work();
		
		System.out.println(e.map);
	}
}
