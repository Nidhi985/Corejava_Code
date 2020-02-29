package codingBat;

public class Differencetype2 {
	public static int dif(int n)
	{
	if(n<=21)
	{
		return 21-n;
		
	}
	else
	{
		return 2*(n-21);
	
	}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dif(19));
		System.out.println(dif(20));
		System.out.println(dif(22));
	}

}
