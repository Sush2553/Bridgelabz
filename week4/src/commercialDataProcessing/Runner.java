package commercialDataProcessing;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.utility.Utility;

public class Runner {

	static ObjectMapper mapper = new ObjectMapper();
	static LinkedList<ComPojo> ours = new LinkedList<>();// arraylist to store transaction data
	static LinkedList<ComPojo> data = new LinkedList<>();

	public static void main(String args[]) throws Exception {
		int Option = 0;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		ComPojo com = new ComPojo();
		do {
			System.out.println("\n1. Add data");
			System.out.println("2. Remove data");
			System.out.println("3. display list");
			System.out.println("4. buy symbol");
			System.out.println("5. sell symbol");
			System.out.println("6. For Exit");
			Option = Utility.getInt();
			switch (Option) {
			case 1:
				// to add new data
				System.out.println("Enter company Name:");
				String name = Utility.getString();
				System.out.println("Enter symbol:");
				String number = Utility.getString();
				System.out.println("Enter Price");
				String price = Utility.getString();
				com.setCompanyName(name);
				com.setSymbol(number);
				com.setSymbolValue(price);
				 // get current time
				String date = (dtf.format(now));
				com.setDate(date);
				// add new data
				save(com);
				System.out.println("data added successfully ");
				break;

			case 2:
				// to remove data
				removeData();
				System.out.println("data removed successfully");
				break;

			case 3:
				// to display data
				displayInformation();
				break;

			case 4:
				// to buy symbol
				System.out.println("Which symbol you want to buy:");
				String symbol = Utility.getString();
				System.out.println("enter company name:");
				String name1 = Utility.getString();
				System.out.println("enter symbol price:");
				String price1 = Utility.getString();
				com.setCompanyName(name1);
				com.setSymbol(symbol);
				com.setSymbolValue(price1);
				date = (dtf.format(now));
				com.setDate(date);
				// add new data
				save(com);
				System.out.println("transaction successful...buyed");
				break;

			case 5:
				// to sell data
				removeData();
				break;

			case 6:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry Retype");
			}

		} while (Option != 6);

	}

	// to remove data
	private static void removeData() throws JsonMappingException, IOException {
		try {

			data = mapper.readValue(new File(
					"/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/ourSymbol.json"),
					new TypeReference<LinkedList<ComPojo>>() {
					});
		} catch (IOException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		System.out.println("Enter Symbol");
		String symbol = Utility.getString();
		int i = 0;
		for (i = 0; i < data.size(); i++) {
			if (i == data.size()) { // to check list is empty or not
				System.out.println("Invalid ");
			} else if (data.get(i).getSymbol().equals(symbol)) { // if symbol found then remove it
				data.remove(i);
			}
		}
		mapper.writeValue(new File(
				"/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/ourSymbol.json"), data);
	}

//to display data
	public static void displayInformation() throws JsonMappingException, IOException {
		// TODO Auto-generated method stub
		LinkedList<ComPojo> data1 = mapper.readValue(new File(
				"/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/ourSymbol.json"),
				new TypeReference<LinkedList<ComPojo>>() {
				});

		int i = 0;
		int size = data1.size();
		if (size == 0)
			System.out.println("\nno data found");
		else {
			System.out.println("Name\tsymbol\tvalue");
			for (i = 0; i < data1.size(); i++) {
				System.out.println(data1.get(i).getCompanyName() + "\t  " + data1.get(i).getSymbol() + "\t"
						+ data1.get(i).getSymbolValue());
			}
		}
	}

//to save data 
	public static void save(ComPojo com) throws JsonMappingException, IOException {
		data = mapper.readValue(new File(
				"/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/ourSymbol.json"),
				new TypeReference<LinkedList<ComPojo>>() {
				});

		data.add(com);
		// write data to file
		mapper.writeValue(new File(
				"/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/ourSymbol.json"), data);

	}
}
