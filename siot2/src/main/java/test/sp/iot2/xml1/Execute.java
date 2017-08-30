package test.sp.iot2.xml1;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Execute {

	public static void main(String[] args){
		FileSystemResource fsr = new FileSystemResource("src/main/resources/xml1/ioc.xml");
		BeanFactory bf = new XmlBeanFactory(fsr);
		OrderInterface om = (OrderInterface)bf.getBean("om");
		om.order();
	}
}
