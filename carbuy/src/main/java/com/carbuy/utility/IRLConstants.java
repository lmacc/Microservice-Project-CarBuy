package com.carbuy.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IRLConstants {
	
	public final static String IRL = "IRL";
	
	public final static Map<String, String> mapOfIRLCounties = new HashMap<String, String>() {
		{
			put("Antrim", "Antrim");
			put("Armagh", "Armagh");
			put("Cork", "Cork");
            put("Clare", "Clare");
            put("Cavan", "Cavan");
            put("Carlow", "Carlow");
            put("Dublin", "Dublin");
            put("Down", "Down");
            put("Derry", "Derry");
            put("Fermanagh", "Fermanagh");
            put("Galway", "Galway");
            put("Kerry", "Kerry");

		}
	};
	
	public final static List<String> listOfIRLCounties = new ArrayList<>(mapOfIRLCounties.keySet());
	public final static List<String> listOfIRLCountiesNames = new ArrayList<>(mapOfIRLCounties.values());

}
