package facade_pattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Sushant Patwari
 * @aim To implement facade design pattern
 */
public class LapyManager implements ImplemrntLaptop {
	int quantity;
	long total;
	
	//method to read file
	public void readFile() {
		Scanner in = null;
		//read data from file
		try {
			
			in = new Scanner(new File("/home/admin1/eclipse-workspace/Felloship/src/facade_pattern/data.txt"));
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		//constructor calling
		Laptop lap = new Laptop("hp", 30000, "age", "i5");

		try {
			while (in.hasNext()) {
				lap.setName(in.next());
				lap.setPrice(in.nextInt());
				lap.setModel(in.next());
				lap.setProcessor(in.next());

				System.out.printf("%s %s %s %s", lap.getName(), lap.getPrice(), lap.getModel(), lap.getProcessor());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		in.close();
	}

//method to calculate total price
	@Override
	public void getTotalPrice() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\nhow many laptops you want to buy??");
		
	    quantity=sc.nextInt();
		sc.close();
		
		total=30000*quantity;
		System.out.println("you have to pay "+total+" for "+quantity+" laptops");
		
	
	}
	
	//method to calculate discount
	//discount is applicable for more than 2 purchase
	@Override
	public void getDiscount() {
		// TODO Auto-generated method stub
		//check if more than two items puechased or not
		if(quantity>2)
		//if yes
		{
		System.out.println("\ncongrats you are eligible for 10000 discount.....");
		System.out.println("\nyour amount is:"+(total-10000));
		}
		
		else
			System.out.println("you must long dis=(20/100)*(total/100);\n" + 
					"		System.out.println(\"discounted amount is:\"+dis);purchase more than 2 quantity to avail 10000 discount");
	}

	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object of LapyManager class
		LapyManager manager=new LapyManager();
		manager.readFile();
		manager.getTotalPrice();
		manager.getDiscount();
	}


	
}
