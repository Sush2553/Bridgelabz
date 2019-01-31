package functional_Programs;

import utility.Utility;

/**
 * @author Sushant Patwari
 * @since 23/01/2019
 * @version 1.0
 */
public class ReplaceUserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="Hello <<username>>,how are you?";
		System.out.println("please enter your name:");
		String name=Utility.getString();
		if(name.length()<3) 
		System.out.println("username must have minimum 3 characters...");
	
		else
		{
		String newString=username.replace("<<username>>",name);
		System.out.println(newString);
		}
	}

}
