package codingBat;

public class Difference {
	public static void dif(int n)
	{
		if(n<=21)
		{
			int diff= 21-n;
			System.out.println(diff);
		}
		else
		{
			int diff=2*(n-21);
			System.out.println(diff);
		}
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dif(19);
		dif(21);
		dif(30);
		dif(1);
		dif(2);

		
	}

}
