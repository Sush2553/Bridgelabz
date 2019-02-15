package inventoryManager;

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
 * @aim to implement methods of inventory factory
 */

public class InventoryManager {
	private static ObjectMapper mapper = new ObjectMapper();
	static LinkedList<InventoryFactory> details = new LinkedList<>(); // create arraylist to store data
	static LinkedList<InventoryFactory> data = new LinkedList<>();

	public static void main(String args[]) throws Exception {
		int Option = 0;
		InventoryFactory fact = new InventoryFactory(); // create object of InventoryFactory class
		do {
			System.out.println("\n1. Add data to Inventory");
			System.out.println("2. Remove data from Inventory");
			System.out.println("3. display");
			System.out.println("4. For Exit");
			Option = Utility.getInt();
			switch (Option) {
			case 1:
				// Add data to Inventory
				System.out.println("Enter product Name:");
				String name = Utility.getString();
				System.out.println("Enter product stock in kg:");
				int number = Utility.getInt();
				System.out.println("Enter Price");
				int price = Utility.getInt();
				fact.setproductname(name);
				fact.settotalStock(number);
				fact.setstockValue(price);
				save(fact);
				System.out.println("data added successfully ");
				break;

			case 2:
				// Remove data from Inventory
				removeData();
				System.out.println("data removed successfully");
				break;
			case 3:
				// display data
				displayInformation();
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid Entry Retype");
			}

		} while (Option != 4);

	}

	// to remove data
	private static void removeData() throws JsonMappingException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter product name");
		String productName = Utility.getString();
		// read file data
		LinkedList<InventoryFactory> data1 = mapper.readValue(
				new File(
						"/home/admin1/Desktop/pre-felloship-programs/week4/src/inventoryManager/InventoryManager.json"),
				new TypeReference<LinkedList<InventoryFactory>>() {
				});
		int i = 0;
		for (i = 0; i < data1.size(); i++) {
			if (data1.get(i).getproductname().equals(productName)) {
				data1.remove(i); // if data found in file,then remove
			}

			else if (i == data1.size()) {
				System.out.println("Invalid ");
			}
			// write data to file
			mapper.writeValue(new File(
					"/home/admin1/Desktop/pre-felloship-programs/week4/src/inventoryManager/InventoryManager.json"),
					data1);
		}
	}

	// to display data
	public static void displayInformation() throws JsonMappingException, IOException {
		// TODO Auto-generated method stub
		LinkedList<InventoryFactory> data2 = mapper.readValue(
				new File(
						"/home/admin1/Desktop/pre-felloship-programs/week4/src/inventoryManager/InventoryManager.json"),
				new TypeReference<LinkedList<InventoryFactory>>() {
				});
		int size = data2.size(); // get size of data
		if (size == 0) // if size is 0,then file is empty
			System.out.println("data not found");
		// else print data
		else {
			System.out.println("Name\tstock\tvalue\n");
			data2.stream().forEach(i -> {
				System.out.println(i.getproductname() + "\t  " + i.gettotalStock() + "\t" + i.getstockValue()
						+ " \n total value for " + i.getproductname() + " is:"
						+ (i.gettotalStock() * i.getstockValue()));
			});
		}
	}

//to save data
	public static void save(InventoryFactory fact) throws JsonMappingException, IOException {
		// read existing data into list
		data = mapper.readValue(
				new File(
						"/home/admin1/Desktop/pre-felloship-programs/week4/src/inventoryManager/InventoryManager.json"),
				new TypeReference<LinkedList<InventoryFactory>>() {
				});
		data.add(fact);// add new data with existing data
		// write data to file
		mapper.writeValue(
				new File(
						"/home/admin1/Desktop/pre-felloship-programs/week4/src/inventoryManager/InventoryManager.json"),
				data);
	}
}
