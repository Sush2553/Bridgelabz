package com.utility.week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

	/*****************Binary search the world from list**************/
	
	public static String binarySearchWord(String search) 
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
				int first=0,last=arr.length-1;
				
				while(first<=last) 
				{
					int mid = (first + last)/2;
					if(search.compareTo(arr[mid])==0)
					{
						return "found at:"+mid;
					}
					else if(search.compareTo(arr[mid]) > 0)
					{
						first=mid+1;
					}
					else
						last=mid-1;
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
		
		return "not found";
	}

	
	/***********find magic number************/
	public static void findNumber() 
	{
		int a[]= {2,4,8,16,32,64,128,256,512,1024,2048,4096};
		int low =0;
		int high =a.length;
		int mid;
		String ch1;
		

		while(low<=high) 
		{
			mid = (low+high)/2;
			
			System.out.println("is your number: "+a[mid]);
			ch1=sc.next();
			if(ch1.equals("yes")) 
			{
			System.out.println(" number: "+a[mid]+" found at:"+mid);
			break;
			}
			
			//checks boundry values
			if(a[mid]==a[0] || a[mid]==4096)
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
         			s[j] = "0";
         		}
         }
         	if(s[i] != "0")
         	{
         		System.out.println("Frequency of '" + s[i]+"':"+count );
         	}
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
	       
	        //System.out.println("Date: " +fdate);
	        Message = details(Message, regexName, firstName);
	        Message = details(Message, regexFname,fullName );
	        Message = details(Message, regexNum, mobile);
	        Message = details(Message, regexDate, fdate);
	       

	        System.out.println(Message);
	}
	
    public static String details(String Template , String regexName , String regexFname){
	       
        //pattern object which defines the regular expression
       
        Pattern pattern = Pattern.compile(regexName);
       
        //matcher object
        Matcher match = pattern.matcher(Template);
        return match.replaceAll(regexFname);

    }
    
    /***********program to print lyrics of poem**********/
    
    public static void printLyrics()
    {
    	String poem="Old MacDonald had a farm, E-I-E-I-O\n" + 
    			"And on his farm he had a <<ANIMAL>>, E-I-E-I-O\n" + 
    			"With a <<SOUND>> here and a <<SOUND>> there\n" + 
    			"Here a <<SOUND>>\n" + 
    			"There a <<SOUND>>\n" + 
    			"Everywhere <<SOUND>>\n" + 
    			"Old MacDonald had a farm, E-I-E-I-O";
    	
    	
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
        
		if(password.matches(regex) == true) 
		{
       		return password;
       	}
       	else
       	{
       		System.out.println("invalid password");
       		checkPassword();
       	}
       	return "invalid";
   	}
	
 
	

}
