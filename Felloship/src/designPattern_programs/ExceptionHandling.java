package designPattern_programs;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author Sushant Patwari
 * @since 20/02/2019
 * @aim To implement exception handling
 */
public class ExceptionHandling {
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) throws IOException {
		// try catch using parent class exception
		Desing_Utility obj = new Desing_Utility();
		obj.ecxeptionUsingParentClass();
		obj.exceptionToPrintCustomMessages();
		obj.resolveExceptionInCatchBlock();
		obj.multipleTryCatchBlock();
		obj.nestedTryCatch();

		// reflection is used to get info. of class for a specified object((getClass
		// method)
		// public methods of class(getMeyhods)
		// constructor of class(getConstructor)
		Class cls = obj.getClass();
		System.out.println("\nclass name:" + cls.getName() + "\n");

		Method methods[] = cls.getMethods();
		System.out.println("methods are:");
		for (Method i : methods) {
			System.out.println(i.getName());
		}

		obj.thowKeyword(15);

	}
}
