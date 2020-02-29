package codingBat;

public class Or35 {
	public static boolean number(int num)
	
	{
		if((num%3==0)||(num%5==0))
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
number(12);
number(12);
number(10);
number(8);
number(0);

	}

}
