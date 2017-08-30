package test.sp.iot2.anno3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

	private String id;
	private String pwd;
	private String name;
	public User(){
		
	}
//	@Autowired
//	public User(@Qualifier("id")String id, @Qualifier("pwd")String pwd, @Qualifier("name")String name){
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
//	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
	
}
