package com.utility.week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


	/*****************Binary search the world from list**************/
	
	public static int binarySearchWord() 
	{
		String a,temp = null;
				
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("/home/admin1/searchWord.txt"));
			
			try {
			
				a=br.readLine();
				String arr[]=a.split(",");
				br.close();
				//sort names
		        for (int i = 0; i < arr.length; i++) 
		        {
		        	for (int j = i + 1; j < arr.length; j++) 
		        	{
		        		if (arr[i].compareTo(arr[j])>0) 

		                {
		        			temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }

		            }

		        }
				
		        //display names
				System.out.println("\nyour file contents are:");
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]);
					if(i==arr.length-1)
					break;
					System.out.print(",");
					
				}
				
				System.out.println();
				
			    String input;
				System.out.println("which word you want to search????");
				Scanner sc=new Scanner(System.in);
				input=sc.next();
				sc.close();
			
				int first=0,last=arr.length-1;
				
				while(first<=last) 
				{
					int mid = (first + last)/2;
					if(input.compareTo(arr[mid])==0)
					{
						return mid;
					}
					else if(input.compareTo(arr[mid]) > 0)
					{
						first=mid+1;
					}
					else
					{
						last=mid-1;
					}
				}
					

				
				}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
	}
		
		return -1;
	}

	
	/***********find magic number************/
	public static void findNumber() 
	{
		System.out.println("enter value of n such that n should be power of 2:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			
			a[i]=i;
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		
		System.out.println("guess any number between 0 to "+(n-1));
		int low =0;
		int high =a.length;
		int mid,temp = 0;
		String ch1;
		

		while(low<=high) 
		{
			mid = (low+high)/2;
			if(temp==mid)
				System.out.println("not found");
			System.out.println("is your number: "+a[mid]);
			ch1=sc.next();
			if(ch1.equals("yes")) 
			{
			System.out.println(" number: "+a[mid]+" found at:"+mid);
			break;
			}
			
			temp=mid;
			//checks boundry values
			if(a[mid]==a[0] || a[mid]==n)
			{
				System.out.println("not found");
				break;
			}
			
			System.out.println("is your number greater than: "+a[mid]);
			ch1=sc.next();
			
			if(ch1.equals("no")) 
		
				high = mid ;
		
			else 
			
				low= mid ;
			
		}
		
	}
	
	
	/*****************insertion sort using string**************/
	
	public static String[] insertionSort(String array[])
	{
		
		System.out.println("original array:");
		for(int i=0;i<array.length;i++)
		{
		System.out.print(array[i]);
		if(i==array.length)
			break;
		System.out.print(",");
		}
		
		//sort
		for(int i=1;i<array.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(array[i].compareTo(array[j])<0)
				{
					String temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		//print
		
		System.out.println("\nsorted array:");
		for(int i=0;i<array.length;i++)
		{
		System.out.print(array[i]);
		if(i==array.length)
			break;
		System.out.print(",");
		}
		return array;
	}
	
	
	/*************Bubble sort***********/
	public static int[]  bubbleSort( int[] array) {

		int n = array.length;
		
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
				if(array[j]<array[i]) 
				   {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
              		}
		      	}
      		}
		
			return array;
	}	 
	
	
	/**************frequency count**************/
	public static int frequecyCount(String str) 
	{
		 String s[] = str.split(" ");
         System.out.println("original String:");
         for(int i = 0; i< s.length ; i++)
         {
         System.out.print(s[i]);
         System.out.print(" ");
         }
         for(int i = 0; i< s.length ; i++)
         {
         	for(int j = i+1; j < s.length; j++)
         	{
         	if(s[i].compareTo(s[j]) > 0)
         	{
         		String temp = s[i];
         		s[i] = s[j];
         		s[j] = temp;
         	}
         }
         }
         System.out.println();
         System.out.println("\nSorted String:");
         
         for(int i = 0; i< s.length ; i++)
         {
         System.out.print(s[i]);
         System.out.print(" ");
         }
         System.out.println("\n");
         
         int count = 1;
         for(int i = 0; i< s.length ; i++)
         {
        	
         	for(int j = i+1; j < s.length; j++)
         	{
         		if(s[i].equals(s[j]))
         		{
         			count ++;
         			i++;
         		}
         	}
         System.out.println("Frequency of '" + s[i]+"':"+count );
         count = 1;
         }
		return count;
	}		
	
/********regular expression demonstration for replacing user name with full name********/
	
	public static void regexExpression(String fullName, String mobile , String firstName) 
	{
		
		String Message = "Hello <<name>>, We have your full name " +
		           
	                "as <<full name>> in our system. \nYour contact number is +91­xxxxxxxxxx. \nPlease,let us " +
	                "know in case of any clarification.\n\t\t\t Thank you!!!\n\t\t\t BridgeLabz 01/01/2016. " ;
	       
	        String regexName = "<<name>>" ;
	       
	        String regexFname = "<<full name>>" ;
	        
	        String regexNum = "­xxxxxxxxxx";
	       
	        String regexDate = "01/01/2016";
	       
	        SimpleDateFormat Date = new SimpleDateFormat("dd/MM/yyyy");

	        Date date = new Date();
	       
	        String fdate = Date.format(date);
	       
	        
	        Message = details(Message, regexName, firstName);
	        Message = details(Message, regexFname,fullName );
	        Message = details(Message, regexNum, mobile);
	        Message = details(Message, regexDate, fdate);
	       

	        System.out.println(Message);
	}
	
    public static String details(String Template , String regexName , String regexFname){
	       
        Pattern pattern = Pattern.compile(regexName);
       
        //matcher object
        Matcher match = pattern.matcher(Template);
        return match.replaceAll(regexFname);

    }
    
    /***********program to print lyrics of poem**********/
    
    public static String printLyrics()
    {
    	String poem="Old MacDonald had a farm, E-I-E-I-O\n" + 
    			"And on his farm he had a <<ANIMAL>>, E-I-E-I-O\n" + 
    			"With a <<SOUND>> here and a <<SOUND>> there\n" + 
    			"Here a <<SOUND>>\n" + 
    			"There a <<SOUND>>\n" + 
    			"Everywhere <<SOUND>>\n" + 
    			"Old MacDonald had a farm, E-I-E-I-O";
    	String result="";
    	
    	for(int i=1;i<=9;i++)
    	{
    		if(i==1)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Chicks" ).replaceAll("<<SOUND>>","chick-chick");
    			System.out.println(fin+"\n");
    			result=result+fin;
    		}
    		
    		if(i==2)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Duck" ).replaceAll("<<SOUND>>","Quack-quack");
    			System.out.println(fin+"\n");
    			result=result+fin;
    		}
    		
    		if(i==3)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Turkey" ).replaceAll("<<SOUND>>","gobble-gobble");
    			System.out.println(fin+"\n");
    			result=result+fin;
    		}
    		if(i==4)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Cow" ).replaceAll("<<SOUND>>","moo-moo");
    			System.out.println(fin+"\n");
    			result=result+fin;
    		}
    		if(i==5)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Pig" ).replaceAll("<<SOUND>>","oink-oink");
    			System.out.println(fin+"\n");
    			result=result+fin;
    		}
    		if(i==6)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Cat" ).replaceAll("<<SOUND>>","meow-meow");
    			System.out.println(fin+"\n");
    			result=result+fin;
    		}
    		if(i==7)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Dog" ).replaceAll("<<SOUND>>","Bow-Bow");
    			System.out.println(fin+"\n");
    			result=result+fin;
    		}
    		if(i==8)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Mule" ).replaceAll("<<SOUND>>","Heehaw-Heehaw");
    			System.out.println(fin+"\n");
    			result=result+fin;
    		}
    		if(i==9)
    		{
    			String fin=poem.replaceAll("<<ANIMAL>>","Turtle" ).replaceAll("<<SOUND>>","nerp-nerp");
    			System.out.println(fin);
    			result=result+fin;
    			return result;
    		}
    	
    	}
    		return result;
    	
    }

