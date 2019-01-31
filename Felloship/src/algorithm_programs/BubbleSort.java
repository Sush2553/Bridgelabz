package algorithm_programs;

import utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String result[]=Utility.bubbleSortForStrings();
      System.out.println("sorted result is:");
      for(String i:result)
    	  System.out.print(i+" ");
	}

}
