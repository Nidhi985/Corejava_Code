package codingBat;

public class NearHundred {
	public static boolean hundred(int n)
	{
		if((n>=90&&n<=110)||(n>=190&&n<=210))
		{
			System.out.println(true);
			return true;
			
		}
		System.out.println(false);
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hundred(99);
		hundred(191);
		hundred(201);
		hundred(209);
		hundred(300);

	}

}
