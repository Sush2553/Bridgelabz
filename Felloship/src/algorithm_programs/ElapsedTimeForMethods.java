package algorithm_programs;

import utility.Utility;

public class ElapsedTimeForMethods 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	 
		long startTimer = System.currentTimeMillis();
		//mrethod 1
		int res=Utility.binarySearchWord();
		if(res==-1)
			System.out.println("your word not found");
		  else
		    System.out.println("your word found at index:"+res);
		long first=System.currentTimeMillis();
		System.out.println((first-startTimer)/1000+"seconds");
	    
		//method 2
		int res1=Utility.binarySearchForInteger();
		if(res1==-1)
			System.out.println("your no. not found");
		  else
		    System.out.println("your no.found at index:"+res1);
		long second=System.currentTimeMillis();
		System.out.println((second-first)/1000+"seconds");
		
		//method 3
		int res3[]=Utility.bubbleSortForIntegers();
		for(int i=0;i<res3.length;i++)
			System.out.println(res3[i]);
		long third=System.currentTimeMillis();
		System.out.println((third-second)/1000+"seconds");
		
		//method 4
		String res4[]=Utility.bubbleSortForStrings();
		for(int i=0;i<res4.length;i++)
			System.out.println(res4[i]);
		long fourth=System.currentTimeMillis();
		System.out.println((fourth-third)/1000+"seconds");
		
		//method 5
		int res5[]=Utility.insertionSortForInteger();
		for(int i=0;i<res5.length;i++)
			System.out.println(res5[i]);
		long fifth=System.currentTimeMillis();
		System.out.println((fifth-fourth)/1000+"seconds");
		
		//method 6
		String res6[]=Utility.insertionSortForString();
		for(int i=0;i<res6.length;i++)
			System.out.println(res6[i]);
		long sixth=System.currentTimeMillis();
		System.out.println((sixth-fifth)/1000+"seconds");
	}

}
