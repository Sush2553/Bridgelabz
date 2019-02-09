package com.oops;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalShareCount = 0, totalSharePrize = 0;
		JSONParser parser = new JSONParser();

		try {
			Object obj = parser
					.parse(new FileReader("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/oops/Stock.txt"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray values = (JSONArray) jsonObject.get("Stock");
			System.out.println("Stock details............");
			for (int i = 0; i < values.size(); i++) {
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
				totalShareCount = totalShareCount + noOfShares;
				totalSharePrize = totalSharePrize + totalValue;

			}
			System.out.println("\nTotal shares for all companies:" + totalShareCount);
			System.out.println("total share prize for all company shares:" + totalSharePrize);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
