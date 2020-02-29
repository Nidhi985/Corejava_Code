package jan25;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
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
		else
		{
			System.out.println("Not Prime");
		}
	}

}
