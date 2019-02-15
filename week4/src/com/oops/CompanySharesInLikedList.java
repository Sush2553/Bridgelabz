package com.oops;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.utility.Utility;


/**
 * @author Sushant Patwari
 * @since 10/02/2019
 * @aim to program to store company shares in linked list
 */
public class CompanySharesInLikedList {
	static String name;
	static int number;
	static int value;
	static ObjectMapper mapper = new ObjectMapper();
	static InventoryFactory in = new InventoryFactory();
	static LinkedList<InventoryFactory> list = new LinkedList<>(); // create object of queue class

	public static void main(String args[]) throws JsonMappingException, IOException {

		while (true) {
			System.out.println("\n1. add new inventory\n2. delete invntory\n3. display \n");
			System.out.println("enter your choice:");
			int choice = Utility.getInt();
			switch (choice) {
			case 1:
				// to add new shares
				System.out.println("enter inventory name:");
				name = Utility.getString();
				System.out.println("enter no of shares:");
				number = Utility.getInt();
				System.out.println("enter share price:");
				value = Utility.getInt();
				in.setinventoryname(name);
				in.setinventorynumber(number);
				in.setinventoryvalue(value);
				save(in);
				System.out.println("data added successfully.........");
				break;
			case 2:
				// to delete share
				removeData();
				System.out.println("data deleted.....");
				break;
			case 3:
				// to display data
				displayInformation();
				break;
			default:
				System.out.println("invalid choice");
			}
		}
	}

	// to remove data
	private static void removeData() throws JsonMappingException, IOException {
		list = mapper.readValue(
					new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/oops/InventoryLinkedList.json"),
					new TypeReference<LinkedList<InventoryFactory>>() {
					});
		// TODO Auto-generated method stub
		System.out.println("Enter inventory name");
		String cName = Utility.getString();
		int i = 0;
		for (i = 0; i < list.size(); i++) {
			if (i == list.size()) { // to check list is empty or not
				System.out.println("Invalid ");
			} else if (list.get(i).getinventoryname().equals(cName)) { // if symbol found then remove it
				list.remove(i);
			}
		}
		mapper.writeValue(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/oops/InventoryLinkedList.json"),
				list);
	}

	// to display data
	public static void displayInformation() throws JsonMappingException, IOException {
		// TODO Auto-generated method stub
		LinkedList<InventoryFactory> data1 = mapper.readValue(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/oops/InventoryLinkedList.json"),
				new TypeReference<LinkedList<InventoryFactory>>() {
				});

		int i = 0;
		int size = data1.size();
		if (size == 0)
			System.out.println("\nno data found");
		else {
			System.out.println("Name\tsymbol\tvalue");
			for (i = 0; i < data1.size(); i++) {
				System.out.println(data1.get(i).getinventoryname() + "\t  " + data1.get(i).getinventorynumber() + "\t"
						+ data1.get(i).getinventoryvalue());
			}
		}
	}

	// to save data
	public static void save(InventoryFactory in) throws JsonMappingException, IOException {
		LinkedList<InventoryFactory> data = mapper.readValue(new File(
				"/home/admin1/Desktop/pre-felloship-programs/week4/src/com/oops/InventoryLinkedList.json"),
				new TypeReference<LinkedList<InventoryFactory>>() {
				});

		data.add(in);
		// write data to file
		mapper.writeValue(new File(
				"/home/admin1/Desktop/pre-felloship-programs/week4/src/com/oops/InventoryLinkedList.json"), data);

	}
}
