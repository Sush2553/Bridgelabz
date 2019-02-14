package com.oops;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import commercialDataProcessing.ComPojo;

/**
 * @author Sushant Patwari
 * @since  12/02/2019
 * @aim To store purchased symbol unto the stack using linked list
 */
public class StoreSymbolPurchasedInStack {
	public static void main(String args[]) throws  JsonMappingException, IOException {
		String companyName;
		String symbol;
		String value;
		ObjectMapper mapper = new ObjectMapper();
		Stack<String> stack = new Stack<>(); //create object of stack class
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
				value=data1.get(i).getSymbolValue();
				stack.push(companyName+"\t", symbol+"\t", value); // add data to stack
			}
		}
		System.out.println("company\t   symbol\t   Symbolvalue\n");
		stack.display();
	}
}
