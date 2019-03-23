package requiredAnnotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	   private String name;
	   private Integer age;

	   @Required
	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   
	   @Required
	   public void setName(String name) {
	      this.name = name;
	   }
	  
	   public void studentInfo()
	   {
		   System.out.println("name:"+name+" age:"+age);
	   }
}
