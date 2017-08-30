package test.sp.iot2.xml2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {	
	Worker w;
	public Execute(Worker w){
		this.w = w;
	}

	public void setWorker(Worker w){
		this.w = w;
	}
	
	public static void main(String[] args){
		ApplicationContext factory;
		String path = "classpath:/xml2/ioc.xml";
		factory = new ClassPathXmlApplicationContext(path);
		Execute e = (Execute) factory.getBean("ex");
		e.w.work();
	}
}
