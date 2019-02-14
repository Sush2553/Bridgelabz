package com.oops;
/**
 * @author Sushant Patwari
 * @since  09/02/2019
 * @aim to display stock data fron JSON file
 */
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalShareCount = 0, totalSharePrize = 0;
		JSONParser parser = new JSONParser(); //object of parser

		try {
			//parse file data into obj
			Object obj = parser
					.parse(new FileReader("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/oops/Stock.txt"));
			JSONObject jsonObject = (JSONObject) obj; //convert obj into json object
			JSONArray values = (JSONArray) jsonObject.get("Stock"); //read stock data into json array
			System.out.println("Stock details............");
			for (int i = 0; i < values.size(); i++) {
				//display data
				JSONObject stockk = (JSONObject) values.get(i);
				String name = (String) stockk.get("Stock_Name");
				String number = (String) stockk.get("Number_of_shares");
				String prize = (String) stockk.get("Share_Prize");
				int noOfShares = Integer.parseInt(number);
				int shareValue = Integer.parseInt(prize);
				System.out.println((i + 1) + "--> Stock_Name: " + name + ",  Number_of_shares: " + number
						+ ",   Share_prize: " + prize);
				int totalValue = noOfShares * shareValue;
				System.out.println("\ttotal share value:" + totalValue);
				totalShareCount = totalShareCount + noOfShares; //total share for all companies
				totalSharePrize = totalSharePrize + totalValue; //total share price for all company shares

			}
			System.out.println("\nTotal shares for all companies:" + totalShareCount);
			System.out.println("total share prize for all company shares:" + totalSharePrize);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
