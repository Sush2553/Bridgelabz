package dependencyInjectionUsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 public static void main(String[] args) {  
         ApplicationContext context=new ClassPathXmlApplicationContext("emp.xml");
         Employee e=context.getBean("emp",Employee.class);
	     e.show();  
	          
	    }  
}
