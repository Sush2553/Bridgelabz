package qualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	 public static void main(String[] args) {  
         ApplicationContext context=new ClassPathXmlApplicationContext("qualifier.xml");
        Exam ex=context.getBean("ex",Exam.class);
        ex.printName();
        ex.printAge();
	          
	    }  
}
