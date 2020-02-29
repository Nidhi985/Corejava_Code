package codingBat;

public class Icyhot {
	public static boolean icyHot(int n1,int n2)
	{
		if(n1<0&& n2>100||n2<0&& n1>100)
		{
			
			System.out.println("true");
			return true;
		}
		else
		{
			System.out.println("false");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		icyHot(10,20);
		icyHot(-1,101);
		icyHot(201,-101);
		icyHot(0,200);
			}

}
