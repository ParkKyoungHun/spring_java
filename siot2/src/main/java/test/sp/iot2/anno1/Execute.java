package test.sp.iot2.anno1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args){
		ApplicationContext factory;
		String path = "classpath:/anno1/ioc.xml";
		factory = new ClassPathXmlApplicationContext(path);
		OrderManager om = (OrderManager)factory.getBean("om");
		om.order();
	}
}
