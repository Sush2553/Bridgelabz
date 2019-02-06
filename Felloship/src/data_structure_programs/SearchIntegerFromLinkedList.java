package data_structure_programs;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import utility.Utility;
/**
 * @author Sushant Patwari
 * @purpose To search integer from linked list
 */
public class SearchIntegerFromLinkedList {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=Utility.readFile("/home/admin1/eclipse-workspace/Felloship/src/SearchInteger");
		String Array[]=str.split(",");
		int l=Array.length;
		int array[]=new int[l];
		for(int i=0;i<l;i++)
			array[i]=Integer.parseInt(Array[i]);
			
		Arrays.sort(array);
		String wordArray[]=new String[l];
		for(int i=0;i<l;i++)
			wordArray[i]=String.valueOf(array[i]);
		Node head=Utility.addToLinkedList(wordArray);
		Utility.displayLinkedList(head);
		System.out.println("\n\nwhich integer you want to search???");
		int getinput=sc.nextInt();
		String wordToSearch=Integer.toString(getinput);
		int result=Utility.search(wordArray,wordToSearch,head);
		if(result==-1)
		{
		Utility.addIfNotInAscendingOrder(wordToSearch, head, l);
		Utility.displayLinkedList(head);
		}
		if(result>=0)
		{
		Node head1=Utility.deleteFromLinkedList(result, head);
		Utility.displayLinkedList(head1);
		}
		sc.close();
		
	}

}
