package autowiredByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("byType.xml");
	Employee employee=context.getBean("employee",Employee.class);
	System.out.println(employee.getEmpName());		
	System.out.println(employee.getAddr().getCity());
	System.out.println(employee.getAddr().getState());
}
}
