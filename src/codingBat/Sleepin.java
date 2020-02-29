package codingBat;

public class Sleepin {
	
		public static boolean sleepin(boolean Weekday,boolean Vacation)
		{
			if(!Weekday||Vacation)
			{
				return true;
		    }
		
				return false;
		}
		public static void main(String[] args)
		{
			System.out.println(sleepin(false,false));
			System.out.println(sleepin(true,true));
			System.out.println(sleepin(true,false));
			
		}

	
		
}
