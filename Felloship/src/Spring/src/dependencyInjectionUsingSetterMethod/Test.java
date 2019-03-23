package dependencyInjectionUsingSetterMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	 public static void main(String[] args) {  
         ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
         Student s=context.getBean("stu",Student.class);
	     s.display();  
	          
	    }  
}
