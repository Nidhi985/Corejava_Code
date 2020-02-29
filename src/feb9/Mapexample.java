package feb9;

import java.util.HashMap;

public class Mapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map =new HashMap<>();
		map.put("Pune", 411014);
		map.put("Mumbai", 411015);
		map.put("Mangalore", 411016);
		map.put("Bangalore", 411017);
		System.out.println(map);
		System.out.println(map.keySet());//key always return a set because set is unique and key is always unique
		System.out.println(map.values());
		System.out.println(map.size());//number of key value pair
		map.replace("Pune", 411013);
		System.out.println(map);
		
		map.remove("Mumbai");
		System.out.println(map);
		System.out.println(map.containsKey("Nasik"));
		System.out.println(map.containsValue(411013));
		System.out.println(map.get("Pune")); 
		map.put("Bangalore", 411018);//Duplicate key can't be used if we use duplicate key the already existing value is updated with new value
		System.out.println(map);

		for(String key : map.keySet())
		{
			System.out.println(("Key " + key +" "+ "value: " + map.get(key)));
		}
	}

}
