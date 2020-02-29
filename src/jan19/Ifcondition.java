package jan19;

public class Ifcondition {
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		int z=30;
		if(x<y) {
			System.out.println( "x is less than y");
			if(x<z)
			{
				System.out.println( "x is less than z as well");
			}
			
		}
		if (x>z)
		{
			System.out.println( "x is greater than z");
		}
		if((x<y)&&(x<z)) {
			System.out.println( "x is less than y as well as Z");
		}
		if(x>y)
		{
			System.out.println( "x is greater than y");
		}
		else
		{
			System.out.println( "x is smaller than y");
		}
	}

}
