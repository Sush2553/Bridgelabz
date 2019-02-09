package com.oops;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryManagement {

	public static void getData(String readFor, String arg1, String arg2, String arg3) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(
					new FileReader("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/oops/Inventory.txt"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray values = (JSONArray) jsonObject.get(readFor);
			System.out.println("\n" + readFor + " details............");

			for (int i = 0; i < values.size(); i++) {

				JSONObject rice = (JSONObject) values.get(i);
				String name = (String) rice.get(arg1);
				String we = (String) rice.get(arg2);
				String prize = (String) rice.get(arg3);
				System.out.println(
						(i + 1) + "--> " + arg1 + ":" + name + ", " + arg2 + ":" + we + ", " + arg3 + ":" + prize);
				int a = Integer.parseInt(we);
				int b = Integer.parseInt(prize);
				System.out.println("\tTotal Prize:" + a * b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getData("Rice", "Ricename", "Weight", "Price");
		getData("Wheat", "Wheatname", "Weight", "Price");
		getData("Pulses", "Pulsesname", "Weight", "Price");
	}
}
