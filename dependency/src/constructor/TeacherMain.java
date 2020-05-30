package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherMain {

	public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Teacher.xml");  
	Teacher object = context.getBean("teach",Teacher.class);
	object.dispaly();

	}
}
