package inventoryManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import com.utility.Utility;


public class InventoryManager {
	private static ObjectMapper mapper=new ObjectMapper();
	static List<InventoryFactory> details = new ArrayList<>();
	public static void main(String args[]) throws Exception
	{
		
		int Option = 0;
		do {
			System.out.println("\n1. Add data to Inventory");
			System.out.println("2. Remove data from Inventory");
			System.out.println("3. display");
			System.out.println("4. For Exit");
			Option=Utility.getInt();
			switch(Option)
			{
			case 1:
				System.out.println("Enter product Name:");
				String name=Utility.getString();
				System.out.println("Enter product stock in kg:");
				int number=Utility.getInt();
				System.out.println("Enter Price");
				int price=Utility.getInt();
				int id = 0;
				if (details.size() >= 1) {
					for (int i = 0; i < details.size(); i++) {
						if (id < details.get(i).getId()) {
							id = details.get(i).getId();
						}
					}
				}
				details.add(new InventoryFactory(id+1,name,number,price));
				save();
				System.out.println("data added successfully ");
				break;
			
			case 2:
				removeData();
				save();
				System.out.println("data removed successfully");
				break;
			case 3:
				displayInformation();
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default :
				System.out.println("Invalid Entry Retype");
			}
			
		}while(Option!=4);
		
	}
	
	
	private static void removeData() {
		// TODO Auto-generated method stub
			System.out.println("Enter product name");
			String productName = Utility.getString();
			int i = 0;
			for (i = 0; i < details.size(); i++) 
			{
				if (details.get(i).getproductname()==productName) 
				{
					details.remove(i);
				}
			
			else if(i == details.size()) 
			{
				System.out.println("Invalid ");
			}
			}
	}

	
	public static void displayInformation() throws JsonMappingException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Name\tstock\tvalue");
		details.stream().forEach(i -> {
			System.out.println(
					i.getproductname() + "\t  " + i.gettotalStock() + "\t" + i.getstockValue()+ " \n total value for "+i.getproductname()+" is:"+(i.gettotalStock()*i.getstockValue()));
		});
	}

	public static void save() {
		try {
			
			mapper.writeValue(new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/inventoryManager/InventoryManager.json"),details);
			} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