/**************program to validate user deatails************/
    public static String checkFname()
	{
    	String firstName;
		System.out.println("Enter first name:");
		firstName=sc.next();
		String regex ="[a-zA-z]+";
    	if(firstName.matches(regex) == true)
    	{
    		return firstName;
    	}
    	else
    	{
    		System.out.println("invalid first name");
    		checkFname();
    	}
    	return "invalid";
	}
	
    
    public static String checkLname()
   	{
       	String lastName;
   		System.out.println("Enter last:");
   		lastName=sc.next();
   		String regex ="[a-zA-z]+";
       	if(lastName.matches(regex) == true)
       	{
       		return lastName;
       	}
       	else
       	{
       		System.out.println("invalid last name");
       		checkLname();
       	}
       	return "invalid";
   	}
		
	
    public static String checkPhoneNumber()
   	{
       	String phoneNumber;
   		System.out.println("Enter mobile number:");
   		phoneNumber=sc.next();
   		String regex ="[0-9]{10}$";
       	if(phoneNumber.matches(regex) == true)
       	{
       		return phoneNumber;
       	}
       	else
       	{
       		System.out.println("invalid number");
       		checkPhoneNumber();
       	}
       	return "invalid";
   	}
	

    public static String checkEmail(String email)
   	{
    	
      String regex ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
       	if(email.matches(regex) == true)
       	{
       		return email;
       	}
       	else
       	{
       		System.out.println("invalid email");
       		
       	}
       	return "invalid";
   	}
	
    public static String checkUserId()
   	{
       	String id;
   		System.out.println("Enter user id:");
   		id=sc.next();
   		String regex ="[0-9a-zA-Z]+";
       	if(id.matches(regex) == true)
       	{
       		return id;
       	}
       	else
       	{
       		System.out.println("invalid user id");
       		checkUserId();
       	}
       	return "invalid";
   	}
	
    public static String checkPassword()
   	{
       	String password;
   		System.out.println("Enter password of user:");
   		password=sc.next();
   		String regex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
   		{
		if(password.matches(regex) == true) 
		{
       		return password;
       	}
       	else
       	{
       		System.out.println("invalid");
       		checkPassword();
       	}
   		}
       	return "invalid";
   	}
	
 
