package feb9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, HashMap<Integer, ArrayList<String>>> map =new HashMap<>();
		ArrayList<String> list1 =new ArrayList<>();
		ArrayList<String> list2 =new ArrayList<>();
		ArrayList<String> list3 =new ArrayList<>();
		HashMap<Integer, ArrayList<String>> details1 =new HashMap<>();
		HashMap<Integer, ArrayList<String>> details2 =new HashMap<>();
		HashMap<Integer, ArrayList<String>> details3 =new HashMap<>();
		list1.add("Nidhi Shetty");
		list1.add("ABS");
		list1.add("Tester");
		
		list2.add("Diya");
		list2.add("LTI");
		
		list2.add("Developer");
		list2.add("Shailesh");
		list2.add("LTI");
		list2.add("Developer4");
		
		list3.add("NK");
		list3.add("LTI");
		list3.add("Developer level2");
		details1.put(1001, list1);
		details2.put(1002, list2);
		details3.put(1003, list3);
		map.put("Finance", details1);
		map.put("Banking", details2);
		map.put("Manager", details3);
		System.out.println(map);
		System.out.println(map.get("Banking").get(1002).get(0));
		
		

	}

}
