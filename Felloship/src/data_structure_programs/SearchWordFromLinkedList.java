package data_structure_programs;

import java.io.FileNotFoundException;
import java.util.Scanner;

import utility.Utility;
/**
 * @author Sushant Patwari
 * @purpose To search word from linked list
 */
public class SearchWordFromLinkedList {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	String str=Utility.readFile("/home/admin1/Desktop/pre-felloship-programs/week5/src/searchWord.txt");
	String wordArray[]=str.split(" ");
	Node head=Utility.addToLinkedList(wordArray);
	Utility.displayLinkedList(head);
	System.out.println("\n\nwhich word you want to search???");
	String wordToSearch=sc.next();
	int result=Utility.search(wordArray,wordToSearch,head);
	if(result==-1)
	{
		Utility.addIfNotFound(wordToSearch,head);
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