/***************************ARRAYS**************************/
    /*********** 2D arrays for integers,doubles or booleans***************/
    
    public static void print2DArray(int choice) {

    	System.out.println("no of rows ?:");
    	int row = Utility.getInt();
    	System.out.println("no of col ?:");
    	int col = Utility.getInt();
    	System.out.println("Enter element for row col wise:");
    	

    	switch(choice)
    	{
    	case 1:
    	Integer[][] intArray=new Integer[row][col];
    	for(int i=0;i<row;i++)
    		{
    		for(int j=0;j<col;j++)
    		{
    			intArray[i][j]=Utility.getInt();
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
    			doubleArray[i][j] =Utility.getDouble();
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
    			System.out.print(" "+booleanArray[i][j]+"\t");
    		}
    		System.out.println();
    	}
    	break;

    	default:System.out.println("Invalid choice");

    	} 
    }
    
    
    /***************prime numbers between 1-1000**************/
    
 
    	public static int[][] prime2DArray() 
    	{
    		int [][]prime = new int [10][25];
    		int first=0,second=0,third=0,fourth=0;
    		int fifth=0,sixth=0,seventh=0,eight=0,nineth=0,ten=0;
    	
    		for(int i=2;i<1000;i++) 
    		{
    			
    			int flag=0;
    			for(int j=2;j<i;j++)
    			{
    				if(i%j==0)
    				flag=1;
    			}
    			
    			if(flag==0) 
    			{
    			
    			if((i > 0) && (i<= 100))
    			prime[0][first++] = i;
    	
    			else if((i > 100) && (i <= 200))
    				prime[1][second++]=i;
    			
    			else if((i > 200) && (i<= 300)) 
    				prime[2][third++] = i;
    			
    			else if((i> 300) && (i <= 400)) 
    				prime[3][fourth++] =i;
    			
    			else if((i > 400) && (i <= 500)) 
    				prime[4][fifth++] = i;
    			
    			else if((i> 500) && (i <= 600)) 
    				prime[5][sixth++] = i;
    			
    			else if((i>600)&&(i<=700)) 
    				prime[6][seventh++]=i;
    			
    			else if((i> 700) && (i <= 800)) 
    				prime[7][eight++] = i;
    			
    			else if((i> 800) && (i <= 900)) 
    				prime[8][nineth++] = i;
    			
    			else if((i> 900) && (i <= 1000)){	
    				prime[9][ten++] = i;
    			}
    		}
    		}
    		
    		//print column names
    		System.out.print("\t\t\t\t");
    		for(int x=1;x<=20;x++)
    		{
    			System.out.print("col"+x+"\t");
    		}
    		System.out.println("\n");
    		
    		//print prime numbers
    		for(int k=0;k<10;k++)
    		{
    		System.out.print("range:"+(k*100+1)+"-"+(k*100+100)+"\t");
    		System.out.print(" row"+(k+1)+"-->\t");
    			for(int l=0;l<20;l++) 
    			{
    			System.out.print(prime[k][l]+"\t");
    			}
    			System.out.println();
    		}
    		return prime;
    				
    	}
    	


