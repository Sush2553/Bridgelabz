package functional_Programs;

import utility.Utility;
/**
 * @author Sushant Patwari
 * @version 1.0
 */
public class IntDoubleBooleanArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("1.integer array\n2.double array\n3.boolean array\nenter your choice:");
		int n=Utility.sc.nextInt();
	
		System.out.println("no of rows ?:");
    	int row = Utility.getInt();
    	System.out.println("no of col ?:");
    	int col = Utility.getInt();
    	System.out.println("Enter element for row col wise:");
    	

    	switch(n)
    	{
    	case 1:
    	Integer[][] intArray=new Integer[row][col];
    	for(int i=0;i<row;i++)
    		{
    		for(int j=0;j<col;j++)
    		{
    			intArray[i][j]=Utility.getInt();	//user input for integer array
    		}
    		}
    	//print2DArrayElement(intArray);
    		for(int k=1;k<=col;k++)
    		{
    		System.out.print("\t"+"col"+k);
    		}
    		System.out.println();
    		
    		for(int i=0;i<row;i++) 
    		{
    			System.out.print("row"+(i+1)+"\t");
    			for(int j=0;j<col;j++) 
    			{
    				System.out.print(" "+intArray[i][j]+"\t");
    			}
    			System.out.println();
    		}
    		break;
    	
    	case 2:
    	Double[][] doubleArray = new Double [row][col];
    	for(int i=0;i<row;i++) 
    	{
    		for(int j=0;j<col;j++) 
    		{
    			doubleArray[i][j] =Utility.getDouble();	//double array
    		}
    	}

    	//print the double array
    	for(int k=1;k<=col;k++)
		{
		System.out.print("\t"+"col"+k);
		}
		System.out.println();
		
    	for(int i=0;i<row;i++) 
    	{
    		System.out.print("row"+(i+1)+"\t");
    		for(int j=0;j<col;j++) 
    		{
    			System.out.print(" "+doubleArray[i][j]+"\t");
    		}
    		System.out.println();
    	}
    	break;
    	
    	case 3:
    	Boolean [][] booleanArray = new Boolean [row][col];
    	for(int i=0;i<row;i++) 
    	{
    		for(int j=0;j<col;j++) 
    		{
    			booleanArray[i][j] =Utility.getBoolean();
    		}
    	}

    	//print the boolean array
    	for(int k=1;k<=col;k++)
		{
		System.out.print("\t"+"col"+k);
		}
		System.out.println();
		
    	for(int i=0;i<row;i++) 
    	{
    		System.out.print("row"+(i+1)+"\t");
    		for(int j=0;j<col;j++) 
    		{
    			System.out.print(" "+booleanArray[i][j]+"\t");
    		}
    		System.out.println();
    	}
    	break;

    	default:System.out.println("Invalid choice");

    	} 
	}

}
