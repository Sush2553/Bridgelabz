package designPattern_programs;

import java.io.IOException;

@SuppressWarnings("unused")
public class Desing_Utility {
//to print default message for exception	
	public void ecxeptionUsingParentClass() {
		try {

			int data = 50 / 0; // may throw exception
		}
		// handling the exception
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("exception handeled");
	}

//to print custom message for exception
	public  void exceptionToPrintCustomMessages() {
		System.out.println("\nto print custom message in catch");
		try {

			int data = 50 / 0; // may throw exception
		}
		// handling the exception
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("can't divide by zero");
	}

//resolving exception in catch block
	public  void resolveExceptionInCatchBlock() {
		System.out.println("\nresolving exception in catch block");

		int data = 50, j = 0;
		try {
			int result = data / j;
		}
		// handling the exception
		catch (ArithmeticException e) {
			System.out.println("result=" + (data / (j + 5)));
		}
	}

// multiple try catch block
	public  void multipleTryCatchBlock() {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("\nArithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("\nParent Exception occurs");
		}
	}

//nested try catch where a part of a block may cause one exception and the entire block itself may cause another exception
	public void nestedTryCatch() {
		try {
			try {
				System.out.println("\n1st exception");
				int b = 39 / 0;
				} catch (ArithmeticException e) {
				System.out.println(e);
				}
			try {
				System.out.println("2nd exception");
				int a[] = new int[5];
				a[5] = 4;
				} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println();
				}
			} catch (Exception e) {
			System.out.println("handeled");
		}
	}

//using throw exception
	public void thowKeyword(int age){  
	     if(age<18)  
	      throw new ArithmeticException();  
	     else  
	      System.out.println("welcome to vote");  
	   }  

}
