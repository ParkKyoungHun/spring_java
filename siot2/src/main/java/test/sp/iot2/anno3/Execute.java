package test.sp.iot2.anno3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


@Service("ex")
public class Execute {
	@Autowired
	UserService us;
	
	static User user;
	
	
	public static void main(String[] args){
		ApplicationContext factory;
		String path = "anno3/ioc.xml";
		factory = new ClassPathXmlApplicationContext(path);
		Execute e = (Execute) factory.getBean("execute");	
		user = (User)factory.getBean("user");	
		user.setId("test");		
		user.setPwd("test");		
		user.setName("test");
		String result = e.us.login(user);
		System.out.println(result);
	}
}
