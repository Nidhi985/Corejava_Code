package codingBat;

public class NoString {
	public static String nostring(String str)
	{
		 
		
		if(str.length()>=3&&str.substring(0,3).equals("not"))
		{
			System.out.println(str);
		}
					
		else
		{
			System.out.println("not "+str);
		}
		return str;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nostring("notbad");
		nostring("Nidhi");
		nostring("bad");
		nostring("d");
		

	}

}
