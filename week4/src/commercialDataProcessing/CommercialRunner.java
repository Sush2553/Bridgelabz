package commercialDataProcessing;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.utility.Utility;

public class CommercialRunner {
	static ObjectMapper mapper = new ObjectMapper();
	static ArrayList<CommercialPojo> ours = new ArrayList<>();
	{
		try {
			ours = mapper.readValue(new File(
					"/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/ourSymbol.json"),
					new TypeReference<List<CommercialPojo>>() {
					});

		} catch (Exception e) {

		}
	}

	public static void main(String args[]) throws Exception {
		int Option = 0;
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
				System.out.println("Enter company Name:");
				String name = Utility.getString();
				System.out.println("Enter symbol:");
				String number = Utility.getString();
				System.out.println("Enter Price");
				int price = Utility.getInt();
				ours.add(new CommercialPojo(name, number, price));
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
				save();
				break;

			case 4:
				System.out.println("Which symbol you want to buy:");
				String symbol = Utility.getString();
				System.out.println("enter company name:");
				String name1 = Utility.getString();
				System.out.println("enter symbol price:");
				int price1 = Utility.getInt();
				ours.add(new CommercialPojo(name1, symbol, price1));
				save();
				System.out.println("transaction successful...buyed");
				break;

			case 5:
				removeData();
				save();
				break;

			case 6:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry Retype");
			}

		} while (Option != 6);

	}

	private static void removeData() {
		// TODO Auto-generated method stub
		System.out.println("Enter Symbol");
		String symbol = Utility.getString();
		int i = 0;
		for (i = 0; i < ours.size(); i++) {
			if (i == ours.size()) {
				System.out.println("Invalid ");
			} else if (ours.get(i).getSymbol().equals(symbol)) {
				ours.remove(i);
			}
		}
	}

	public static void displayInformation() throws JsonMappingException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Name\tstock\tvalue");
		int i = 0;
		for (i = 0; i < ours.size(); i++) {
			System.out.println(ours.get(i).getCompanyName() + "\t  " + ours.get(i).getSymbol() + "\t"
					+ ours.get(i).getSymbolValue());
		}
		;
	}

	public static void save() {
		try {

			mapper.writeValue(new File(
					"/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/ourSymbol.json"),
					ours);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
