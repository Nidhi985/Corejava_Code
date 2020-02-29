package feb9;

import java.util.ArrayList;
import java.util.HashMap;

public class Mapexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, ArrayList<String>> map = new HashMap();
		ArrayList<String> list1 =new ArrayList<>();
		list1.add("Nidhi Shetty");
		list1.add("Developer");
		list1.add("Level 2");
		list1.add("Department1");
		map.put(11111, list1);
		System.out.println(map);
		ArrayList<String> list2 =new ArrayList<>();
		list2.add("Diya");
		list2.add("Test");
		list2.add("Level3");
		list2.add("Department2");
		map.put(22222, list2);
		System.out.println(map);
		System.out.println(map.get(11111));
		System.out.println(map.get(11111).get(2));
		
		
		

	}

}
