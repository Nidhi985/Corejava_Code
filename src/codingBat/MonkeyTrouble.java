package codingBat;

public class MonkeyTrouble {
	public static boolean Monkey(boolean aSmile,boolean bSmile)
	{
		if(aSmile==bSmile)
		{
			return true;
			
		}
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Monkey(true,true));
		System.out.println(Monkey(false,false));
		System.out.println(Monkey(true,false));
		System.out.println(Monkey(false,true));
		
		

	}

}
