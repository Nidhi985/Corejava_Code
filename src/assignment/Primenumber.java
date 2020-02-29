package assignment;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12221;
		int x1=12221;
		int y;
		int z=0;
		while(x!=0)
		{
			y=x%10;
			z=z*10;
			z=z+y;
			x/=10;
		}
		if(x1==z)
		{
			System.out.println("The number is a palindrome");
		}
		else
		{
			System.out.println("The number is a not a palindrome");
		}

	}

}
