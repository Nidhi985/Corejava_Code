package jan19;

public class Ifelseexample {
	public static void main(String[] args)
	{
		int x=10;
		int y=50;
		int z=30;
		/*if(x>y&&x>z)
		{
			System.out.println("X is greater than y and Z");
		}
		if(y>x && y>z)
		{
			System.out.println("Y is greater than x ansd Z");
		}
		if(z>x && z>y)
		{
			System.out.println("Z is greater than x ansd Y");
		}*/
		if(x>y&&x>z)
		{
			System.out.println("X is greater than y and Z");
		}
		else if(y>z)
		{
			System.out.println("Y is greater than x ansd Z");
		}
		else 		{
			System.out.println("Z is greater than x and Y");
		}
		
		
	}

}
