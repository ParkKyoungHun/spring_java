package test.sp.iot2.xml1;

public class Exam {

	public static void main(String[] args){
		Object s = new String("object");
		Object i = new Integer(3);
		Object b = new Boolean(true);
		
		String s2 = new String("object2");
		System.out.println(s2.length());
		System.out.println(((String)s).length());
	}
}
