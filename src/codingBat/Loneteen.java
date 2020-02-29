package codingBat;

public class Loneteen { 
	public static boolean teen(int a ,int b)
	{
		boolean aTeen=a>=13&&a<=19;
		boolean bTeen=b>=13&&b<=19;
		
		if(aTeen&&!bTeen||!aTeen&&bTeen)
		{
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
teen(13,13);
teen(13,10);
teen(8,18);
teen(0,0);
	}

}
