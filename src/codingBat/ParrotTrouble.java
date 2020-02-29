package codingBat;

public class ParrotTrouble {
	public static boolean trouble(boolean talking,int hour)
	{
		if(talking&&(hour<7||(hour>20&&hour<=23)))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	System.out.println(trouble(true,6));	
	System.out.println(trouble(true,24));
	System.out.println(trouble(false,20));
	System.out.println(trouble(true,20));

	}

}
