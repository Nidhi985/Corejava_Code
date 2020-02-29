package codingBat;

public class In1020 {
	public static boolean inclusive(int n1,int n2)
	{
		if(n1>=10&&n1<=20||n2>=10&&n2<=20)
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
		inclusive(10,21);
		inclusive(9,20);
		inclusive(10,19);
		inclusive(9,22);

	}

}