/******************triplets sum to zero**********/
    	
    	
    	public static void findTripletSumsToZero() 
    	{
    		int a[]= {-6,1,3,3,4,5,-9};
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
    	
    	
    	//prime check
    	public static boolean isPrime(int n) {
    		
    		for(int j=2;j<=n/2;j++) {
    			int rem = n % j;
    			
    			if(rem == 0) {
    				return false;
    			}
    			
    		}
    		return true;

    }

    	//palindrome check
    	public static boolean isPallindrome(int number) 
    	{
    		int temp=number;
    		int reverseNumber=0;
    		while(number>0)
    		{
    			int remainder= number%10;
    			reverseNumber=(reverseNumber*10)+remainder;
    			number/=10;
    		}
    		return (temp==reverseNumber);
    	}

    	/**********prime anagrams check**********/
    	public static int[] primeAnagrams(int range) {
    			int index = 0;
    			String[] array1 = new String[170];
    			int[] anagram = new int[170];
    			int count = 0;
    			
    			for(int i=2;i<range;i++)
    			{
    				if(Utility.isPrime(i)) 
    				{
    					array1[index] = String.valueOf(i);
    					index++;
    				}
    			}
    			
    			
    			
    			for(int i=0;i<index;i++)
    			{
    				for(int j=i+1;j<index;j++)
    				{
    					if(Utility.isAnagram(array1[j], array1[i]))
    					{
    						anagram[count] = Integer.parseInt(array1[i]);
    						count++;
    						anagram[count] = Integer.parseInt(array1[j]);
    						count++;
    					}
    				}
    			}
    			
    			return anagram;
    		}
    	
    	
    	public static boolean isAnagram(String str1, String str2)
    	{
    			boolean status=true;
    			
    			if(str1.length() != str2.length())
    				status = false;
    			else 
    			{
    				char[] str1Array = str1.toCharArray();
    				char[] str2Array = str2.toCharArray();
    				
    				Arrays.sort(str1Array);
    				Arrays.sort(str2Array);
    				
    				status = Arrays.equals(str1Array, str2Array);
    	 		}
    			if(status)
    				return true;
    			else 
    				return false;
    		}
    		
    	 	//****************** method for to check prime anagram check *********//
    	
    	
    		public static void primePalindromeCheck(int range) 
    		{
    		  for(int index = 2;index<range;index++)
    		  {
    			  if(isPrime(index) && isPallindrome(index))
    			  {
    				  System.out.println(index+"\t");
    			  }
    			  
    		  }
    			
    		}
    		
    		
    		/*********************Program for calendar****************/
    		
    		
    		public static void calender(int month, int year) {

    			String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
    					"Octomber", "November", "December" };
    			int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    			if (month == 2)
    			{
    				if(year%4==0 || year%400==0 && year%100!=0)
    				days[month] = 29;
    			}
    			System.out.println("   " + months[month] + " " + year);
    			System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
    			int d = Utility.day(month, 1, year); // d having value between 0 to 6
    			for (int i = 0; i < d; i++)
    				System.out.print("\t"); // till day we add space
    			for (int i = 1; i <= days[month]; i++) {
    				System.out.printf("\t" + i);
    				if (((i + d) % 7 == 0)) // next line
    					System.out.println();
    			}
    		}
    			

    		public static int day(int month, int day, int year) {
    			int y = year - (14 - month) / 12;
    			int x = y + y / 4 - y / 100 + y / 400;
    			int m = month + 12 * ((14 - month) / 12) - 2;
    			int d = (day + x + (31 * m) / 12) % 7;
    			return d;

    		}
    		
    		
    	/***********program to find repeated number*********/

    public static int findrepeatedNumber(int[] array) 
    {
    	int count = 0;
    	for(int i=0;i<array.length;i++)
    	{
    		for(int j=i+1;j<array.length;j++)
    		{
    			if(array[i] == array[j]) 
    			{
    				System.out.println("repeated number:"+array[i]);
    				count++;
    			}
    		}
    	}
    			return count;
    }
    		
    		
    /*********transpose of matrix************/
    public static int[][] matricTraspos(int row,int col){
    	
    	int [][]array = new int [row][col];
    	  System.out.println("Enter element of matrix :");
    	  
    	  for(int i=0;i<row;i++) {
    		  for(int j=0;j<col;j++) {
    			   array[i][j] = Utility.getInt();
    		  }
    	  }
    	  System.out.println();
    	  
    	  System.out.println("original matrix:");
    	  for(int x=0;x<col;x++)
    	  {
    	  System.out.print("\tcol"+(x+1));
    	  }
    	  System.out.println();
    	  
    	  for(int i=0;i<row;i++)
    	  {
    		  System.out.print("row"+(i+1)+" ");
    		  for(int j=0;j<col;j++) 
    		  {
    			  System.out.print("\t "+array[i][j]);
    			  
    		  }
    		  System.out.println();
    	  }
    	
    	 //print final result
    	  System.out.println("\nafter transpose:");
    	  for(int x=0;x<col;x++)
    	  {
    	  System.out.print("\tcol"+(x+1));
    	  }
    	  System.out.println();
    	  
    	 
    	
    	for(int i=0;i<col;i++) 
    	{
    		 System.out.print("row"+(i+1)+" ");
    		for(int j=0;j<row;j++)
    		{
    			
    			System.out.print("\t "+array[j][i]);
    		}
    		System.out.println();
    	

    }
    	return array ;

    }
    
    
    /***************determinant of matrics***********/
    
 public static void calculateMatricDeterminant(int row,int col)
 {
    	
    	int [][]array = new int [row][col];
    	  System.out.println("Enter element of matrix :");
    	  
    	  for(int i=0;i<row;i++) 
    	  {
    		  for(int j=0;j<col;j++) 
    		  {
    			   array[i][j] = Utility.getInt();
    		  }
    	  }
    	  System.out.println();
    	  
    	  System.out.println("your matric:");
    	  for(int x=0;x<col;x++)
    	  {
    	  System.out.print("\tcol"+(x+1));
    	  }
    	  System.out.println();
    	  
    	  for(int i=0;i<row;i++)
    	  {
    		  System.out.print("row"+(i+1)+" ");
    		  for(int j=0;j<col;j++) 
    		  {
    			  System.out.print("\t "+array[i][j]);
    			  
    		  }
    		  System.out.println();
    	  }
    	  
    	  
    	  int result1=array[0][0]*((array[1][1]*array[2][2])-(array[2][1]*array[1][2]));
    	  int result2=array[0][1]*((array[1][0]*array[2][2])-(array[2][0]*array[1][2]));
    	  int result3= array[0][2]*((array[1][0]*array[2][1])-(array[2][0]*array[1][1]));
	      int finalResult=result1-result2+result3;
	      System.out.println("Determinant:"+finalResult);
	     System.out.println(result1+" "+result2+" "+result3);
 }


 /*********matric multiplication***************/
 
 public static void getMatricMultiplication()
 {
    	
    	int [][]array1 = new int [2][3];
    	  System.out.println("Enter element of matrix 1 :");
    	  
    	  for(int i=0;i<2;i++) 
    	  {
    		  for(int j=0;j<3;j++) 
    		  {
    			   array1[i][j] = Utility.getInt();
    		  }
    	  }
    	  System.out.println();
    	  
    	  System.out.println("your matrix:");
    	  for(int x=0;x<3;x++)
    	  {
    	  System.out.print("\tcol"+(x+1));
    	  }
    	  System.out.println();
    	  
    	  for(int i=0;i<2;i++)
    	  {
    		  System.out.print("row"+(i+1)+" ");
    		  for(int j=0;j<3;j++) 
    		  {
    			  System.out.print("\t "+array1[i][j]);
    			  
    		  }
    		  System.out.println();
    	  }
    	  
    	  

      	int [][]array2 = new int [3][2];
      	  System.out.println("\nEnter element of matrix 2 :");
      	  
      	  for(int i=0;i<3;i++) 
      	  {
      		  for(int j=0;j<2;j++) 
      		  {
      			   array2[i][j] = Utility.getInt();
      		  }
      	  }
      	  System.out.println();
      	  
      	  System.out.println("your matric:");
      	  for(int x=0;x<2;x++)
      	  {
      	  System.out.print("\tcol"+(x+1));
      	  }
      	  System.out.println();
      	  
      	  for(int i=0;i<3;i++)
      	  {
      		  System.out.print("row"+(i+1)+" ");
      		  for(int j=0;j<2;j++) 
      		  {
      			  System.out.print("\t "+array2[i][j]);
      			  
      		  }
      		  System.out.println();
      	  }
 	

 int res1=(array1[0][0]*array2[0][0])+(array1[0][1]*array2[1][0])+(array1[0][2]*array2[2][0]);

 int res2=(array1[0][0]*array2[0][1])+(array1[0][1]*array2[1][1])+(array1[0][2]*array2[2][1]);

 int res3=(array1[1][0]*array2[0][0])+(array1[1][1]*array2[1][0])+(array1[1][2]*array2[2][0]);

 int res4=(array1[1][0]*array2[0][1])+(array1[1][1]*array2[1][1])+(array1[1][2]*array2[2][1]);

 //int multiplication[][]=new int[2][2];
 System.out.println("\nmatric multiplication:");
 for(int x=0;x<2;x++)
	  {
	  System.out.print("\tcol"+(x+1));
	  }
	  System.out.println();
 System.out.print("row1\t"+res1+"\t"+res2+"\n");
 System.out.print("row2\t"+res3+"\t"+res4+"\n");
 
 }
 
 
 
 /***********************gambling simulator****************/
 
	public static void gamblingSimulator()
	{
		int stake,goal,trails;
		System.out.println("enter amount:");
		stake=sc.nextInt();
		System.out.println("enter goal:");
		goal=sc.nextInt();
		System.out.println("enter number of trails:");
		trails=sc.nextInt();
		double array[][]=new double[trails][1];
		int wins=0;
		int loss=0;
		
			int cash = stake;
			{
				if(goal<=cash)
				System.out.println("goal is less than or equal to cash");
			
				else 
				{
						for(int m=0;m<trails;m++)
						{
							double v=Math.random();
							if(v< 0.5) 
							{
								array[m][0]=v;
								loss++;	
								cash=cash-100; //100 win amount
							}	
							else 
							{
								array[m][0]=v;
								wins++;
								cash=cash+100;
							}
						}
			
			System.out.println("\nresult of every trails is as:");
				for(int i=0;i<trails;i++)
				{
					System.out.print((i+1)+")"+array[i][0]);
					if(array[i][0]<0.5)
						System.out.print("-> lost\n");
					else
						System.out.print("-> won\n");
				}
						
				
			if(cash==goal)
				System.out.println("reached goal...");
			else
				System.out.println("can't reach the goal...");
			double pw= (wins*100)/trails;
			System.out.println(" win percentage="+pw);
			double pl= (loss*100)/trails;
			System.out.println(" loss percentage="+pl);
			
			
			}
		}
			
	}
	
	
	/******************Roll die*************/
	
	public static void findRolledNumberFrequencyOnDice()
	{
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
		System.out.println("enter number of dice rolls:");
		int n=sc.nextInt();
		Random dice = new Random();
		
		int a[]=new int[n];
		int res[][]=new int[6][1];
		System.out.println("Random numbers are as follows:");
		for(int i = 0 ; i < n ; i++) 
		{
			int num=1+dice.nextInt(6);
			System.out.print(num+" ");
			for(int k = 0 ; k < n ; k++) 
				{
				a[k]=num;
				}
			
			if (num==1) 
			{
				
				count1++;
				res[0][0]=count1;
			}
	
			if (num==2) 
			{
				count2++;
				res[1][0]=count2;
			}
			if (num==3)
			{
				count3++;
				res[2][0]=count3;
			}
			if (num==4)
			{
				count4++;
				res[3][0]=count4;
			}
			if (num==5)
			{
				count5++;
				res[4][0]=count5;
			}
			if (num==6) 
			{
				count6++;
				res[5][0]=count6;
			}
		}
		System.out.print("\n");
		for(int k=0;k<6;k++)
		{
			if(res[k][0]==0)
				continue;
			System.out.println((k+1)+" repeated "+res[k][0]+" times.");
		}
	
		
	}
	
	
	/********************HARMONIC SERIES*************/
	public static void findHarmonicSeries()
	{
		System.out.println("how many harmonic series you want to print??????");
		int x=sc.nextInt();
		double series[][]=new double[x][2];
		
		for(int a=1;a<=x;a++)
		{
		int n;
		System.out.println("enter "+a+"th value of n:");
		n=sc.nextInt();
	
		
		double sum=0.0;
		for(int i=1;i<=n;i++)
			{
			sum=sum+1.0/i;
			}
		series[a-1][0]=n;
		series[a-1][1]=sum;
		//System.out.println(a);
	
		}
		
		for(int i=1;i<=x;i++)
		{
			System.out.println("harmonic series for "+series[i-1][0]+" is "+series[i-1][1]);
		}
		
	}
	
	
	
	/*******************power of 2************/
	public static int[][] getPowerOfTwo()
	{
		//System.out.println("please enter nth value to find power of 2:");
		int n=20;
		int unitIndex=0,tenIndex=0,hundredIndex=0;
		int power[][]=new int[3][4];
		
		for(int i=0;i<=n;i++)
		{
			int result=(int) Math.pow(2,i);
			
			if(result>=0 && result<=9)
			{
			power[0][unitIndex]=result;
			unitIndex++;
			}
			
			else 
			if(result>=10 && result<=99)
			{
			power[1][tenIndex]=result;
			tenIndex++;
			}
			else
			if(result>=100 && result<=999)
			{
			power[2][hundredIndex]=result;
			hundredIndex++;
		    }
		
		}
		//print 
		for(int k=0;k<=2;k++)
		{
			for(int l=0;l<4;l++) 
			{
				
			System.out.print(power[k][l]+"\t");
			}
			System.out.println();
		}return power;
	}
	
	
	/*****************birth dates of 50 individuals***************/
	
	public static void getBirthDate(int maximum, int minimum)
	{
		int st[][]=new int[50][3];
		
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
		
		System.out.print("Date\tMonth\tYear\n");
		for(int k=0;k<50;k++)
		{
			for(int l=0;l<3;l++) 
			{
			if(st[k][l]>=28 && st[k][1]==2 )
				st[k][l]=st[k][l]-2;
			
			if(st[k][2]<1992)
				st[k][2]=1993;
			System.out.print(st[k][l]+"\t");
			}
			System.out.println();
		}
		
		
		
	}
	

/***************determinent of minor mitrices************/
	public static void calculateMinorMatrixDeterminant(int row,int col)
	 {
	    	
	    	int [][]array = new int [row][col];
	    	  System.out.println("Enter element of matrix :");
	    	  
	    	  for(int i=0;i<row;i++) 
	    	  {
	    		  for(int j=0;j<col;j++) 
	    		  {
	    			   array[i][j] = Utility.getInt();
	    		  }
	    	  }
	    	  System.out.println();
	    	  
	    	  System.out.println("your matric:");
	    	  for(int x=0;x<col;x++)
	    	  {
	    	  System.out.print("\tcol"+(x+1));
	    	  }
	    	  System.out.println();
	    	  
	    	  for(int i=0;i<row;i++)
	    	  {
	    		  System.out.print("row"+(i+1)+" ");
	    		  for(int j=0;j<col;j++) 
	    		  {
	    			  System.out.print("\t "+array[i][j]);
	    			  
	    		  }
	    		  System.out.println();
	    	  }
	    	  
	    	
	 }
	

	
 
}
