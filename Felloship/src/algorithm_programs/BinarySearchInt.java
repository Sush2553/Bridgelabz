package algorithm_programs;

import utility.Utility;

public class BinarySearchInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		res=Utility.binarySearchForInteger();
		if(res==-1)
			System.out.println("your no. not found");
		  else
		    System.out.println("your no. found at index:"+res);
	}

}
