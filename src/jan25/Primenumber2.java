package jan25;

public class Primenumber2 {
	public static void main(String[] args)
	{
		for(int num=1; num<=10;num++)
		{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The number is prime:"+num);
		}
		}
		
	}

}
