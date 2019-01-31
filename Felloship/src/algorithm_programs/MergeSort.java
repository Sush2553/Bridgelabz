package algorithm_programs;


import utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {12, 11, 13, 5, 6, 7}; 

		    System.out.println("Given Array"); 
		    Utility. printArray(arr); 
		    Utility.sort(arr, 0, arr.length-1); 

		    System.out.println("\nSorted array"); 
		    Utility.printArray(arr); 
	}

}
