package codingBat;

public class StartHi {
	public static boolean start(String str)
	{
		if(str.length()<2)
		{
			System.out.println("false");
		}
		else if(str.substring(0,2).equals("hi"))
		{
			System.out.println("true");
		}
		
		else
		{
			System.out.println("false");
		}
		
		return false;
	}
	public static void main(String[] args)
	{
		start("his");
		start("Nidhi");
		start("him");
		start("hi");
		start("h");
		start("");
	}

}
