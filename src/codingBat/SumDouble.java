package codingBat;

public class SumDouble {
	public static int sum(int a,int b)
	{
		int Sum=a+b;
		if(a==b)
		{
			Sum=2*Sum;
			
		}
		System.out.println(Sum);
		return Sum;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,2);
		sum(2,2);
		sum(3,4);

	}

}
