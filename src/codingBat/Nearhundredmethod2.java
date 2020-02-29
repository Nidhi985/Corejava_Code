package codingBat;

public class Nearhundredmethod2 {
	public static boolean hundred(int n)
	{
		
		
		if(Math.abs(100-n)<=10||Math.abs(200-n)<=10)
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
