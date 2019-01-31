package functional_Programs;

import utility.Utility;


/**
 * @author Sushant Patwari
 * @version 1.0
 */
public class TripletSumToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of input");
		int n=Utility.getInt();
		int a[]=new int[n];
	//	int a[]= {-6,1,3,3,4,5,-9};
		System.out.println("plz enter numbers:");
		for(int i=0;i<n;i++)
		{
			a[i]=Utility.getInt(); 	//input numbers from user
		}
     	int size = a.length;
		int count = 0;
		
		System.out.println("Triplets are as follows:");
		for(int i=0;i<size-2;i++) 
		{
			for(int j=i+1;j<size-1;j++) 
			{
				for(int k=j+1;k<size;k++) 
				{
					
					if(a[i]+a[j]+a[k] == 0)
					{
						System.out.println(a[i]+" "+a[j]+" " +a[k] );
						count++;
					}
						
					}
				}
			}
		
	
	      	System.out.println("number of triplets:"+count++);

	}

}
