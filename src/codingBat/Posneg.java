package codingBat;

public class Posneg {
	public static boolean negative(int n1,int n2,boolean negative1)
	{
		if(negative1)
		{
			if(n1<0&&n2<0)
		{
			System.out.println(true);
			return true;
		}
		}
		else
		{
			if(n1<0&&n2>0||n1>0&&n2<0)
			{
				System.out.println(true);
				return true;
				
			}
		}
		System.out.println(false);
		return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		negative(-1,2,false);
		negative(2,-2,false);
		negative(-1,-2,true);
		negative(1,2,true);
		negative(1,2,true);
		negative(-1,-2,false);
		

	}

}
