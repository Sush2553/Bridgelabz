package com.oops;
/**
 * @author Sushant Patwari
 * @since  10/02/2019
 * @aim to store date and time of transaction into queue
 */
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import commercialDataProcessing.ComPojo;

public class StoreTransactionDateInQueue {
	public static void main(String args[]) throws JsonMappingException, IOException {
		String companyName = null;
		String symbol = null;
		// object of queue class
		ObjectMapper mapper = new ObjectMapper();
		Queue<String> queue = new Queue<>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now(); // get current time
		String date = (dtf.format(now));

		LinkedList<ComPojo> data1 = mapper.readValue(new File(
				"/home/admin1/Desktop/pre-felloship-programs/week4/src/commercialDataProcessing/ourSymbol.json"),
				new TypeReference<LinkedList<ComPojo>>() {
				});
		int i = 0;
		int size = data1.size();
		if (size == 0)
			System.out.println("\nno data found");
		else {

			for (i = 0; i < data1.size(); i++) {
				companyName = data1.get(i).getCompanyName().trim();
				symbol = data1.get(i).getSymbol().trim();
				date = data1.get(i).getDate().trim();
				queue.enque(companyName+" ", symbol+" ", date); // add data to queue
			}
		}
		System.out.println("  company\tsymbol\t  date of transaction\n");
		queue.display();

	}
}
