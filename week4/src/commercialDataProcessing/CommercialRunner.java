package commercialDataProcessing;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import com.utility.Utility;

public class CommercialRunner {
	private static ObjectMapper mapper=new ObjectMapper();
	static List<CommercialPojo> ours = new ArrayList<>();
	static List<CommercialPojo> others = new ArrayList<>();
	public static void main(String args[]) throws Exception
	{
		
		int Option = 0;
		do {
			System.out.println("\n1. Add data");
			System.out.println("2. Remove data");
			System.out.println("3. display list");
			System.out.println("4. buy symbol");
			System.out.println("5. sell symbol");
			System.out.println("6. For Exit");
			Option=Utility.getInt();
			switch(Option)
			{
			case 1:
			System.out.println("Enter company Name:");
			String name=Utility.getString();
			System.out.println("Enter symbol:");
			String number=Utility.getString();
			System.out.println("Enter Price");
			int price=Utility.getInt();
			System.out.println("1. Add to our own dictionary \n2. Add to others\n3. exit ");
			int choice=Utility.getInt();
			switch(choice)
			{
			case 1:
				ours.add(new CommercialPojo(name,number,price));
				save("/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/ourSymbol.json",ours);
				System.out.println("data added successfully ");
				break;
			case 2:
				others.add(new CommercialPojo(name,number,price));
				save("/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/othersSymbol.json",others);
				System.out.println("data added successfully ");
				break;
			case 3:
				break;
			default:
				System.out.println("invalid choice");
			}
			break;
		
		case 2:
			System.out.println("1. remove from our own dictionary \n2. remove from others\n3. exit ");
			int choice1=Utility.getInt();
			switch(choice1)
			{
			case 1:
				removeData(ours);
				save("/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/ourSymbol.json",ours);
				System.out.println("data removed successfully");
				break;
			case 2:
				removeData(others);
				save("/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/othersSymbol.json",others);
				System.out.println("data removed successfully");
				break;	
			case 3:
				break;
			default:
				System.out.println("invalid choice");
			}
			break;
			
		case 3:
			System.out.println("1. display our symbols \n2. display others symbol\n3. exit ");
			int choice2=Utility.getInt();
			switch(choice2)
			{
			case 1:
				displayInformation(ours);
				break;
			case 2:
				displayInformation(others);
				break;
			case 3:
				break;
			default:
				System.out.println("invalid choice");	
			}
			break;
		case 4:
			System.out.println("Which symbol you want to buy:");
			String buySymbol=Utility.getString();
		case 6:
			System.out.println("Exiting");
			break;
		default :
			System.out.println("Invalid Entry Retype");
		}
		
	}while(Option!=4);
	
}


private static void removeData(List<CommercialPojo> name) {
	// TODO Auto-generated method stub
		System.out.println("Enter Symbol");
		String symbol = Utility.getString();
		int i = 0;
		for (i = 0; i < ours.size(); i++) 
		{
			if (name.get(i).getCompanyName()==symbol) 
			{
				name.remove(i);
			}
		
		else if(i == name.size()) 
		{
			System.out.println("Invalid ");
		}
		}
}


public static void displayInformation(List<CommercialPojo> name) throws JsonMappingException, IOException {
	// TODO Auto-generated method stub
	System.out.println("Name\tstock\tvalue");
	name.stream().forEach(i -> {
		System.out.println(
				i.getCompanyName() + "\t  " + i.getSymbol() + "\t" + i.getSymbolValue());
	});
}

public static void save(String path,List<CommercialPojo> name) {
	try {
		
		mapper.writeValue(new File(path),name);
		} catch (IOException e) {
		e.printStackTrace();
	}
}


}


