package codingBat;

public class Chance {
	public static String copy(String str)
	{
		if(str.length()>=3)
			{
			 String front =str.substring(0, 3);
			 System.out.println(front+front+front);
					}
		else {
			String front=str;
			System.out.println(front+front+front);
		}
		
		return str;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copy("Nidhi");
		copy("ABC");
		copy("Chocolate");
		copy("Do");
		copy("ab");
		copy("a");
		copy("");
		
		

	}

}
