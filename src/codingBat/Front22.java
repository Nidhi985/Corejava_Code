package codingBat;

public class Front22 {
	public static String name(String str)
	{
		if(str.length()<2)
		{
			System.out.println(str+str+str);
		}
		else
		{
			String front=str.substring(0, 2);
			System.out.println(front+str+front);
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name("Nidhi");
		name("Shetty");
		name("yo");
		name("na");

	}

}
