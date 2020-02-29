package codingBat;

public class Teen {
	public static boolean haveteen(int a,int b,int c)
	{
		if(a>=13&&a<=19||b>=13&&b<=19||c>=13&&c<=19)
		{
			System.out.println(true);
			return true;
		}
		else
		{
			System.out.println(false);
			return false;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		haveteen(10,20,14);
		haveteen(14,20,10);
		haveteen(13,13,14);
		haveteen(0,2,1);

	}

}
