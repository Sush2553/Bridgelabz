package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utility {
public static Scanner sc= new Scanner(System.in);

	

	/**This method takes integer input from user
	 * @return integer value
	 */
	public static int getInt() {

		int integer = sc.nextInt();
		return integer;

	}

	/**
	 * This method is used to take long input from user
	 * 
	 * @return long value
	 */
	public static long getLong() {

		long longValue = sc.nextLong();
		return longValue;

	}

	/**
	 * This method is used to take double input from user
	 * 
	 * @return double value
	 */
	public static double getDouble() {

		double doubleValue = sc.nextDouble();
		return doubleValue;
	}

	/**
	 * This method is used to take float input from user
	 * 
	 * @return float value
	 */
	public static float getFloat() {
		float floatValue = sc.nextFloat();
		return floatValue;
	}

	/**
	 * This method is used to take String input from user
	 * 
	 * @return String
	 */
	public static String getString() {

		String string = sc.nextLine();
		return string;
	}
	
	public static boolean getBoolean() {
		boolean booleanValue = sc.nextBoolean();
		return booleanValue;
	}

/***********read poem from file
 * @throws IOException *********/
	public static void readPoemFromFile() throws IOException
	{
		Scanner file=new Scanner(new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/lyrics.txt"));
		String poem="";
		while(file.hasNext())
		{
			poem=poem+"\n"+file.nextLine();
			
		}
		file.close();
		for(int i=1;i<=9;i++)
    	{
    		if(i==1)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Chicks" ).replaceAll("<<SOUND>>","chick-chick");
    			System.out.println(fin+"\n");
    			
    		}
    		
    		if(i==2)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Duck" ).replaceAll("<<SOUND>>","Quack-quack");
    			System.out.println(fin+"\n");
    			
    		}
    		
    		if(i==3)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Turkey" ).replaceAll("<<SOUND>>","gobble-gobble");
    			System.out.println(fin+"\n");
    			
    		}
    		if(i==4)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Cow" ).replaceAll("<<SOUND>>","moo-moo");
    			System.out.println(fin+"\n");
    			
    		}
    		if(i==5)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Pig" ).replaceAll("<<SOUND>>","oink-oink");
    			System.out.println(fin+"\n");
    			
    		}
    		if(i==6)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Cat" ).replaceAll("<<SOUND>>","meow-meow");
    			System.out.println(fin+"\n");
    			
    		}
    		if(i==7)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Dog" ).replaceAll("<<SOUND>>","Bow-Bow");
    			System.out.println(fin+"\n");
    			
    		}
    		if(i==8)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Mule" ).replaceAll("<<SOUND>>","Heehaw-Heehaw");
    			System.out.println(fin+"\n");
    			
    		}
    		if(i==9)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Turtle" ).replaceAll("<<SOUND>>","nerp-nerp");
    			System.out.println(fin);
    			
    		}
    	
    	}
	}
	
	
	/****************birth dates
	 * @throws IOException ************/
	public static void getBirthDate(int maximum, int minimum) throws IOException
	{
		Scanner file=new Scanner(new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/birthdates.txt"));
		FileWriter fw=new FileWriter(new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/birthdates.txt"));
		int st[][]=new int[50][3];
		fw.write(575);
		//date
		for(int i=0;i<50;i++) 
		{
		int n= ((int) (Math.random()*(maximum - minimum))) + minimum;
		st[i][0]=n;
		}
		
		//month
		int min=1,max=13;
		for(int j=0;j<50;j++) 
		{
		int n= ((int) (Math.random()*(max - min))) + min;
		st[j][1]=n;
		}
		
		//year
		int min1=1992,max1=1994;
		for(int j=0;j<50;j++) 
		{
		int n= ((int) (Math.random()*(max1 - min1))) + min1;
		
		st[j][2]=n;
		}
		
		//display
		
		System.out.print("\tDate\tMonth\tYear\n");
		for(int k=0;k<50;k++)
		{
			System.out.print((k+1)+":\t");
			for(int l=0;l<3;l++) 
			{
				
			if(st[k][l]>=28 && st[k][1]==2 )
				st[k][l]=st[k][l]-2;
			
			if(st[k][2]<1992)
				st[k][2]=1993;
			System.out.print(st[k][l]+"\t");
			fw.write(st[k][l]);
			fw.write("ddd");
			}
			System.out.println();
		}
		
	}
}
