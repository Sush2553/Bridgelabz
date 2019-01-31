package algorithm_programs;

import utility.Utility;

public class BinarySearchWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int res;
				res=Utility.binarySearchWord();
				if(res==-1)
					System.out.println("your word not found");
				  else
				    System.out.println("your word found at index:"+res);
	}

}
